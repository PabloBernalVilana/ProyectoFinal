package app.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "otros")
public class Otro extends Contenido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int otro_id;

	@Column(name = "descripcion")
	private String description;

	/**
	 * 
	 */
	public Otro() {

	}

	/**
	 * @param otro_id
	 * @param description
	 */
	public Otro(int otro_id, String description) {
		this.otro_id = otro_id;
		this.description = description;
	}

	/**
	 * @param contenido_id
	 * @param name
	 * @param uploadDate
	 * @param modifiedDate
	 * @param path
	 * @param extension
	 */
	public Otro(int contenido_id, String name, Date uploadDate, Date modifiedDate, String path, String extension) {
		super(contenido_id, name, uploadDate, modifiedDate, path, extension);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the otro_id
	 */
	public int getOtro_id() {
		return otro_id;
	}

	/**
	 * @param otro_id the otro_id to set
	 */
	public void setOtro_id(int otro_id) {
		this.otro_id = otro_id;
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

	@Override
	public String toString() {
		return "Otro [otro_id=" + otro_id + ", description=" + description + "]";
	}

}
