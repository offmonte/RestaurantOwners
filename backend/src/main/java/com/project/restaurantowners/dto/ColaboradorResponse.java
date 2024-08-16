package com.project.restaurantowners.dto;

public record ColaboradorResponse(
    Long id, String nome, String cpf
) {
    public static ColaboradorResponse fromModel(Colaborador colaborador) {
        return new ColaboradorResponse(
            colaborador.getId(),
            colaborador.getNome(),
            colaborador.getCpf()
        );
    }
}
