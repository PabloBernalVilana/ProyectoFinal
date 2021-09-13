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

import app.dto.Video;
import app.service.VideoServiceImpl;

@RestController
@RequestMapping("/api")

public class VideoController {
	@Autowired
	VideoServiceImpl videoServiceImpl;
	
	@GetMapping("/videos")
	public List<Video> listarVideos() {
		return videoServiceImpl.listarVideos();
	}
	
	@PostMapping("/videos")
	public Video salvarVideo(@RequestBody Video video) {
		return videoServiceImpl.guardarVideo(video);
	}
	
	@GetMapping("/videos/{contenido_id}")
	public Video videoXID(@PathVariable(name="contenido_id") Long contenido_id) {
		
		Video video_xid = new Video();
		
		video_xid = videoServiceImpl.videoXID(contenido_id);
		
		System.out.println("Video XID: " + video_xid);
		
		return video_xid;
	}
	
	@PutMapping("/videos/{contenido_id}")
	public Video actualizarVideo(@PathVariable(name="contenido_id")Long contenido_id,@RequestBody Video video) {
		
		Video video_seleccionado= new Video();
		Video video_actualizado= new Video();
		
		video_seleccionado= videoServiceImpl.videoXID(contenido_id);
		
		video_seleccionado.setName(video.getName());
		video_seleccionado.setPath(video.getPath());
		video_seleccionado.setExtension(video.getExtension());
		video_seleccionado.setGestion(video.getGestion());
		video_seleccionado.setDuration(video.getDuration());
		video_seleccionado.setAuthor(video.getAuthor());
		
		video_actualizado = videoServiceImpl.actualizarVideo(video_seleccionado);
		
		System.out.println("El video actualizado es: "+ video_actualizado);
		
		return video_actualizado;
	}
	
	@DeleteMapping("/videos/{contenido_id}")
	public void eliminarVideo(@PathVariable(name="contenido_id")Long contenido_id) {
		videoServiceImpl.eliminarVideo(contenido_id);
	}
}
