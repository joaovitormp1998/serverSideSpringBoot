package com.example.provap220211.model.respository;

import com.example.provap220211.model.entity.Installments;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class InstallmentsMapper implements RowMapper<Installments> {

    @Override
    public Installments mapRow(ResultSet result, int i) throws SQLException {
        Installments installments = new Installments();
        installments.setCodigo(result.getInt("codigo"));
        installments.setQtd(result.getInt("qtd"));
        installments.setValue(result.getFloat("value"));
        return installments;

    }
}
