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

import app.dto.Categoria;
import app.service.CategoriaServiceImpl;

@RestController
@RequestMapping("/api")

public class CategoriaController {
	@Autowired
	CategoriaServiceImpl categoriaServiceImpl;
	
	@GetMapping("/categorias")
	public List<Categoria> listarCategorias() {
		return categoriaServiceImpl.listarCategorias();
	}
	
	@PostMapping("/categorias")
	public Categoria salvarCategoria(@RequestBody Categoria categoria) {
		return categoriaServiceImpl.guardarCategoria(categoria);
	}
	
	@GetMapping("/categorias/{categoria_id}")
	public Categoria categoriaXID(@PathVariable(name="categoria_id") Long categoria_id) {
		
		Categoria categoria_xid = new Categoria();
		
		categoria_xid = categoriaServiceImpl.categoriaXID(categoria_id);
		
		System.out.println("Categoria XID: " + categoria_xid);
		
		return categoria_xid;
	}
	
	@PutMapping("/categorias/{categoria_id}")
	public Categoria actualizarCategoria(@PathVariable(name="categoria_id")Long categoria_id,@RequestBody Categoria categoria) {
		
		Categoria categoria_seleccionado= new Categoria();
		Categoria categoria_actualizado= new Categoria();
		
		categoria_seleccionado= categoriaServiceImpl.categoriaXID(categoria_id);
		
		categoria_seleccionado.setName(categoria.getName());
		categoria_seleccionado.setPath(categoria.getPath());
		categoria_seleccionado.setExtension(categoria.getExtension());
		categoria_seleccionado.setGestion(categoria.getGestion());
		
		categoria_actualizado = categoriaServiceImpl.actualizarCategoria(categoria_seleccionado);
		
		System.out.println("El categoria actualizado es: "+ categoria_actualizado);
		
		return categoria_actualizado;
	}
	
	@DeleteMapping("/categorias/{categoria_id}")
	public void eliminarCategoria(@PathVariable(name="categoria_id")Long categoria_id) {
		categoriaServiceImpl.eliminarCategoria(categoria_id);
	}
}
