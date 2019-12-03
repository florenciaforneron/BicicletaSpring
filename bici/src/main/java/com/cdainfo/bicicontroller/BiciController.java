package com.cdainfo.bicicontroller;
import com.cdainfo.dominio.Bicicleta;
import com.cdainfo.repository.*;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BiciController {
	@Autowired
	BicicletaRepository bicicletaRepository;
	
	@GetMapping("/bicicletas")
	public List<Bicicleta> getAllBicicletas(){
		return bicicletaRepository.findAll();
	}
	
	@GetMapping("/bicicleta/{id}")
	public Optional<Bicicleta> getAllBicicletas(@PathVariable Integer id){
		return bicicletaRepository.findById(id);
		
	}
	
	@GetMapping("/bicicleta/search/{rodado}")
	public List<Bicicleta> getBicicletasByRodado(@PathVariable String rodado){
		return bicicletaRepository.findAllByRodadoLike("%"+rodado+"%");
	}
	
	@PostMapping("/bicicleta/add")
	public Bicicleta create(@RequestBody Bicicleta body){
		return bicicletaRepository.save(body);
	}
	
	@PutMapping("/bicicleta/")
	public Bicicleta update(@RequestBody Bicicleta body){
		return bicicletaRepository.save(body);
	}
	
	@DeleteMapping("/bicicleta/{id}")
	public Bicicleta delete(@PathVariable Integer id){
		Optional<Bicicleta> bici = bicicletaRepository.findById(id);
		if(bici.isPresent()){
			bicicletaRepository.delete(bici.get());
			return bici.get();
		}else {
			return null;
		}
	}

}
