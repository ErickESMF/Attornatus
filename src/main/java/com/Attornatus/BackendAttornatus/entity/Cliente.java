package com.Attornatus.BackendAttornatus.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Calendar;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long    id;

    @Column(name = "nome", nullable = false)
    private String  nome;

    @Column(name = "cpf", nullable = false)
    private String  cpf;


    @Column(name = "data")
    private String data;

    @Column(name = "logradouro")
    private String  logradouro;

    @Column(name = "numerocasa")
    private int     numeroCasa;

    @Column(name = "cep")
    private int     cep;

    @Column(name="cidade")
    private String  cidade;
}
