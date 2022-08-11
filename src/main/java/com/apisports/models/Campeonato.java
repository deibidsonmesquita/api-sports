package com.apisports.models;

import com.apisports.utils.CampeonatoCategoria;
import com.apisports.utils.CampeonatoStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class Campeonato implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;

    @NotEmpty
    private String descricao;
    private String modalidade;
    private String logo;
    private int ano;
    private String serie;

    @NotNull
    private int rodadas;
    private int rodadaAtual;

    @OneToMany(mappedBy = "campeonato", targetEntity = Partida.class, cascade = CascadeType.ALL, orphanRemoval = true)
    //@JoinColumn(name = "campeonato_id", referencedColumnName = "id")
    private List<Partida> partidas;

    @Enumerated(EnumType.STRING)
    private CampeonatoStatus status;

    @Enumerated(EnumType.STRING)
    private CampeonatoCategoria categoria;
}
