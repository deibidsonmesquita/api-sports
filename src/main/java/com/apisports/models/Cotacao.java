package com.apisports.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Cotacao {
    @Id
    @GeneratedValue
    private long id;
    private Double mandante;
    private Double visitante;
    private Double empate;
    private Double gols;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "partida_id")
    private Partida partida;
}
