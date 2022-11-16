package com.ing.payment.market.controller.dto;

;
import java.time.LocalDateTime;

public class AddBagDTO {
    private int numberOfApples;
    private String supplier;
    private LocalDateTime packedTime;
    private int price;

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
