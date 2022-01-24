package com.project.math.project.controller;

import com.project.math.project.Service.BaskharaService;
import com.project.math.project.Service.BaskharaServiceImpl;
import com.project.math.project.exception.NegativeDeltaException;
import com.project.math.project.model.Equation;
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

    @GetMapping
    public ResponseEntity<Equation> getResolution(
            @RequestParam(value = "a") Double a, @RequestParam(value = "b") Double b,
            @RequestParam(value = "c") Double c) throws NegativeDeltaException {

        Equation equation = new Equation();
        BaskharaServiceImpl baskharaServiceImpl = new BaskharaServiceImpl();

        baskharaServiceImpl.calulaEquacaoDoSegundoGrau(a, b, c);


        return new ResponseEntity<Equation>(equation, HttpStatus.OK);
    }
}
