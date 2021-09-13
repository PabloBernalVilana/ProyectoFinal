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

import app.dto.Imagen;
import app.service.ImagenServiceImpl;

@RestController
@RequestMapping("/api")

public class ImagenController {
	@Autowired
	ImagenServiceImpl imagenServiceImpl;
	
	@GetMapping("/imagenes")
	public List<Imagen> listarImagenes() {
		return ImagenServiceImpl.listarImagenes();
	}
	
	@PostMapping("/imagenes")
	public Imagen salvarImagen(@RequestBody Imagen imagen) {
		return ImagenServiceImpl.guardarImagen(imagen);
	}
	
	@GetMapping("/imagenes/{contenido_id}")
	public Imagen imagenXID(@PathVariable(name="contenido_id") Long contenido_id) {
		
		Imagen imagen_xid = new Imagen();
		
		imagen_xid = ImagenServiceImpl.imagenXID(contenido_id);
		
		System.out.println("Imagen XID: " + imagen_xid);
		
		return imagen_xid;
	}
	
	@PutMapping("/imagenes/{contenido_id}")
	public Imagen actualizarImagen(@PathVariable(name="contenido_id")Long contenido_id,@RequestBody Imagen imagen) {
		
		Imagen imagen_seleccionado= new Imagen();
		Imagen imagen_actualizado= new Imagen();
		
		imagen_seleccionado= ImagenServiceImpl.imagenXID(contenido_id);
		
		imagen_seleccionado.setName(imagen.getName());
		imagen_seleccionado.setPath(imagen.getPath());
		imagen_seleccionado.setExtension(imagen.getExtension());
		imagen_seleccionado.setGestion(imagen.getGestion());
		imagen_seleccionado.setSizes(imagen.getSizes());
		imagen_seleccionado.setWidth(imagen.getWidth());
		imagen_seleccionado.setHeight(imagen.getHeight());
		imagen_seleccionado.setAuthor(imagen.getAuthor());
		imagen_seleccionado.setHaveCopyright(imagen.isHaveCopyright());
		
		imagen_actualizado = ImagenServiceImpl.actualizarImagen(imagen_seleccionado);
		
		System.out.println("La imagen actualizada es: "+ imagen_actualizado);
		
		return imagen_actualizado;
	}
	
	@DeleteMapping("/imagenes/{contenido_id}")
	public void eliminarImagen(@PathVariable(name="contenido_id")Long contenido_id) {
		ImagenServiceImpl.eliminarImagen(contenido_id);
	}
}