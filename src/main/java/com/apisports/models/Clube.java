package com.apisports.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Clube implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;

    @NotEmpty
    private String nome;

    @NotNull
    @NotEmpty(message = "Infome a imagem logo do clube")
    private String imagem;
    private String estado;
    private String fundacao;
    private String estadio;

    @NotEmpty
    private String pais;

    @OneToMany(fetch = FetchType.EAGER, orphanRemoval = true)
    @JoinColumn(name = "clube_id")
    private List<Jogador> jogadores;
}
