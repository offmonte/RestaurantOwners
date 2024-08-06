package com.project.restaurantowners.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.restaurantowners.model.ItemMenu;

public interface ItemMenuRepository extends JpaRepository<ItemMenu, Long>{

}
