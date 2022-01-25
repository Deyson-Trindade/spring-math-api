package com.project.math.project.controller;

import com.project.math.project.Service.VolumeService;
import com.project.math.project.dto.GeometricFigureRequest;
import com.project.math.project.dto.GeometricFigureResponse;
import com.project.math.project.model.GeometricFigure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/math/volume")
public class FigureGeometricController {

    @Autowired
    @Lazy
    private VolumeService volumeService;

    @PostMapping
    public ResponseEntity<GeometricFigureResponse> getVolume(
            @RequestBody @Valid GeometricFigureRequest geometricFigureRequest) {

        GeometricFigure geometricFigure = new GeometricFigure();
        geometricFigure.setNome(geometricFigureRequest.getNome());
        geometricFigure.setAltura(geometricFigureRequest.getAltura());
        geometricFigure.setRaio(geometricFigureRequest.getRaio());

        final double volume = volumeService.calculaVolume(geometricFigure);

        GeometricFigureResponse geometricFigureResponse = new GeometricFigureResponse();
        geometricFigureResponse.setVolume(volume);

        return new ResponseEntity<GeometricFigureResponse>(geometricFigureResponse, HttpStatus.OK);
    }

}
