package com.project.math.project.model;

import javax.validation.constraints.NotBlank;

public class Equation {

   private Double x1;

   private Double x2;

   public Double getX1() {
      return x1;
   }

   public void setX1(Double x1) {
      this.x1 = x1;
   }

   public Double getX2() {
      return x2;
   }

   public void setX2(Double x2) {
      this.x2 = x2;
   }
}
