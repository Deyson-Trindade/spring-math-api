package com.project.math.project.controller;

import com.project.math.project.model.Equation;
import com.project.math.project.model.GeometricFigure;
import com.project.math.project.service.BaskharaService;
import com.project.math.project.service.GeometricFigureService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/math/list")
@AllArgsConstructor
public class OperationController {

    final BaskharaService baskharaService;
    final GeometricFigureService geometricFigureService;

    @GetMapping("/geometricFigure")
    public List<GeometricFigure> getAllGeometricFigureMeasurements() {
        return geometricFigureService.findAll();
    }


    @GetMapping("/get/geometricFigure{nome}")
    public List<GeometricFigure> getAllSimilar(@RequestParam("nome") String nome) {
        return geometricFigureService.findByNome(nome);
    }


    @GetMapping("/equation")
    public List<Equation> list() {
        return baskharaService.findAll();
    }

    @GetMapping("/get/a{a}")
    public List<Equation> getAllA(@RequestParam("a") Double a) {
        return baskharaService.findByA(a);
    }


    @GetMapping("/get/b{b}")
    public List<Equation> getAllB(@RequestParam("b") Double b) {
        return baskharaService.findByB(b);
    }
}
