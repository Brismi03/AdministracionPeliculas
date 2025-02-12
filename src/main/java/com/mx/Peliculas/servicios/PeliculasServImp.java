package com.mx.Peliculas.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.Peliculas.dominio.Peliculas;
import com.mx.Peliculas.dao.PeliculasDao;

@Service
public class PeliculasServImp implements PeliculasServ {
	
	@Autowired
	PeliculasDao peliculasDao;
	@Override
	public void guardar(Peliculas peliculas) {
		// TODO Auto-generated method stub
		peliculasDao.save(peliculas); 
		
	}

	@Override
	public void editar(Peliculas peliculas) {
		// TODO Auto-generated method stub
		peliculasDao.save(peliculas); 
	}

	@Override
	public void eliminar(Peliculas peliculas) {
		// TODO Auto-generated method stub
		peliculasDao.delete(peliculas);
	}

	@Override
	public Peliculas buscar(Long id) {
		// TODO Auto-generated method stub
		return peliculasDao.findById(id).orElse(null); 
	}

	@Override
	public List<Peliculas> listar() {
		// TODO Auto-generated method stub
		return peliculasDao.findAll();
	}

	@Override
	public List<Peliculas> Nombre(Peliculas peliculas) {
		// TODO Auto-generated method stub
		return peliculasDao.findByNombre(peliculas.getNombre());
	}

	@Override
	public List<Peliculas> Clasificacion(Peliculas peliculas) {
		// TODO Auto-generated method stub
		return peliculasDao.findByClasificacion(peliculas.getClasificacion());
	}
	
	
	

}
