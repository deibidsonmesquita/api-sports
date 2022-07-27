package com.apisports.models;

import com.apisports.utils.CampeonatoStatus;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class Campeonato {
    @Id
    @GeneratedValue
    private Integer id;

    @NotEmpty
    private String descricao;
    private String tipo;
    private String logo;
    private int ano;
    private String serie;

    @NotNull
    private int rodadas;

    @Enumerated(EnumType.STRING)
    private CampeonatoStatus status;
}
