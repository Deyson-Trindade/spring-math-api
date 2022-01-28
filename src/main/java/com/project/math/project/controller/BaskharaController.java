package com.project.math.project.controller;

import com.project.math.project.dto.BaskharaResponse;
import com.project.math.project.service.BaskharaService;
import com.project.math.project.exception.NegativeDeltaException;
import com.project.math.project.model.Equation;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/math/baskhara")
public class BaskharaController {

    @Autowired
    BaskharaService baskharaService;



    @GetMapping
    public ResponseEntity<BaskharaResponse> getResolution(
            @RequestParam(value = "a") Double a, @RequestParam(value = "b") Double b,
            @RequestParam(value = "c") Double c) throws NegativeDeltaException {

        final BaskharaResponse baskharaResponse = new BaskharaResponse();

        Equation equation = baskharaService.calulaEquacaoDoSegundoGrau(a, b, c);

        baskharaService.create(equation);


        baskharaResponse.setX1(equation.getX1());
        baskharaResponse.setX2(equation.getX2());

        return new ResponseEntity<BaskharaResponse>(baskharaResponse, HttpStatus.OK);
    }
}
