package com.mx.Peliculas.dominio;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;

@Entity
@Table(name="horario")
public class Horario {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_horario")
	private Long id_horario; 
	
	@ManyToOne
	@JoinColumn(name = "id_pelicula", referencedColumnName = "id_pelicula", nullable = false) 
	@JsonBackReference
	private Peliculas pelicula;

	@Column
	private LocalDate fecha; 
	@Column
	private String horario;
	
	public Horario() { }


	
//constructor con parametros 
	public Horario(Long id_horario, Peliculas pelicula, LocalDate fecha, String horario) {
		super();
		this.id_horario = id_horario;
		this.pelicula = pelicula;
		this.fecha = fecha;
		this.horario = horario;
	}
	
	@Override
	public String toString() {
		return "Horario [id_horario=" + id_horario + ", pelicula=" + pelicula + ", fecha=" + fecha + ", horario="
				+ horario + "]";
	}

//Funciones
	public Long getId_horario() {
		return id_horario;
	}
	public void setId_horario(Long id_horario) {
		this.id_horario = id_horario;
	}
	public Peliculas getPelicula() {
		return pelicula;
	}
	public void setPelicula(Peliculas pelicula) {
		this.pelicula = pelicula;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	} 
	
	
}
