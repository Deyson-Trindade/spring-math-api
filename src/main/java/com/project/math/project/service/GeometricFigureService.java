package com.project.math.project.service;

import com.project.math.project.model.GeometricFigure;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface GeometricFigureService {

    String calcularVolume(GeometricFigure geometricFigure);

    GeometricFigure create(GeometricFigure geometricFigure);

    Page<GeometricFigure> findAll(Pageable pageable);
}
