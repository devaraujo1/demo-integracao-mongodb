package com.example.demo_integracao_mongodb.controllers;

import com.example.demo_integracao_mongodb.models.Professor;
import com.example.demo_integracao_mongodb.repositories.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/professores")
public class ProfessorController {
    @Autowired
    private ProfessorRepository professorRepository;

    @PostMapping
    public void gravar(@RequestBody Professor professor) {
        this.professorRepository.save(professor);
    }

    @GetMapping
    public List<Professor> buscarTodos() {
        return this.professorRepository.findAll();
    }

    @GetMapping("/{id}")
    public Professor buscarPorId(@PathVariable String id) {
        return this.professorRepository.findById(id).get();
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable String id, @RequestBody Professor professor) {
        professor.setId(id);
        this.professorRepository.save(professor);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable String id) {
        this.professorRepository.deleteById(id);
    }
}
