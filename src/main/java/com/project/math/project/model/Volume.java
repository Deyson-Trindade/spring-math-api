package com.project.math.project.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Volume {

    @NotBlank
    private String nome;

    @NotNull
    private Double raio;

    private Double altura;

    private Double volume;

    @NotBlank
    private String unidade;

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
}
