package com.apisports.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
@Entity
@NoArgsConstructor
public class Jogador implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;

    @Type(type = "org.hibernate.type.YesNoType") // Y/N
    private Boolean titular;

    @NotEmpty
    private String nome;

    @NotEmpty
    private String posicao;

    @NotEmpty
    @Min(value = 18, message = "Idade deve ser maior que 17 anos")
    private int idade;
}
