package com.jaredtsd.service;


	import java.util.List;
	import java.util.Optional;

	import com.jaredtsd.modell.Empresa;

	public interface Empresaservice {
		
		Empresa findById(long id);
		
		Optional<Empresa> findByRazon_social(String razon_social);
		
		void saveEmp(Empresa emp);
		
		void updateEmp(Empresa emp);
		
		void deleteEmpById(long id);
		
		List<Empresa> findAllEmps();
		
		void deleteAllEmps();
		
		public boolean isEmpExist(Empresa emp);
	
}
