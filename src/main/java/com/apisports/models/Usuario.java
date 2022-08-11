package com.apisports.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
@Data
public class Usuario {
    @Id
    @GeneratedValue
    private Long codigo;
    private String login;
    private String senha;
}
