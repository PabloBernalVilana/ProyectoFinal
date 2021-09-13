package app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.dto.Contenido;
import app.service.ContenidoServiceImpl;

@RestController
@RequestMapping("/api")

public class ContenidoController {
	@Autowired
	ContenidoServiceImpl contenidoServiceImpl;
	
	@GetMapping("/contenidos")
	public List<Contenido> listarContenidos() {
		return contenidoServiceImpl.listarContenidos();
	}
	
	@PostMapping("/contenidos")
	public Contenido salvarContenido(@RequestBody Contenido contenido) {
		return contenidoServiceImpl.guardarContenido(contenido);
	}
	
	@GetMapping("/contenidos/{contenido_id}")
	public Contenido contenidoXID(@PathVariable(name="contenido_id") Long contenido_id) {
		
		Contenido contenido_xid = new Contenido();
		
		contenido_xid = contenidoServiceImpl.contenidoXID(contenido_id);
		
		System.out.println("Contenido XID: " + contenido_xid);
		
		return contenido_xid;
	}
	
	@PutMapping("/contenidos/{contenido_id}")
	public Contenido actualizarContenido(@PathVariable(name="contenido_id")Long contenido_id,@RequestBody Contenido contenido) {
		
		Contenido contenido_seleccionado= new Contenido();
		Contenido contenido_actualizado= new Contenido();
		
		contenido_seleccionado= contenidoServiceImpl.contenidoXID(contenido_id);
		
		contenido_seleccionado.setName(contenido.getName());
		contenido_seleccionado.setPath(contenido.getPath());
		contenido_seleccionado.setExtension(contenido.getExtension());
		contenido_seleccionado.setGestion(contenido.getGestion());
		
		contenido_actualizado = contenidoServiceImpl.actualizarContenido(contenido_seleccionado);
		
		System.out.println("El contenido actualizado es: "+ contenido_actualizado);
		
		return contenido_actualizado;
	}
	
	@DeleteMapping("/contenidos/{contenido_id}")
	public void eliminarContenido(@PathVariable(name="contenido_id")Long contenido_id) {
		contenidoServiceImpl.eliminarContenido(contenido_id);
	}
}
