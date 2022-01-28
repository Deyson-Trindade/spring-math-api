package com.project.math.project.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Data
public class Equation extends Operation {

   @Id
   @GeneratedValue
   @Column(name = "id", unique = true, nullable = false)
   private UUID id;

   @Column(name = "x1", nullable = false)
   private Double x1;

   @Column(name = "x2", nullable = false)
   private Double x2;

   @Column(name = "a", nullable = false)
   private Double a;

   @Column(name = "b", nullable = false)
   private Double b;

   @Column(name = "c", nullable = false)
   private Double c;
}
