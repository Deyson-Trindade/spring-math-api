package com.project.math.project.service;

import com.project.math.project.model.Equation;

import java.util.List;


public interface BaskharaService {

    Equation calulaEquacaoDoSegundoGrau(Double a, Double b, Double c);

    void create(Equation equation);

    List<Equation> findAll();

    List<Equation> findByA(Double a);

    List<Equation> findByB(Double b);
}
