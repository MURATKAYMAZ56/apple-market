package com.ing.payment.market.controller;

import com.ing.payment.market.controller.dto.AddBagDTO;
import com.ing.payment.market.service.BagService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class MarketController {
    private final BagService bagService;

    public MarketController(BagService bagService) {
        this.bagService = bagService;

    }

    @GetMapping(path = "/bags")
    public Object getAppleBags(@RequestParam(required = false, defaultValue = "3") int numberOfBags) {

        return bagService.getListOfAppleBags(numberOfBags);
    }

    @PostMapping(path = "/bags")
    public ResponseEntity<?> addAppleBag(@RequestBody AddBagDTO payload) {
        bagService.addBag(payload);
        return ResponseEntity.ok().build();

    }


}
