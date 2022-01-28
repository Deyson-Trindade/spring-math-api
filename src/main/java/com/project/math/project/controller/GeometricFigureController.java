package com.project.math.project.controller;

import com.project.math.project.dto.GeometricFigureRequest;
import com.project.math.project.dto.GeometricFigureResponse;
import com.project.math.project.model.GeometricFigure;
import com.project.math.project.service.GeometricFigureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/math/volume")
public class GeometricFigureController {

    @Autowired
    private GeometricFigureService geometricFigureService;

    @PostMapping
    public ResponseEntity<GeometricFigureResponse> getVolume(
            @RequestBody @Valid GeometricFigureRequest geometricFigureRequest) {

        GeometricFigure geometricFigure = new GeometricFigure();
        geometricFigure.setNome(geometricFigureRequest.getNome());
        geometricFigure.setAltura(geometricFigureRequest.getAltura());
        geometricFigure.setRaio(geometricFigureRequest.getRaio());
        geometricFigure.setUnidade(geometricFigureRequest.getUnidade());

        final String volume = geometricFigureService.calcularVolume(geometricFigure);

        geometricFigureService.create(geometricFigure);

        GeometricFigureResponse geometricFigureResponse = new GeometricFigureResponse();
        geometricFigureResponse.setVolume(volume);

        return new ResponseEntity<GeometricFigureResponse>(geometricFigureResponse, HttpStatus.OK);
    }
}
