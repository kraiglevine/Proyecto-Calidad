package com.grupo4.demo.models.entity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.grupo4.demo.models.entity.Proveedores;
import com.grupo4.demo.models.entity.DAO.IProveedorDAO;

@Service
public class ProveedoresServiceImpl implements IProveedoresService{
	
	@Autowired
	private IProveedorDAO proveedorDAO;

	@Override
	@Transactional(readOnly = true)
	public List<Proveedores> findall() {
		// TODO Auto-generated method stub
		return (List<Proveedores>) proveedorDAO.findAll();
	}

	@Override
	@Transactional
	public void save(Proveedores proveedores) {
		// TODO Auto-generated method stub
		proveedorDAO.save(proveedores);
	}

	@Override
	@Transactional(readOnly = true)
	public Proveedores findOne(Long idProveedores) {
		// TODO Auto-generated method stub
		return proveedorDAO.findById(idProveedores).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long idProveedores) {
		// TODO Auto-generated method stub
		proveedorDAO.deleteById(idProveedores);
	}
	

}
