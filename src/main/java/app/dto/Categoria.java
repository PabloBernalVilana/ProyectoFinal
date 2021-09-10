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
@Table(name = "Categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int categoria_Id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "extension")
	private String extension;

	@Column(name = "ruta_publica")
	private String ruta_Publica;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha_Subida;

	@Temporal(TemporalType.DATE)
	private Date fecha_Modificacion;

	/**
	 * 
	 */
	public Categoria() {
	}

	/**
	 * @param categoria_Id
	 * @param nombre
	 * @param extension
	 * @param ruta_Publica
	 * @param fecha_Subida
	 * @param fecha_Modificacion
	 */
	public Categoria(int categoria_Id, String nombre, String extension, String ruta_Publica, Date fecha_Subida,
			Date fecha_Modificacion) {
		this.categoria_Id = categoria_Id;
		this.nombre = nombre;
		this.extension = extension;
		this.ruta_Publica = ruta_Publica;
		this.fecha_Subida = fecha_Subida;
		this.fecha_Modificacion = fecha_Modificacion;
	}

	/**
	 * @return the categoria_Id
	 */
	public int getCategoria_Id() {
		return categoria_Id;
	}

	/**
	 * @param categoria_Id the categoria_Id to set
	 */
	public void setCategoria_Id(int categoria_Id) {
		this.categoria_Id = categoria_Id;
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
		return "Categoria [categoria_Id=" + categoria_Id + ", nombre=" + nombre + ", extension=" + extension
				+ ", ruta_Publica=" + ruta_Publica + ", fecha_Subida=" + fecha_Subida + ", fecha_Modificacion="
				+ fecha_Modificacion + "]";
	}

}
