package app.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Audio")
public class Audio extends Contenido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int audio_Id;

	@Column(name = "descripcion")
	private String descripcion;

	/**
	 * 
	 */
	public Audio() {
	}

	/**
	 * @param audio_Id
	 * @param descripcion
	 */
	public Audio(int audio_Id, String descripcion) {
		this.audio_Id = audio_Id;
		this.descripcion = descripcion;
	}

	/**
	 * @param contenido_Id
	 * @param nombre
	 * @param extension
	 * @param ruta_Publica
	 * @param fecha_Subida
	 * @param fecha_Modificacion
	 */
	public Audio(int contenido_Id, String nombre, String extension, String ruta_Publica, Date fecha_Subida,
			Date fecha_Modificacion) {
		super(contenido_Id, nombre, extension, ruta_Publica, fecha_Subida, fecha_Modificacion);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the audio_Id
	 */
	public int getAudio_Id() {
		return audio_Id;
	}

	/**
	 * @param audio_Id the audio_Id to set
	 */
	public void setAudio_Id(int audio_Id) {
		this.audio_Id = audio_Id;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Audio [audio_Id=" + audio_Id + ", descripcion=" + descripcion + "]";
	}

}
