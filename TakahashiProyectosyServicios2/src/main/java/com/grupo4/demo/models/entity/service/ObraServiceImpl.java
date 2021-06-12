package com.grupo4.demo.models.entity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.grupo4.demo.models.entity.Obra;
import com.grupo4.demo.models.entity.DAO.IObraDAO;

@Service
public class ObraServiceImpl implements IObraService{

	@Autowired
	private IObraDAO obraDAO;
	
	@Override
	@Transactional(readOnly = true)
	public List<Obra> findall() {
		// TODO Auto-generated method stub
		return (List<Obra>) obraDAO.findAll();
	}

	@Override
	@Transactional
	public void save(Obra obra) {
		// TODO Auto-generated method stub
		obraDAO.save(obra);
	}

	@Override
	@Transactional(readOnly = true)
	public Obra findOne(Long idObra) {
		// TODO Auto-generated method stub
		return obraDAO.findById(idObra).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long idObra) {
		// TODO Auto-generated method stub
		obraDAO.deleteById(idObra);
	}

	
	
	
}
