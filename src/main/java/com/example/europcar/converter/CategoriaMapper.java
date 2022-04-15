package com.example.europcar.converter;

import com.example.europcar.entity.Categoria;


public class CategoriaMapper {

    public CategoriaDto toDto(Categoria categoria){
        CategoriaDto dto = new CategoriaDto();

        dto.setNome(categoria.getNome());
        dto.setInvestimenti(categoria.getInvestimenti());


        return dto;
    }
}
