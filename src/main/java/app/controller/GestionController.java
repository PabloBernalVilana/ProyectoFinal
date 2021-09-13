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

import app.dto.Gestion;
import app.service.GestionServiceImpl;

@RestController
@RequestMapping("/api")

public class GestionController {
	@Autowired
	GestionServiceImpl gestionServiceImpl;
	
	@GetMapping("/gestiones")
	public List<Gestion> listarGestiones() {
		return gestionServiceImpl.listarGestiones();
	}
	
	@PostMapping("/gestiones")
	public Gestion salvarGestion(@RequestBody Gestion gestion) {
		return gestionServiceImpl.guardarGestion(gestion);
	}
	
	@GetMapping("/gestiones/{gestiones_id}")
	public Gestion gestionXID(@PathVariable(name="gestiones_id") Long gestiones_id) {
		
		Gestion gestion_xid = new Gestion();
		
		gestion_xid = gestionServiceImpl.gestionXID(gestiones_id);
		
		System.out.println("Gestion XID: " + gestion_xid);
		
		return gestion_xid;
	}
	
	@PutMapping("/gestiones/{gestiones_id}")
	public Gestion actualizarGestion(@PathVariable(name="gestiones_id")Long gestiones_id,@RequestBody Gestion gestion) {
		
		Gestion gestion_seleccionado= new Gestion();
		Gestion gestion_actualizado= new Gestion();
		
		gestion_seleccionado= gestionServiceImpl.gestionXID(gestiones_id);
		
		gestion_seleccionado.setAdministrador(gestion.getAdministrador());
		gestion_seleccionado.setContenido(gestion.getContenido());
		gestion_seleccionado.setCategoria(gestion.getCategoria());
		
		gestion_actualizado = gestionServiceImpl.actualizarGestion(gestion_seleccionado);
		
		System.out.println("La gestion actualizada es: "+ gestion_actualizado);
		
		return gestion_actualizado;
	}
	
	@DeleteMapping("/gestiones/{gestiones_id}")
	public void eliminarGestion(@PathVariable(name="gestiones_id")Long gestiones_id) {
		gestionServiceImpl.eliminarGestion(gestiones_id);
	}
}