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

import app.dto.Otro;
import app.service.OtroServiceImpl;

@RestController
@RequestMapping("/api")

public class OtroController {
	@Autowired
	OtroServiceImpl otroServiceImpl;
	
	@GetMapping("/otros")
	public List<Otro> listarOtros() {
		return otroServiceImpl.listarOtros();
	}
	
	@PostMapping("/otros")
	public Otro salvarOtro(@RequestBody Otro otro) {
		return otroServiceImpl.guardarOtro(otro);
	}
	
	@GetMapping("/otros/{contenido_id}")
	public Otro otroXID(@PathVariable(name="contenido_id") Long contenido_id) {
		
		Otro otro_xid = new Otro();
		
		otro_xid = otroServiceImpl.otroXID(contenido_id);
		
		System.out.println("Otro XID: " + otro_xid);
		
		return otro_xid;
	}
	
	@PutMapping("/otros/{contenido_id}")
	public Otro actualizarOtro(@PathVariable(name="contenido_id")Long contenido_id,@RequestBody Otro otro) {
		
		Otro otro_seleccionado= new Otro();
		Otro otro_actualizado= new Otro();
		
		otro_seleccionado= otroServiceImpl.otroXID(contenido_id);
		
		otro_seleccionado.setName(otro.getName());
		otro_seleccionado.setPath(otro.getPath());
		otro_seleccionado.setExtension(otro.getExtension());
		otro_seleccionado.setGestion(otro.getGestion());
		otro_seleccionado.setDescription(otro.getDescription());
		
		otro_actualizado = otroServiceImpl.actualizarOtro(otro_seleccionado);
		
		System.out.println("El otro actualizado es: "+ otro_actualizado);
		
		return otro_actualizado;
	}
	
	@DeleteMapping("/otros/{contenido_id}")
	public void eliminarOtro(@PathVariable(name="contenido_id")Long contenido_id) {
		otroServiceImpl.eliminarOtro(contenido_id);
	}
}