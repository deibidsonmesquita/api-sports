package com.apisports.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
@Data
public class Cliente {
    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty
    private String nome;

   // @CPF(message = "CPF é obrigatório")
    private String cpf;

    @Email(message = "EMAIl é obrigatório")
    private String email;

    @NotEmpty
    private String telefone;

    @NotEmpty
    private String pix;

    @OneToOne(cascade = CascadeType.ALL)
    private Usuario usuario;

}
