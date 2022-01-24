package com.project.math.project;

import com.project.math.project.Service.VolumeService;
import com.project.math.project.model.Volume;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.Order;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ProjectApplicationTests {

	VolumeService volumeService;

	@Test
	@Order(1)
	void resolveEquacao() {

		Volume volume = new Volume();

		volume.setNome("cilindro");
		volume.setAltura(Double.valueOf(10));
		volume.setRaio(Double.valueOf(5));
		volume.setUnidade("metro");

		//Assert.assertNotNull(volumeService.calculaVolume(volume));



		}




}
