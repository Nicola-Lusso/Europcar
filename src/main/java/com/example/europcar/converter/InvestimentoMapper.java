package com.example.europcar.converter;

import com.example.europcar.entity.Investimento;
import com.example.europcar.entityDTO.InvestimentoDto;


public class InvestimentoMapper {

    public InvestimentoDto toDto(Investimento investimento){
        InvestimentoDto dto = new InvestimentoDto();

        dto.setNome(investimento.getNome());
        dto.setInvestimenti(investimento.getInvestimenti());


        return dto;
    }
}
