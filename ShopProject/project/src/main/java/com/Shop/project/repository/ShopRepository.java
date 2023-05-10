package com.Shop.project.repository;

import com.Shop.project.entity.ShopEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ShopRepository extends JpaRepository<ShopEntity, Long> {
}

