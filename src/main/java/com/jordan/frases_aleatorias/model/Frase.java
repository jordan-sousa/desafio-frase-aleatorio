package com.jordan.frases_aleatorias.model;

import jakarta.persistence.*;

import java.util.ServiceLoader;

@Entity
@Table(name = "frases")
public class Frase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(unique = true)
    private String titulo;
    private String frase;
    private String personagem;
    private String poster;

    public Frase(){};

    public Frase(Long id, String titulo, String frase, String personagem, String poster) {
        this.id = id;
        this.titulo = titulo;
        this.frase = frase;
        this.personagem = personagem;
        this.poster = poster;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String getPersonagem() {
        return personagem;
    }

    public void setPersonagem(String personagem) {
        this.personagem = personagem;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    @Override
    public String toString() {
        return
                "titulo='" + titulo + '\'' +
                        ", frase='" + frase + '\'' +
                        ", personagem='" + personagem + '\'' +
                        ", poster='" + poster + '\'';
    }
}
