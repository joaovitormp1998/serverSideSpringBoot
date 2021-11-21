package com.example.provap220211.model.respository;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.example.provap220211.model.entity.Produto;

public class ProdutoMapper implements RowMapper<Produto> {
    @Override
    public Produto mapRow(ResultSet result, int i) throws SQLException {
        Produto produto = new Produto();
        produto.setId(result.getInt("id"));
        produto.setName(result.getString("name"));
        produto.setImg(result.getString("img"));
        produto.setOdPrice(result.getFloat("odPrice"));
        produto.setPrice(result.getFloat("price"));
        produto.setDescription(result.getString("description"));
        produto.setCodigo_installments(result.getInt("codigo_installments"));
        return produto;
    }
}
