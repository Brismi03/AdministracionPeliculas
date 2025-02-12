package com.mx.Peliculas.servicios;
import java.util.List;
import com.mx.Peliculas.dominio.Horario;

public interface HorarioServ {

	public void guardar(Horario horario); 
	
	public void editar(Horario horario);
	
	public void eliminar(Horario horario); 
	
	public Horario buscar(Long Id); 
	
	public List<Horario>listar(); 
	
}
