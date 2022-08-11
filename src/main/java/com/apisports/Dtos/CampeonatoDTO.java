package com.apisports.Dtos;

import com.apisports.models.Campeonato;
import com.apisports.utils.CampeonatoCategoria;
import com.apisports.utils.CampeonatoStatus;
import lombok.Data;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
public class CampeonatoDTO {

    private Integer id;
    private String descricao;
    private String modalidade;
    private String logo;
    private int ano;
    private String serie;
    private int rodadas;
    private int rodadaAtual;

    @Enumerated(EnumType.STRING)
    private CampeonatoStatus status;

    @Enumerated(EnumType.STRING)
    private CampeonatoCategoria categoria;

    public CampeonatoDTO(Campeonato campeonato) {
        this.id = campeonato.getId();
        this.descricao = campeonato.getDescricao();
        this.modalidade = campeonato.getModalidade();
        this.logo = campeonato.getLogo();
        this.ano = campeonato.getAno();
        this.serie = campeonato.getSerie();
        this.rodadas = campeonato.getRodadas();
        this.rodadaAtual = campeonato.getRodadaAtual();
        this.status = campeonato.getStatus();
        this.categoria = campeonato.getCategoria();

    }

}
