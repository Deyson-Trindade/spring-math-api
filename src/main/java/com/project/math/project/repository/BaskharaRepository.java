package com.project.math.project.repository;

import com.project.math.project.model.Equation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface BaskharaRepository extends JpaRepository<Equation, UUID> {

    @Query(value = "SELECT * FROM equation WHERE a = :a", nativeQuery = true)
    List<Equation> findByA(@Param("a") Double a);

    @Query("SELECT e FROM Equation e WHERE e.b = :b")
    List<Equation> findByB(@Param("b") Double b);
}
