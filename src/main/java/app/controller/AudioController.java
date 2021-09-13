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

import app.dto.Audio;
import app.service.AudioServiceImpl;

@RestController
@RequestMapping("/api")

public class AudioController {
	@Autowired
	AudioServiceImpl audioServiceImpl;
	
	@GetMapping("/audios")
	public List<Audio> listarAudios() {
		return audioServiceImpl.listarAudios();
	}
	
	@PostMapping("/audios")
	public Audio salvarAudio(@RequestBody Audio audio) {
		return audioServiceImpl.guardarAudio(audio);
	}
	
	@GetMapping("/audios/{contenido_id}")
	public Audio audioXID(@PathVariable(name="contenido_id") Long contenido_id) {
		
		Audio audio_xid = new Audio();
		
		audio_xid = audioServiceImpl.audioXID(contenido_id);
		
		System.out.println("Audio XID: " + audio_xid);
		
		return audio_xid;
	}
	
	@PutMapping("/audios/{contenido_id}")
	public Audio actualizarAudio(@PathVariable(name="contenido_id")Long contenido_id,@RequestBody Audio audio) {
		
		Audio audio_seleccionado= new Audio();
		Audio audio_actualizado= new Audio();
		
		audio_seleccionado= audioServiceImpl.audioXID(contenido_id);
		
		audio_seleccionado.setDescription(audio.getDescription());
		audio_seleccionado.setSizes(audio.getSizes());
		audio_seleccionado.setDuration(audio.getDuration());
		audio_seleccionado.setAuthor(audio.getAuthor());
		audio_seleccionado.setGestion(audio.getGestion());
		audio_seleccionado.setName(audio.getName());
		audio_seleccionado.setPath(audio.getPath());
		audio_seleccionado.setExtension(audio.getExtension());
		
		audio_actualizado = audioServiceImpl.actualizarAudio(audio_seleccionado);
		
		System.out.println("El Audio actualizado es: "+ audio_actualizado);
		
		return audio_actualizado;
	}
	
	@DeleteMapping("/audios/{contenido_id}")
	public void eliminarAudio(@PathVariable(name="contenido_id")Long contenido_id) {
		audioServiceImpl.eliminarAudio(contenido_id);
	}
}