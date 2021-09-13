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

import app.dto.Administrador;
import app.service.AdministradorServiceImpl;

@RestController
@RequestMapping("/api")

public class AdministradorController {
	@Autowired
	AdministradorServiceImpl administradorServiceImpl;
	
	@GetMapping("/administradores")
	public List<Administrador> listarAdministradores() {
		return administradorServiceImpl.listarAdministradores();
	}
	
	@PostMapping("/administradores")
	public Administrador salvarAdministrador(@RequestBody Administrador administrador) {
		return administradorServiceImpl.guardarAdministrador(administrador);
	}
	
	@GetMapping("/administradores/{administrador_id}")
	public Administrador administradorXID(@PathVariable(name="administrador_id") Long administrador_id) {
		
		Administrador administrador_xid = new Administrador();
		
		administrador_xid = administradorServiceImpl.administradorXID(administrador_id);
		
		System.out.println("Administrador Xadministrador_id: " + administrador_xid);
		
		return administrador_xid;
	}
	
	@PutMapping("/administradores/{administrador_id}")
	public Administrador actualizarAdministrador(@PathVariable(name="administrador_id")Long administrador_id,@RequestBody Administrador administrador) {
		
		Administrador administrador_seleccionado= new Administrador();
		Administrador administrador_actualizado= new Administrador();
		
		administrador_seleccionado= administradorServiceImpl.administradorXID(administrador_id);
		
		administrador_seleccionado.setName(administrador.getName());
		administrador_seleccionado.setPassword(administrador.getPassword());
		administrador_seleccionado.setGestion(administrador.getGestion());
		administrador_seleccionado.setEmail(administrador.getEmail());
		administrador_seleccionado.setPhoneNumber(administrador.getPhoneNumber());
		
		administrador_actualizado = administradorServiceImpl.actualizarAdministrador(administrador_seleccionado);
		
		System.out.println("El administrador actualizado es: "+ administrador_actualizado);
		
		return administrador_actualizado;
	}
	
	@DeleteMapping("/administradores/{administrador_id}")
	public void eliminarAdministrador(@PathVariable(name="administrador_id")Long administrador_id) {
		administradorServiceImpl.eliminarAdministrador(administrador_id);
	}
}