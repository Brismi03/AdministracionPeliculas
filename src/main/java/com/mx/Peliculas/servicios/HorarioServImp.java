package com.mx.Peliculas.servicios;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.Peliculas.dao.HorarioDao;
import com.mx.Peliculas.dominio.Horario;

import jakarta.transaction.Transactional;

import com.mx.Peliculas.dao.PeliculasDao;

@Service
@Transactional
public class HorarioServImp implements HorarioServ {
	
	@Autowired
	HorarioDao horarioDao; 
	@Autowired
	PeliculasDao peliculasDao; 
	@Override
	public void guardar(Horario horario) {
		// TODO Auto-generated method stub
		if (horario.getPelicula() == null || horario.getPelicula().getId_pelicula() == 0) {
	        throw new RuntimeException("La película es nula o no tiene ID válido");
	    }
	    horarioDao.save(horario);
	}

	@Override
	public void editar(Horario horario) {
		// TODO Auto-generated method stub
		horarioDao.save(horario); 
		
	}

	@Override
	public void eliminar(Horario horario) {
		// TODO Auto-generated method stub
		horarioDao.delete(horario);
	}

	@Override
	public Horario buscar(Long id) {
		// TODO Auto-generated method stub
		return horarioDao.findById(id).orElse(null); 
	}

	@Override
	public List<Horario> listar() {
		// TODO Auto-generated method stub
		return horarioDao.findAll();
	}

	
}
