package com.Shop.project.service;
import com.Shop.project.entity.ShopEntity;

import java.util.List;
public interface ShopService {
    ShopEntity createShop(ShopEntity shopEntity);

    ShopEntity getshopById(Long shopId);

    List<ShopEntity> getAllshop();

    ShopEntity getShopById(Long shopId);

    List<ShopEntity> getAllShop();

    ShopEntity updateShop(ShopEntity shopEntity);

    void deleteshop(Long shopId);
}
