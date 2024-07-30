package com.jordan.frases_aleatorias.service;

//import com.jordan.frases_aleatorias.dto.FraseDTO;
import com.jordan.frases_aleatorias.model.Frase;
import com.jordan.frases_aleatorias.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {
    @Autowired
    private FraseRepository fraseRepository;

    public Frase getRandomFrase(){
        Frase frase = fraseRepository.findRandomFrase();
        if (frase == null) {
            throw new RuntimeException("Nenhuma frase encontrada!");
        }
        return frase;
    }
}
