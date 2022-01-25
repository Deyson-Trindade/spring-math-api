package com.project.math.project.service;

import com.project.math.project.model.GeometricFigure;
import org.springframework.stereotype.Service;

import static java.lang.Math.pow;
import static java.lang.Math.PI;

import java.text.DecimalFormat;

@Service
public class VolumeServiceImpl implements VolumeService {

    private static final DecimalFormat dfZero = new DecimalFormat("0.00");

    @Override
    public String calcularVolume(GeometricFigure geometricFigure) {

        if ("cilindro".equalsIgnoreCase(geometricFigure.getNome())) {
            return dfZero.format(pow(geometricFigure.getRaio(), 2) * PI * geometricFigure.getAltura());
        }
        return dfZero.format((3 * pow(geometricFigure.getRaio(), 3) * PI) / 4);
    }
}
