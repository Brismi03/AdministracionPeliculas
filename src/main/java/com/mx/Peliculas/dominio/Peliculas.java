package com.mx.Peliculas.dominio;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;
import lombok.Data; 

@Entity 
@Table(name="peliculas")
@Data
public class Peliculas {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pelicula")
	private long id_pelicula; 
	
	@Column
	private String nombre;
	@Column
	private String imagen; 
	@Column
	private String duracion;
	@Column
	private String clasificacion;
	
	@OneToMany(mappedBy = "pelicula", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonManagedReference
	private List<Horario> horarios = new ArrayList<>();

	
	public Peliculas() {
		
	}
	public Peliculas(long id_pelicula, String nombre, String imagen, String duracion, String clasificacion, List<Horario>horarios) {
		super();
		this.id_pelicula = id_pelicula;
		this.nombre = nombre;
		this.imagen = imagen;
		this.duracion = duracion;
		this.clasificacion = clasificacion;
		this.horarios = horarios; 
	}
	@Override
	public String toString() {
		return "Peliculas [id_pelicula=" + id_pelicula + ", nombre=" + nombre + ", imagen=" + imagen + ", duracion="
				+ duracion + ", clasificacion=" + clasificacion + ", horarios=" + horarios + "]";
	}
	public long getId_pelicula() {
		return id_pelicula;
	}
	public void setId_pelicula(long id_pelicula) {
		this.id_pelicula = id_pelicula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	public String getClasificacion() {
		return clasificacion;
	}
	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	} 
	
}
