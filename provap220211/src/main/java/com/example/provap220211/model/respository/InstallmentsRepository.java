package com.example.provap220211.model.respository;
import com.example.provap220211.model.entity.Installments;
import org.springframework.jdbc.core.JdbcTemplate;

public class InstallmentsRepository {

    private JdbcTemplate jdbcTemplate;

    public InstallmentsRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Installments buscarInstallments(int codigo) {
        String sql = "select * from installments where codigo = ?";

        return jdbcTemplate.queryForObject(sql, new InstallmentsMapper(), codigo);
    }
}

