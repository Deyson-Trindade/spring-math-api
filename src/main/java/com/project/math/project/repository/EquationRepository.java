package com.project.math.project.repository;

import com.project.math.project.model.Equation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EquationRepository extends JpaRepository<Equation, UUID> {
}
