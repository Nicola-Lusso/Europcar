package com.example.europcar.entity;

import lombok.Data;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "HB_INVESTIMENTO")
public class Investimento {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nome_investimento")
    private String nome_investimento;

    @Column(name = "totale_investimento")
    private int totale_investimento;

    @Column(name = "data_investimento")
    private LocalDate data_investimento;

    @ManyToOne
    @JoinColumn(name = "categoria", referencedColumnName = "categoria")
    private Categoria categoria;

}