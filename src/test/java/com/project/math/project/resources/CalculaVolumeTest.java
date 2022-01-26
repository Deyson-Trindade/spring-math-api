package com.project.math.project.resources;

import com.project.math.project.dto.GeometricFigureResponse;
import com.project.math.project.model.GeometricFigure;
import com.project.math.project.service.GeometricFigureService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.Order;


@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculaVolumeTest {

    @Autowired
    GeometricFigureService volumeService;

    @Test
    @Order(1)
    void resolveEquacao() {

        GeometricFigure geometricFigure = new GeometricFigure();

        geometricFigure.setNome("cilindro");
        geometricFigure.setAltura(10D);
        geometricFigure.setRaio(5D);
        geometricFigure.setUnidade("metro");

        String volume = volumeService.calcularVolume(geometricFigure);
        GeometricFigureResponse geometricFigureResponse = new GeometricFigureResponse();
        geometricFigureResponse.setVolume(volume);

        Assertions.assertNotNull(geometricFigureResponse);
        Assertions.assertEquals("785,40", geometricFigureResponse.getVolume());

    }



}
