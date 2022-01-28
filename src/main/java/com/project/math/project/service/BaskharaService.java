package com.project.math.project.service;

import com.project.math.project.model.Equation;


public interface BaskharaService {

    Equation calulaEquacaoDoSegundoGrau(Double a, Double b, Double c);

    Equation create(Equation equation);
}
