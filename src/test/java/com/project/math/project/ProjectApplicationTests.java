package com.project.math.project;

import com.project.math.project.Service.BaskharaService;
import com.project.math.project.controller.BaskharaController;
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
	BaskharaService baskharaService;

	@Test
	@Order(1)
	void resolveEquacao() {

		baskharaService.calulaEquacaoDoSegundoGrau(2.0, -4.0, 5.0);


		}




}
