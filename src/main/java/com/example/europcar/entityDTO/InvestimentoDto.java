package com.example.europcar.entityDTO;

import lombok.Data;

import java.time.LocalDate;


@Data
public class InvestimentoDto {

    private String nome_investimento;
    private int totale_investimento;
    private LocalDate data_investimento;

}