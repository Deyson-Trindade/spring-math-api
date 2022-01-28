package com.project.math.project.repository;

import com.project.math.project.model.GeometricFigure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface GeometricFigureRepository extends JpaRepository<GeometricFigure, UUID> {

}
