package com.Shop.project.service;
import com.Shop.project.entity.ShopEntity;
import com.Shop.project.repository.ShopRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ShopServiceImpl implements ShopService{
    private ShopRepository shopRepository;
    @Override
    public ShopEntity createShop(ShopEntity shopEntity) {
        return shopRepository.save(shopEntity);
    }

    @Override
    public ShopEntity getshopById(Long shopId) {
        return null;
    }

    @Override
    public List<ShopEntity> getAllshop() {
        return null;
    }

    @Override
    public ShopEntity getShopById(Long shopId) {
        Optional<ShopEntity> optionalShopEntity = shopRepository.findById(shopId);
        return optionalShopEntity.get();
    }

    @Override
    public List<ShopEntity> getAllShop() {

        return shopRepository.findAll();
    }

    @Override
    public ShopEntity updateShop(ShopEntity shopEntity) {
        ShopEntity existingShop = shopRepository.findById(shopEntity.getId()).get();
        existingShop.setCustomername(shopEntity.getCustomername());
        existingShop.setProductInfo(shopEntity.getProductInfo());
        existingShop.setShopingDate(shopEntity.getShopingDate());
        existingShop.setProductCost(shopEntity.getProductCost());
        existingShop.setStatus(shopEntity.getStatus());
        existingShop.setPaymentMode(shopEntity.getPaymentMode());
        return null;
    }

    @Override
    public void deleteshop(Long shopId) {
       shopRepository.deleteById((shopId));
    }
}
