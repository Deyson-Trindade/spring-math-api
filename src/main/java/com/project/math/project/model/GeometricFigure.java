package com.project.math.project.model;

import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.util.UUID;

@DynamicInsert
@Entity
@Table(name = "geometric_figure")
public class GeometricFigure extends Operation {

    @Id
    @GeneratedValue
    @Column(name = "id", unique = true, nullable = false)
    private UUID id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "raio", nullable = false)
    private Double raio;

    @Column(name = "altura", nullable = false)
    private Double altura;

    @Column(name = "unidade", nullable = false)
    private String unidade;

    @Column(name = "resultado", nullable = false)
    private String resultado;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
