package com.TallerTEC.TallerTEC.RESTapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TallerTEC.TallerTEC.Entidades.*;

@RestController
@RequestMapping("Taller")
public class RESTTaller {
	
	List<Cliente> listaC = new ArrayList<Cliente>();
	
	@GetMapping
	@RequestMapping("Cliente")
	public ResponseEntity<List<Cliente>> getCliente(){
		Cliente nCliente = new Cliente();
		nCliente.setNombre("Manuel");
		listaC.add(nCliente);
		return ResponseEntity.ok(listaC);	
	}
	
	@PostMapping
	public ResponseEntity<Cliente> createCliente(@RequestBody Cliente producto){
		Cliente nuevoCliente = producto;
		listaC.add(nuevoCliente);
		return ResponseEntity.ok(nuevoCliente);		
	}

}
