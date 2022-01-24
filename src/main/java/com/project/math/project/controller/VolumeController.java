package com.project.math.project.controller;

import com.project.math.project.model.Volume;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static java.lang.Math.pow;

import javax.validation.Valid;
import java.util.Locale;

@RestController
@RequestMapping("/api/math/volume")
public class VolumeController {

    @PostMapping
    public ResponseEntity<Volume> getVolume(
            @RequestBody @Valid Volume volume) {

        final Double PI = 3.14;
        Double resultado;

        if (volume.getNome().toLowerCase(Locale.ROOT).equals("cilindro")) {

            resultado = pow(volume.getRaio(), 2)*PI* volume.getAltura();

        } else {

            resultado = (3*pow(volume.getRaio(), 3)*PI)/4;

        }

        volume.setVolume(resultado);

        return new ResponseEntity<Volume>(volume, HttpStatus.OK);
    }


}
