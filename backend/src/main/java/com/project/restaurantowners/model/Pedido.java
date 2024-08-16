package com.project.restaurantowners.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank()
    private String comanda;

    @NotBlank()
    private int observação;

    @NotBlank()
    private Colaborador colaborador;

    @ManyToOne 
    private ItemMenu itemMenu;
}
