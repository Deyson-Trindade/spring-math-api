package com.project.math.project.controller;

import com.project.math.project.model.Equation;
import com.project.math.project.model.GeometricFigure;
import com.project.math.project.repository.EquationRepository;
import com.project.math.project.repository.GeometricFigureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/math/list")
public class OperationController {

    @Autowired
    GeometricFigureRepository geometricFigureRepository;

    @Autowired
    EquationRepository equationRepository;

    @GetMapping("/geometricFigure")
    public List<GeometricFigure> getAllGeometricFigureMeasurements() {
        return geometricFigureRepository.findAll();
    }

    @GetMapping("/equation")
    public List<Equation> getAllEquation() {
        return equationRepository.findAll();
    }
}
