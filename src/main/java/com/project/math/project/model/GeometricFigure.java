package com.project.math.project.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Data
@Entity
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

}
