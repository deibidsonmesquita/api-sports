package com.apisports.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
public class Cotacao implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private Double mandante;
    private Double visitante;
    private Double empate;
    private Double gols;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "partida_id", referencedColumnName = "id")
    @JsonBackReference
    private Partida partida;
}
