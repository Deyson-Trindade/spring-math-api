package com.project.math.project.resources;


import com.project.math.project.model.Equation;
import com.project.math.project.service.BaskharaService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BaskharaTest {

    @Autowired
    BaskharaService baskharaService;

    Equation equation;

    @Test
    void resolve() {

       equation = baskharaService.calulaEquacaoDoSegundoGrau(-1D, -2D, 2D);

       Assertions.assertNotNull(equation);

    }
}
