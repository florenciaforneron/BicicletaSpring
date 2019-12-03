package com.cdainfo.repository;
import com.cdainfo.dominio.*;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BicicletaRepository extends JpaRepository<Bicicleta, Integer> {

	List<Bicicleta> findAllByRodadoLike(String rodado);
	List<Bicicleta> findAllByRodadoLikeOrPrecioLike(String rodado, Double precio);
	
}
