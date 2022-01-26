package com.project.math.project.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class GeometricFigureRequest {

    @NotBlank
    private String nome;

    @NotNull
    private Double raio;

    @NotNull
    private Double altura;

    @NotBlank
    private String unidade;

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
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
