package com.example;

import io.micronaut.cache.annotation.Cacheable;
import io.micronaut.http.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;


@Controller("/cacheBug")
public class HeaderBugController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        Optional<Map<String, Map<String, Number>>> testResult = testCache("usd", List.of("an-id-with-hypen"));
        return "Example Response";
    }

    @Cacheable(value = "testeo", parameters = "currency")
    public Optional<Map<String, Map<String, Number>>> testCache(String currency, List<String> selectedCoinsIds) {

        Map<String, Map<String, Number>> priceByCoin = new HashMap<>();
        Map<String, Number> currenNumMap = new HashMap<>();
        currenNumMap.put("usd", 1);
        priceByCoin.put("an-id-with-hypen", currenNumMap);

        return Optional.of(priceByCoin);
    }
}