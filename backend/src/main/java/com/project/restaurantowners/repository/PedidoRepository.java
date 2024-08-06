package com.project.restaurantowners.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.restaurantowners.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{

}
