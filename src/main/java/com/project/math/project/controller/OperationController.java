package com.project.math.project.controller;

import com.project.math.project.model.Equation;
import com.project.math.project.model.GeometricFigure;
import com.project.math.project.service.BaskharaService;
import com.project.math.project.service.GeometricFigureService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/math/list")
@AllArgsConstructor
public class OperationController {

    final BaskharaService baskharaService;
    final GeometricFigureService geometricFigureService;

    @GetMapping("/geometricFigure")
    public Page<GeometricFigure> getAllGeometricFigureMeasurements(@Valid Pageable pageable) {
        return geometricFigureService.findAll(pageable);
    }

    @GetMapping("/equation")
    public Page<Equation> list(@Valid Pageable pageable) {
        return baskharaService.findAll(pageable);
    }
}
