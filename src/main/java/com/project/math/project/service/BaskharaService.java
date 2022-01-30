package com.project.math.project.service;

import com.project.math.project.model.Equation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface BaskharaService {

    Equation calulaEquacaoDoSegundoGrau(Double a, Double b, Double c);

    Equation create(Equation equation);

    Page<Equation> findAll(Pageable pageable);
}
