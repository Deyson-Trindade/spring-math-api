package com.project.math.project.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class GeometricFigureRequest {

    @NotBlank
    private String nome;

    @NotNull
    private Double raio;

    @NotNull
    private Double altura;

    @NotBlank
    private String unidade;

}
