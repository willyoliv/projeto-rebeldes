package com.oliveira.willy.app.domain;

import com.oliveira.willy.app.enums.Raca;
import lombok.Data;

@Data
public class Rebelde {
    private String nome;
    private Raca raca;
    private int idade;
}
