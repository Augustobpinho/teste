package br.com.pinho.ProjetoFinal.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pinho.ProjetoFinal.model.ProjetoModel;

@Repository
public interface ProjetoFinalRepository extends JpaRepository<ProjetoModel, Long>{	
		
}
