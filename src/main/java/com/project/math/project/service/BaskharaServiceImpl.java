package com.project.math.project.service;

import com.project.math.project.exception.NegativeDeltaException;
import com.project.math.project.model.Equation;
import com.project.math.project.repository.EquationRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import static java.lang.Math.sqrt;

@Service
@AllArgsConstructor
public class BaskharaServiceImpl implements BaskharaService {

    EquationRepository equationRepository;

    public Equation calulaEquacaoDoSegundoGrau(Double a, Double b, Double c) {

        Equation equation = new Equation();

        double delta = (b * b) + (-4 * a * c);

        if (delta < 0) {
            throw new NegativeDeltaException("Delta menor que zero, a equação não possui raiz reais.");
        }

        double x1 = ((-1 * b) + sqrt(delta)) / (2 * a);
        double x2 = ((-1 * b) - sqrt(delta)) / (2 * a);


        equation.setA(a);
        equation.setB(b);
        equation.setC(c);
        equation.setX1(x1);
        equation.setX2(x2);

        return equation;
    }

    @Override
    public Equation create(Equation equation) {
        return equationRepository.save(equation);
    }

    @Override
    public Page<Equation> findAll(Pageable pageable) {
        return equationRepository.findAll(pageable);
    }
}
