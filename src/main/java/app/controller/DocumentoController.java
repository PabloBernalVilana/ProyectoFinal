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

import app.dto.Documento;
import app.service.DocumentoServiceImpl;

@RestController
@RequestMapping("/api")

public class DocumentoController {
	@Autowired
	DocumentoServiceImpl documentoServiceImpl;
	
	@GetMapping("/documentos")
	public List<Documento> listarDocumentos() {
		return documentoServiceImpl.listarDocumentos();
	}
	
	@PostMapping("/documentos")
	public Documento salvarDocumento(@RequestBody Documento documento) {
		return documentoServiceImpl.guardarDocumento(documento);
	}
	
	@GetMapping("/documentos/{contenido_id}")
	public Documento documentoXID(@PathVariable(name="contenido_id") Long contenido_id) {
		
		Documento documento_xid = new Documento();
		
		documento_xid = documentoServiceImpl.documentoXID(contenido_id);
		
		System.out.println("Documento XID: " + documento_xid);
		
		return documento_xid;
	}
	
	@PutMapping("/documentos/{contenido_id}")
	public Documento actualizarDocumento(@PathVariable(name="contenido_id")Long contenido_id,@RequestBody Documento documento) {
		
		Documento documento_seleccionado= new Documento();
		Documento documento_actualizado= new Documento();
		
		documento_seleccionado= documentoServiceImpl.documentoXID(contenido_id);
		
		documento_seleccionado.setName(documento.getName());
		documento_seleccionado.setPath(documento.getPath());
		documento_seleccionado.setExtension(documento.getExtension());
		documento_seleccionado.setGestion(documento.getGestion());
		documento_seleccionado.setPages(documento.getPages());
		documento_seleccionado.setAuthor(documento.getAuthor());
		documento_seleccionado.setDescription(documento.getDescription());
		
		documento_actualizado = documentoServiceImpl.actualizarDocumento(documento_seleccionado);
		
		System.out.println("El documento actualizado es: "+ documento_actualizado);
		
		return documento_actualizado;
	}
	
	@DeleteMapping("/documentos/{contenido_id}")
	public void eliminarDocumento(@PathVariable(name="contenido_id")Long contenido_id) {
		documentoServiceImpl.eliminarDocumento(contenido_id);
	}
}
