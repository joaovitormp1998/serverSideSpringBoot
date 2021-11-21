package com.example.provap220211.model.respository;
import com.example.provap220211.model.entity.Installments;
import com.example.provap220211.model.entity.Produto;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;

public class ProdutoRepository {

    private JdbcTemplate jdbcTemplate;
    private InstallmentsRepository installmentsRepository;

    public ProdutoRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        this.installmentsRepository = new InstallmentsRepository(jdbcTemplate);

    }

    public List<Produto> listarTodos() {
        String sql = "select * from produto";
        List<Produto> produtoList = jdbcTemplate.query(sql, new ProdutoMapper());
        produtoList.forEach(produto -> {
            Installments installments = installmentsRepository.buscarInstallments(produto.getCodigo_installments());
            produto.setInstallments(installments);
        });
        return produtoList;
    }
}