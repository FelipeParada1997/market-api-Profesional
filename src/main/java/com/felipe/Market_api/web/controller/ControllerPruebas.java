package com.felipe.Market_api.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ControllerPruebas {

    @GetMapping()
    public String pruebas() {
        return "Pruebas de Spring Boot con Java 17 y Maven";
    }
}
