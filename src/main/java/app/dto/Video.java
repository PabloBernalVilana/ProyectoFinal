package app.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Video")
public class Video extends Contenido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int video_Id;

	@Column(name = "Duracion")
	private int duracion;

	@Column(name = "Autor")
	private String autor;

	/**
	 * 
	 */
	public Video() {
	}

	/**
	 * @param video_Id
	 * @param duracion
	 * @param autor
	 */
	public Video(int video_Id, int duracion, String autor) {
		this.video_Id = video_Id;
		this.duracion = duracion;
		this.autor = autor;
	}

	/**
	 * @param contenido_Id
	 * @param nombre
	 * @param extension
	 * @param ruta_Publica
	 * @param fecha_Subida
	 * @param fecha_Modificacion
	 */
	public Video(int contenido_Id, String nombre, String extension, String ruta_Publica, Date fecha_Subida,
			Date fecha_Modificacion) {
		super(contenido_Id, nombre, extension, ruta_Publica, fecha_Subida, fecha_Modificacion);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the video_Id
	 */
	public int getVideo_Id() {
		return video_Id;
	}

	/**
	 * @param video_Id the video_Id to set
	 */
	public void setVideo_Id(int video_Id) {
		this.video_Id = video_Id;
	}

	/**
	 * @return the duracion
	 */
	public int getDuracion() {
		return duracion;
	}

	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Video [video_Id=" + video_Id + ", duracion=" + duracion + ", autor=" + autor + "]";
	}

}
