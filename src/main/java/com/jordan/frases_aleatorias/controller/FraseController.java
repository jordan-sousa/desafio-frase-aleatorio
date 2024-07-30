package com.jordan.frases_aleatorias.controller;

import com.jordan.frases_aleatorias.model.Frase;
import com.jordan.frases_aleatorias.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series/frases")
public class FraseController {
    @Autowired
    private FraseService fraseService;

    @GetMapping
    public Frase getFraseAleatorio(){
        Frase frase = fraseService.getRandomFrase();
        if (frase == null) {
            throw new RuntimeException("Nenhuma frase encontrada!");
        }
        return frase;
    }
}
