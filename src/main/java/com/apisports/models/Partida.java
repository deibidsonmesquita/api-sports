package com.apisports.models;

import com.apisports.utils.SerializeDateFormate;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;


@Data
@Entity
@NoArgsConstructor
public class Partida implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    @Type(type = "org.hibernate.type.YesNoType") // Y/N
    private Boolean aovivo;

    @OneToOne(mappedBy = "partida", orphanRemoval = true, fetch = FetchType.EAGER)
    @JsonManagedReference
    private Cotacao cotacao;

    @OneToOne
    private Clube visitante;

    @JsonSerialize(using = SerializeDateFormate.class)
    private LocalDateTime dataHora;

    private String local;

    @OneToOne
    private Clube mandante;

    @ManyToOne
    @JsonIgnore
    private Campeonato campeonato;
}
