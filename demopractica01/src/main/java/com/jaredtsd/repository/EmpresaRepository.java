package com.jaredtsd.repository;



	import java.util.Optional;

	import org.springframework.data.jpa.repository.JpaRepository;

	import com.jaredtsd.modell.Empresa;

	public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
		Empresa findById(long id);
		//Empresa findByRazon_social();
		
	    Optional<Empresa> findByRazon_social(String razon_social);
	    //Users findByName(String name);
	}

	

