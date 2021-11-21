package com.example.provap220211.controller;
import com.example.provap220211.model.entity.Produto;
import com.example.provap220211.model.respository.ProdutoNotFound;
import com.example.provap220211.model.respository.ProdutoRepository;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    private ProdutoRepository produtoRepository;

    public ProdutoController(JdbcTemplate jdbcTemplate) {

        produtoRepository = new ProdutoRepository(jdbcTemplate);
    }

    @ResponseStatus(HttpStatus.OK)
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping()
    public List<Produto> buscar() {
        try {
            return produtoRepository.listarTodos();
        } catch (EmptyResultDataAccessException e) {
            throw new ProdutoNotFound();

        }
    }
}