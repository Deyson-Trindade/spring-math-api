package com.project.math.project.controller;

import com.project.math.project.dto.GeometricFigureRequest;
import com.project.math.project.dto.GeometricFigureResponse;
import com.project.math.project.model.GeometricFigure;
import com.project.math.project.service.GeometricFigureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/math/volume")
public class GeometricFigureController {

    @Autowired
    private GeometricFigureService geometricFigureService;

    @GetMapping("/list")
    public List<GeometricFigure> getAllGeometricFigureMeasurements() {
        return geometricFigureService.findAll();
    }

    @PostMapping
    public ResponseEntity<GeometricFigureResponse> getVolume(
            @RequestBody @Valid GeometricFigureRequest geometricFigureRequest) {

        GeometricFigure geometricFigure = new GeometricFigure();
        geometricFigure.setNome(geometricFigureRequest.getNome());
        geometricFigure.setAltura(geometricFigureRequest.getAltura());
        geometricFigure.setRaio(geometricFigureRequest.getRaio());
        geometricFigure.setUnidade(geometricFigureRequest.getUnidade());

        final String volume = geometricFigureService.calcularVolume(geometricFigure);

        GeometricFigureResponse geometricFigureResponse = new GeometricFigureResponse();
        geometricFigure.setResultado(volume);
        geometricFigureResponse.setVolume(volume);
        geometricFigureService.create(geometricFigure);

        return new ResponseEntity<>(geometricFigureResponse, HttpStatus.OK);
    }
}
