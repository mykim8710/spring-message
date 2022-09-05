package com.example.message.domain.item;

import lombok.Data;

import java.util.List;

@Data
public class Item {

    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;
    private Boolean open;           // 판매여부
    private List<String> regions;   // 등록지역
    private ItemType itemType;      // 상품 종류
    private String deliveryCode;    // 배송 방식

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public Item(String itemName, Integer price, Integer quantity, Boolean open, List<String> regions, ItemType itemType, String deliveryCode) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        this.open = open;
        this.regions = regions;
        this.itemType = itemType;
        this.deliveryCode = deliveryCode;
    }
}