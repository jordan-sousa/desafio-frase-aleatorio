package com.jordan.frases_aleatorias.repository;

import com.jordan.frases_aleatorias.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface FraseRepository extends JpaRepository<Frase, Long> {

    @Query("SELECT f FROM Frase f ORDER BY function ('RANDOM') LIMIT 1")
    Frase findRandomFrase();
}
