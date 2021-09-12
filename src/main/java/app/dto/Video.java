package app.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "videos")
public class Video extends Contenido {

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int video_id;

	@Column(name = "duracion")
	private int duration;

	@Column(name = "autor")
	private String author;

	/**
	 * 
	 */
	public Video() {
	}

	/**
	 * @param video_id
	 * @param duration
	 * @param author
	 */
	public Video(int video_id, int duration, String author) {
		this.duration = duration;
		this.author = author;
	}

	/**
	 * @param contenido_id
	 * @param gestion
	 * @param name
	 * @param uploadDate
	 * @param modifiedDate
	 * @param path
	 * @param extension
	 */
	public Video(int contenido_id, List<Gestion> gestion, String name, Date uploadDate, Date modifiedDate, String path,
			String extension) {
		super(contenido_id, gestion, name, uploadDate, modifiedDate, path, extension);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the video_id
	 */
//	public int getVideo_id() {
//		return video_id;
//	}

	/**
	 * @param video_id the video_id to set
	 */
//	public void setVideo_id(int video_id) {
//		this.video_id = video_id;
//	}

	/**
	 * @return the duration
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * @param duration the duration to set
	 */
	public void setDuration(int duration) {
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
		return "Video [duration=" + duration + ", author=" + author + "]";
	}



}
