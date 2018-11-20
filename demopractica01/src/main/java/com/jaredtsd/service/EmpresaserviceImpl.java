package com.jaredtsd.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaredtsd.modell.Empresa;
import com.jaredtsd.repository.EmpresaRepository;
@Service

public  class EmpresaserviceImpl implements Empresaservice{
	
	@Autowired
	EmpresaRepository empRepository;

	@Override
	public Empresa findById(long id) {
		
		return empRepository.findById(id);
	}

	@Override
	public Optional<Empresa> findByRazon_social(String razon_social) {
		return empRepository.findByRazon_social(razon_social);
	}
	
	@Override
	public void saveEmp(Empresa emp) {
			empRepository.save(emp);
	}

	@Override
	public void updateEmp(Empresa emp) {
		empRepository.save(emp);
		
	}

	@Override
	public void deleteEmpById(long id) {
		empRepository.deleteById(id);
		
	}

	@Override
	public List<Empresa> findAllEmps() {
	
		return empRepository.findAll();
	}

	@Override
	public void deleteAllEmps() {
		 empRepository.deleteAll();
	}

	@Override
	public boolean isEmpExist(Empresa emp) {
		boolean activo = false;
		activo = !findByRazon_social(emp.getRazon_social()).equals(null);
		return activo;
	}

	
	
}
