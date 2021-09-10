package app.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "audios")
public class Audio extends Contenido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long audio_id;

	@Column(name = "descripcion")
	private String description;

	@Column(name = "dimensiones")
	private String sizes;

	@Column(name = "duracion")
	private long duration;

	@Column(name = "autor")
	private String author;

	/**
	 * 
	 */
	public Audio() {

	}

	/**
	 * @param audio_id
	 * @param description
	 * @param sizes
	 * @param duration
	 * @param author
	 */
	public Audio(long audio_id, String description, String sizes, long duration, String author) {
		this.audio_id = audio_id;
		this.description = description;
		this.sizes = sizes;
		this.duration = duration;
		this.author = author;
	}

	/**
	 * @param contenido_id
	 * @param name
	 * @param uploadDate
	 * @param modifiedDate
	 * @param path
	 * @param extension
	 */
	public Audio(int contenido_id, String name, Date uploadDate, Date modifiedDate, String path, String extension) {
		super(contenido_id, name, uploadDate, modifiedDate, path, extension);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @return the audio_id
	 */
	public long getAudio_id() {
		return audio_id;
	}

	/**
	 * @param audio_id the audio_id to set
	 */
	public void setAudio_id(long audio_id) {
		this.audio_id = audio_id;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the sizes
	 */
	public String getSizes() {
		return sizes;
	}

	/**
	 * @param sizes the sizes to set
	 */
	public void setSizes(String sizes) {
		this.sizes = sizes;
	}

	/**
	 * @return the duration
	 */
	public long getDuration() {
		return duration;
	}

	/**
	 * @param duration the duration to set
	 */
	public void setDuration(long duration) {
		this.duration = duration;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Audio [audio_id=" + audio_id + ", description=" + description + ", sizes=" + sizes + ", duration="
				+ duration + ", author=" + author + "]";
	}

}
