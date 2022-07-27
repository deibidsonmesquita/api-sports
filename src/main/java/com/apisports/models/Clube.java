package com.apisports.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Entity
public class Clube {
    @Id
    @GeneratedValue
    private Integer id;

    @NotEmpty
    private String nome;

    @NotNull
    @NotEmpty(message = "Infome a imagem logo do clube")
    private String imagem;
    private String local;
    private String fundacao;
    private String estadio;

    @NotEmpty
    private String pais;

    @OneToMany(fetch = FetchType.EAGER, orphanRemoval = true)
    @JoinColumn(name = "clube_id")
    private List<Jogador> jogadores;
}
