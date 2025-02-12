package com.mx.Peliculas.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.Peliculas.dominio.Peliculas;

public interface PeliculasDao extends JpaRepository<Peliculas, Long>{

	public List<Peliculas> findByNombre(String nombre); 
	
	public List<Peliculas> findByClasificacion(String Clasificacion);
}
