package com.project.math.project.service;

import com.project.math.project.model.GeometricFigure;
import org.springframework.stereotype.Service;

import static java.lang.Math.pow;
import static java.lang.Math.PI;

@Service
public class VolumeServiceImpl implements VolumeService {

    @Override
    public double calculaVolume(GeometricFigure geometricFigure) {

        if ("cilindro".equalsIgnoreCase(geometricFigure.getNome())) {
            return pow(geometricFigure.getRaio(), 2) * PI * geometricFigure.getAltura();
        }
        return (3 * pow(geometricFigure.getRaio(), 3) * PI) / 4;
    }
}
