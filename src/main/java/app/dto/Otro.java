package app.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Otro")
public class Otro extends Contenido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int otro_Id;

	@Column(name = "Descripcion")
	private String descripcion;

	/**
	 * 
	 */
	public Otro() {
	}

	/**
	 * @param otro_Id
	 * @param descripcion
	 */
	public Otro(int otro_Id, String descripcion) {
		this.otro_Id = otro_Id;
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
	public Otro(int contenido_Id, String nombre, String extension, String ruta_Publica, Date fecha_Subida,
			Date fecha_Modificacion) {
		super(contenido_Id, nombre, extension, ruta_Publica, fecha_Subida, fecha_Modificacion);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the otro_Id
	 */
	public int getOtro_Id() {
		return otro_Id;
	}

	/**
	 * @param otro_Id the otro_Id to set
	 */
	public void setOtro_Id(int otro_Id) {
		this.otro_Id = otro_Id;
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
		return "Otro [otro_Id=" + otro_Id + ", descripcion=" + descripcion + "]";
	}

}
