package com.mx.Peliculas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.mx.Peliculas.servicios.PeliculasServ;
import com.mx.Peliculas.dominio.Peliculas;

@RestController 
@RequestMapping("/PeliculasWs")
@CrossOrigin 
public class PeliculasWs {

	@Autowired 
	PeliculasServ peliculasServ; 
	//http://localhost:9000/PeliculasWs/listar
	@GetMapping("/listar")
	public List<Peliculas>listar(){
		var lista = peliculasServ.listar();
		return lista;
	}
	//http://localhost:9000/PeliculasWs/buscar
	@PostMapping("buscar")
	public Peliculas buscar(@RequestBody Long id) {
		Peliculas pelicula = peliculasServ.buscar(id); 
		return pelicula; 
	}
	//http://localhost:9000/PeliculasWs/guardar
	@PostMapping("guardar")
	public void guardar(@RequestBody Peliculas peliculas) {
		peliculasServ.guardar(peliculas);
	}
	//http://localhost:9000/PeliculasWs/editar
	@PostMapping("editar")
	public void editar(@RequestBody Peliculas peliculas) {
		peliculasServ.editar(peliculas);
	}
	//http://localhost:9000/PeliculasWs/eliminar
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Peliculas peliculas) {
		peliculasServ.eliminar(peliculas);
	}
	
	@PostMapping("buscarByNombre")
	public List<Peliculas>buscarByNombre(@RequestBody Peliculas peliculas){
		var lista = peliculasServ.Nombre(peliculas);
		return lista;
	}
	@PostMapping("buscarByClasificacion")
	public List<Peliculas>buscarByClasificacion(@RequestBody Peliculas peliculas){
		var lista = peliculasServ.Clasificacion(peliculas);
		return lista;
	}
}
