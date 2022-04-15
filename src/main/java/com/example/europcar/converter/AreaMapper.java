package com.example.europcar.converter;

import com.example.europcar.entity.Area;



public class AreaMapper {

    public AreaDto toDto(Area area){
        AreaDto dto = new AreaDto();

        dto.setNome(area.getNome());
        dto.setInvestimenti(area.getInvestimenti());


        return dto;
    }
}
