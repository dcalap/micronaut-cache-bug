package com.example;

import io.micronaut.cache.annotation.Cacheable;
import io.micronaut.runtime.Micronaut;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;


public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }



}