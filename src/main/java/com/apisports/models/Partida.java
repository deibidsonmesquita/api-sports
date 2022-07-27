package com.apisports.models;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;

@Entity
@Data
public class Partida {
    @Id
    @GeneratedValue
    private Long id;

    @Type(type = "org.hibernate.type.YesNoType") // Y/N
    private Boolean aovivo;

    @OneToOne(mappedBy = "partida", orphanRemoval = true)
    private Cotacao cotacao;
    private String mandante;
    private String visitante;
    private LocalDateTime dataHora;
    private String local;

}
