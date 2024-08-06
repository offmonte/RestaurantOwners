package com.project.restaurantowners.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Colaborador {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank()
    private String nome;

    @NotBlank()
    @Size(min = 11)
    private String cpf;

    @NotBlank()
    @Size(min = 6)
    private String senha;
}
