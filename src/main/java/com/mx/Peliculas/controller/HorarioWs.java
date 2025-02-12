package com.mx.Peliculas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.Peliculas.dominio.Horario;
import com.mx.Peliculas.servicios.HorarioServ;

@RestController
@RequestMapping("/HorarioWs")
@CrossOrigin 
public class HorarioWs {

	@Autowired 
	HorarioServ horarioServ; 
	
	//http://localhost:9000/HorarioWs/listar
	@GetMapping("listar")
	public List<Horario>listar(){
		var lista = horarioServ.listar(); 
		return lista; 
	}
	//http://localhost:9000/HorarioWs/buscar
	@PostMapping("buscar")
	public Horario buscar(@RequestBody Long id) {
		Horario horario = horarioServ.buscar(id); 
		return horario; 
	}
	//http://localhost:9000/HorarioWs/guardar
	@PostMapping("guardar")
	public void guardar(@RequestBody Horario horario) {
		horarioServ.guardar(horario);
	}
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Horario horario) {
		horarioServ.eliminar(horario);
	}
	
	//http://localhost:9000/HorarioWs/editar
	@PostMapping("editar")
	public void editar(@RequestBody Horario horario) {
		horarioServ.editar(horario);
	}
}
