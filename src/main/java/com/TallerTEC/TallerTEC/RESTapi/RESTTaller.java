package com.TallerTEC.TallerTEC.RESTapi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TallerTEC.TallerTEC.Entidades.*;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.*;
import com.google.gson.annotations.*;	

@RestController
@RequestMapping("Taller")
public class RESTTaller {
	
	List<Cliente> listaC = new ArrayList<Cliente>();
	String archivoCliente = "C:\\Users\\XPC\\Documents\\GitHub\\TallerTecBD2022\\TallerTEC\\src\\main\\java\\com\\TallerTEC\\TallerTEC\\RESTapi\\Cliente.json";
	
	public static String nameRead;
	
	@GetMapping
	@RequestMapping("Cliente")
	public ResponseEntity<List<Cliente>> getCliente(){

		try {
			JsonElement fileElement = JsonParser.parseReader(new FileReader(archivoCliente));
			
			//Json a objeto
			JsonObject fileObject = fileElement.getAsJsonObject();
			
			System.out.println(fileObject);
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		
		return ResponseEntity.ok(listaC);
				
	}
	
	@PostMapping
	@RequestMapping("Create")
	public ResponseEntity<Cliente> createCliente(@RequestBody Cliente nombre, Cliente apellido1){
		
		try {
	         JsonParser parser = new JsonParser();
	         Object obj = parser.parse(new FileReader(archivoCliente));
	         JsonObject jsonObject = (JsonObject) obj;
	         
	         JsonArray msg = (JsonArray)jsonObject.get("Usuarios");
	         Iterator<JsonElement> iterator = msg.iterator();
	         while(iterator.hasNext()) {
	            nameRead = iterator.next().toString();
	            System.out.println(nameRead);
	         }
	         
	         Cliente cliente = new Cliente();
	         cliente.setNombre("Maria"); //nombre
	         cliente.setApellido1("Maria"); //apellido1
	         cliente.setApellido3("Maria"); //apellido3
	         cliente.setTelefono(2222222); //telefono
	         cliente.setCedula(222222); //cedula
	         cliente.setEmail("Maria"); //email
	         cliente.setDireccion("Maria"); //direccion
	         cliente.setUsario("Maria"); //usuario
	         cliente.setContraseña("Maria"); //contraseña
	         
	         Gson gson = new Gson();
	         String json = gson.toJson(cliente);
	         
	         System.out.println(json);

	         FileWriter file = new FileWriter(archivoCliente, false);
	         JsonWriter jw = new JsonWriter(file);
	         iterator = msg.iterator();
	         Employees Usuarios = new Employees();
	         while(iterator.hasNext()) {
	        	 Usuarios.addEmployee(gson.fromJson(iterator.next().toString(), Cliente.class));
	         }
	         Usuarios.addEmployee(cliente);
	         gson.toJson(Usuarios, Employees.class, jw);
	         file.close();
	         
	      } catch(Exception e) {
	         e.printStackTrace();
	      }
			
		return ResponseEntity.ok(nombre);
				
	}
	
	// Employees class
	class Employees {
	   @Expose
	   List<Cliente> Usuarios = new ArrayList<>();
	   public List<Cliente> getEmployees() {
	      return Usuarios;
	   }
	   public void addEmployee(Cliente nombre) {
	      this.Usuarios.add(nombre);
	   }
	}
	
}
