package com.patine.patine_kivy.controle;

import java.util.List;

import com.patine.patine_kivy.model.Exercicio;
import com.patine.patine_kivy.repositorio.RepositorioExercicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercicio")
public class ExercicioControle {

    @Autowired
    private RepositorioExercicio repositorio;
    
    @GetMapping
    public List<Exercicio> listar(){
        return repositorio.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody Exercicio exercicio) {
        repositorio.save(exercicio);
    }

    @PutMapping
    public void editar(@RequestBody Exercicio exercicio) {
        if(exercicio.getId() > 0){
            repositorio.save(exercicio);
        }
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id){
        repositorio.deleteById(id);
    }


}
