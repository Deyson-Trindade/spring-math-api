package com.project.math.project.service;

import com.project.math.project.model.GeometricFigure;

import java.util.List;

public interface GeometricFigureService {

    String calcularVolume(GeometricFigure geometricFigure);

    void create(GeometricFigure geometricFigure);

    List<GeometricFigure> findAll();

    List<GeometricFigure> findByNome(String nome);
}
