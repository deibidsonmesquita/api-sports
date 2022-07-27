package com.apisports.models;

import com.apisports.utils.PalpiteAposta;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
public class Aposta {
    @Id
    @GeneratedValue
    private Long id;
    private BigDecimal valor;
    private BigDecimal retorno;
    private LocalDate data;
   // private Usuario user;
   // private Partida partida;

    private PalpiteAposta palpite;
}
