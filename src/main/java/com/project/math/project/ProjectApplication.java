package com.project.math.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan
public class ProjectApplication {

    public static void main(String[] args) {

		SpringApplication.run(ProjectApplication.class, args);
    }

}
