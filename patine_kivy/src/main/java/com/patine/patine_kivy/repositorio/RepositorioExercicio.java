package com.patine.patine_kivy.repositorio;

import com.patine.patine_kivy.entidades.Exercicio;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioExercicio extends JpaRepository<Exercicio, Long>{
    
}
