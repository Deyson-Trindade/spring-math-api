package com.project.math.project.repository;

import com.project.math.project.model.GeometricFigure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface GeometricFigureRepository extends JpaRepository<GeometricFigure, UUID> {

    @Query("SELECT gf FROM GeometricFigure gf WHERE gf.nome = :nome")
    List<GeometricFigure> findByNome(@Param("nome") String nome);
}
