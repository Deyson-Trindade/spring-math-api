package com.project.math.project;

import com.project.math.project.service.VolumeService;
import com.project.math.project.model.GeometricFigure;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.Order;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ProjectApplicationTests {

	@Autowired
	VolumeService volumeService;

	@Test
	@Order(1)
	void resolveEquacao() {

		GeometricFigure geometricFigure = new GeometricFigure();

		geometricFigure.setNome("cilindro");
		geometricFigure.setAltura(10D);
		geometricFigure.setRaio(5D);
		geometricFigure.setUnidade("metro");

		volumeService.calculaVolume(geometricFigure);

		//Assertions.assertNotNull(geometricFigure.getVolume());



		}




}
