package com.mx.Peliculas.servicios;
import java.util.List;
import com.mx.Peliculas.dominio.Peliculas;

public interface PeliculasServ {

	public void guardar(Peliculas peliculas); 
	
	public void editar(Peliculas peliculas); 
	
	public void eliminar (Peliculas peliculas); 
	
	public Peliculas buscar(Long Id);
	
	public List<Peliculas>listar(); 
	
	public List<Peliculas>Nombre(Peliculas peliculas); 
	
	public List<Peliculas>Clasificacion(Peliculas peliculas);
}
