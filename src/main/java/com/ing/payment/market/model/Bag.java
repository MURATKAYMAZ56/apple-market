package com.ing.payment.market.model;

import java.time.LocalDateTime;
import java.util.Date;

public class Bag {
    private String  id;
    private int numberOfApples;
    private  String supplier;
    private LocalDateTime  packedTime;
    private int price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumberOfApples() {
        return numberOfApples;
    }

    public void setNumberOfApples(int numberOfApples) {
        this.numberOfApples = numberOfApples;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public LocalDateTime getPackedTime() {
        return packedTime;
    }

    public void setPackedTime(LocalDateTime packedTime) {
        this.packedTime = packedTime;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
