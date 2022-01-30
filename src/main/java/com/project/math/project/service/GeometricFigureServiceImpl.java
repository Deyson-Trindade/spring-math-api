package com.project.math.project.service;

import com.project.math.project.model.GeometricFigure;
import com.project.math.project.repository.GeometricFigureRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

@Service
@AllArgsConstructor
public class GeometricFigureServiceImpl implements GeometricFigureService {

    private static final DecimalFormat dfZero = new DecimalFormat("0.00");

    final GeometricFigureRepository geometricFigureRepository;

    @Override
    public String calcularVolume(final GeometricFigure geometricFigure) {

        if ("cilindro".equalsIgnoreCase(geometricFigure.getNome())) {

            return dfZero.format(pow(geometricFigure.getRaio(), 2) * PI * geometricFigure.getAltura());
        }
        return dfZero.format((3 * pow(geometricFigure.getRaio(), 3) * PI) / 4);
    }

    public GeometricFigure create(final GeometricFigure geometricFigure) {
        return geometricFigureRepository.save(geometricFigure);
    }

    @Override
    public Page<GeometricFigure> findAll(Pageable pageable) {
        return geometricFigureRepository.findAll(pageable);
    }
}
