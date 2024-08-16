package com.project.restaurantowners.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record ColaboradorRequest(
    String nome, String cpf, String senha
) {
    public Colaborador toModel() {
    return Colaborador.builder()
        .nome(nome)
        .cpf(cpf)
        .senha(senha)
        .build();
    }
}