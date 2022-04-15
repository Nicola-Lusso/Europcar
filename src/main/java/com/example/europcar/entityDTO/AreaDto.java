package com.example.europcar.entityDTO;

import lombok.Data;

import java.util.List;


@Data
public class AreaDto {

    private String nome;
    private int investimenti;
    private List<String> nomi_investimenti;

}