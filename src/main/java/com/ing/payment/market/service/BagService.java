package com.ing.payment.market.service;

import com.ing.payment.market.controller.dto.AddBagDTO;
import com.ing.payment.market.model.Bag;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class BagService {
    private List<Bag> bagsDataList = new ArrayList<>();
    private String[] suppliers = new String[]{"Royal Gala", "Pink Lady", "Kanzi Apple", "Elstar Apples"};

    public List<Bag> getListOfAppleBags(int desiredNumberOfBags) {

        List<Bag> sortedBagList = bagsDataList.stream().sorted(Comparator.comparing(Bag::getPackedTime).reversed()).collect(Collectors.toList());

        return sortedBagList.stream().limit(desiredNumberOfBags).collect(Collectors.toList());
    }

    public void addBag(AddBagDTO payload) {

        // validation rules
        if (payload.getNumberOfApples() < 1 || payload.getNumberOfApples() > 100) {
            throw new RuntimeException();
        }
        if (payload.getPrice() < 1 || payload.getPrice() > 50) {
            throw new RuntimeException();
        }

        if (Arrays.stream(suppliers).noneMatch(e -> e.equals(payload.getSupplier()))) {
            throw new RuntimeException();
        }

        Bag bag = new Bag();
        bag.setId(UUID.randomUUID().toString());
        bag.setNumberOfApples(payload.getNumberOfApples());
        bag.setSupplier(payload.getSupplier());
        bag.setPackedTime(LocalDateTime.now());
        bag.setPrice(payload.getPrice());

        bagsDataList.add(bag);
    }

}