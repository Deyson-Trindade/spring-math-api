package com.project.math.project.service;

import com.project.math.project.exception.NegativeDeltaException;
import com.project.math.project.model.Equation;
import org.springframework.stereotype.Service;

import static java.lang.Math.sqrt;

@Service
public class BaskharaServiceImpl implements BaskharaService {

    public Equation calulaEquacaoDoSegundoGrau(Double a, Double b, Double c) {

        Equation equation = new Equation();

        double delta = (b.doubleValue() * b.doubleValue()) + (-4 * a.doubleValue() * c.doubleValue());

        if (delta < 0) {
            throw new NegativeDeltaException("Delta menor que zero, a equação não possui raiz reais.");
        }

        double x1 = ((-1 * b.doubleValue()) + sqrt(delta)) / (2 * a.doubleValue());
        double x2 = ((-1 * b.doubleValue()) - sqrt(delta)) / (2 * a.doubleValue());


        equation.setX1(x1);
        equation.setX2(x2);

        return equation;
    }

}
