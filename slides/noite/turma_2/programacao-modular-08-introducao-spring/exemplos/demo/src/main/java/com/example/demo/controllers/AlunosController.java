package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.models.Aluno;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.PersistenceUnit;

@Controller
public class AlunosController {
	
	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;
	

	@PostMapping("/alunos")
	public @ResponseBody Aluno postAluno(@RequestBody Aluno a) {
		var entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(a);
		entityManager.getTransaction().commit();
		entityManager.close();
		
		return a;
	}
	
	@GetMapping("/alunos/{matricula}")
	public @ResponseBody Aluno getAlunoByMatricula(@PathVariable String matricula) {
		var entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		var a = entityManager.find(Aluno.class, matricula);
		entityManager.getTransaction().commit();
		entityManager.close();
		
		return a;
	}
	
	@PutMapping("/alunos/{matricula}")
	public @ResponseBody Aluno updateAlunoByMatricula(@PathVariable String matricula, @RequestBody Aluno a) {
		var entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		var alunoDB = entityManager.find(Aluno.class, matricula);
		alunoDB.setMatricula(a.getMatricula());
		alunoDB.setIdade(a.getIdade());
		alunoDB.setNome(a.getNome());
		entityManager.persist(alunoDB);
		entityManager.getTransaction().commit();
		entityManager.close();
		
		return a;
	}
	
	@DeleteMapping("/alunos/{matricula}")
	public @ResponseBody Aluno deleteAlunoByMatricula(@PathVariable String matricula) {
		var entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		var a = entityManager.find(Aluno.class, matricula);
		entityManager.remove(a);
		entityManager.getTransaction().commit();
		entityManager.close();
		
		return a;
	}
	
}
