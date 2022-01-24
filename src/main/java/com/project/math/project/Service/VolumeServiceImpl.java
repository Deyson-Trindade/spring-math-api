package com.project.math.project.Service;

import com.project.math.project.model.Volume;

import java.util.Locale;

import static java.lang.Math.pow;

public class VolumeServiceImpl implements VolumeService {

    @Override
    public Volume calculaVolume(Volume volume) {

        final Double PI = 3.14;
        Double resultado;

        if (volume.getNome().toLowerCase(Locale.ROOT).equals("cilindro")) {

            resultado = pow(volume.getRaio(), 2) * PI * volume.getAltura();

        } else {

            resultado = (3 * pow(volume.getRaio(), 3) * PI) / 4;

        }

        volume.setVolume(resultado);

        return volume;

    }

}
