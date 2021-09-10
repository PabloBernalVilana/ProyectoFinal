package app.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Contenido") // apunta a la tabla contenido
public class Contenido {
	// Atributos de la entidad contenido
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int contenido_Id;

	@Column(name = "nombre")
	protected String nombre;

	@Column(name = "extension")
	protected String extension;

	@Column(name = "ruta_publica")
	protected String ruta_Publica;

	// Revisar el tipo de variable
	
	@Temporal(TemporalType.TIMESTAMP)
	protected Date fecha_Subida;

	@Temporal(TemporalType.DATE)
	protected Date fecha_Modificacion;

	// Constructores ( por defecto y con todos los atributos)
	public Contenido() {

	}

	public Contenido(int contenido_Id, String nombre, String extension, String ruta_Publica, Date fecha_Subida,
			Date fecha_Modificacion) {
		this.contenido_Id = contenido_Id;
		this.nombre = nombre;
		this.extension = extension;
		this.ruta_Publica = ruta_Publica;
		this.fecha_Subida = fecha_Subida;
		this.fecha_Modificacion = fecha_Modificacion;
	}

	/**
	 * @return the contenido_Id
	 */
	public int getContenido_Id() {
		return contenido_Id;
	}

	/**
	 * @param contenido_Id the contenido_Id to set
	 */
	public void setContenido_Id(int contenido_Id) {
		this.contenido_Id = contenido_Id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the extension
	 */
	public String getExtension() {
		return extension;
	}

	/**
	 * @param extension the extension to set
	 */
	public void setExtension(String extension) {
		this.extension = extension;
	}

	/**
	 * @return the ruta_Publica
	 */
	public String getRuta_Publica() {
		return ruta_Publica;
	}

	/**
	 * @param ruta_Publica the ruta_Publica to set
	 */
	public void setRuta_Publica(String ruta_Publica) {
		this.ruta_Publica = ruta_Publica;
	}

	/**
	 * @return the fecha_Subida
	 */
	public Date getFecha_Subida() {
		return fecha_Subida;
	}

	/**
	 * @param fecha_Subida the fecha_Subida to set
	 */
	public void setFecha_Subida(Date fecha_Subida) {
		this.fecha_Subida = fecha_Subida;
	}

	/**
	 * @return the fecha_Modificacion
	 */
	public Date getFecha_Modificacion() {
		return fecha_Modificacion;
	}

	/**
	 * @param fecha_Modificacion the fecha_Modificacion to set
	 */
	public void setFecha_Modificacion(Date fecha_Modificacion) {
		this.fecha_Modificacion = fecha_Modificacion;
	}

	@Override
	public String toString() {
		return "Contenido [contenido_Id=" + contenido_Id + ", nombre=" + nombre + ", extension=" + extension
				+ ", ruta_Publica=" + ruta_Publica + ", fecha_Subida=" + fecha_Subida + ", fecha_Modificacion="
				+ fecha_Modificacion + "]";
	}

}
