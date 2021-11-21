package com.example.provap220211.model.respository;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(HttpStatus.NOT_FOUND)

public class ProdutoNotFound extends RuntimeException{
    public  ProdutoNotFound() {
        super("produto não encontrado!");
    }

}
