package com.apisports.models;

import com.apisports.utils.CampeonatoStatus;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

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

    @OneToMany(orphanRemoval = true)
    @JoinColumn(name = "campeonato_id")
    private List<Partida> partidas;

    @Enumerated(EnumType.STRING)
    private CampeonatoStatus status;
}
