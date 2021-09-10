package app.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Imagen")
public class Imagen extends Contenido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int imagen_Id;

	@Column(name = "Ancho")
	private int ancho;

	@Column(name = "Alto")
	private int alto;

	@Column(name = "Dimensiones")
	private String dimensiones;

	@Column(name = "Autor")
	private String autor;

	@Column(name = "Copyright")
	private String copyright;

	/**
	 * 
	 */
	public Imagen() {
	}

	/**
	 * @param imagen_Id
	 * @param ancho
	 * @param alto
	 * @param dimensiones
	 * @param autor
	 * @param copyright
	 */
	public Imagen(int imagen_Id, int ancho, int alto, String dimensiones, String autor, String copyright) {
		this.imagen_Id = imagen_Id;
		this.ancho = ancho;
		this.alto = alto;
		this.dimensiones = dimensiones;
		this.autor = autor;
		this.copyright = copyright;
	}

	/**
	 * @param contenido_Id
	 * @param nombre
	 * @param extension
	 * @param ruta_Publica
	 * @param fecha_Subida
	 * @param fecha_Modificacion
	 */
	public Imagen(int contenido_Id, String nombre, String extension, String ruta_Publica, Date fecha_Subida,
			Date fecha_Modificacion) {
		super(contenido_Id, nombre, extension, ruta_Publica, fecha_Subida, fecha_Modificacion);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the imagen_Id
	 */
	public int getImagen_Id() {
		return imagen_Id;
	}

	/**
	 * @param imagen_Id the imagen_Id to set
	 */
	public void setImagen_Id(int imagen_Id) {
		this.imagen_Id = imagen_Id;
	}

	/**
	 * @return the ancho
	 */
	public int getAncho() {
		return ancho;
	}

	/**
	 * @param ancho the ancho to set
	 */
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	/**
	 * @return the alto
	 */
	public int getAlto() {
		return alto;
	}

	/**
	 * @param alto the alto to set
	 */
	public void setAlto(int alto) {
		this.alto = alto;
	}

	/**
	 * @return the dimensiones
	 */
	public String getDimensiones() {
		return dimensiones;
	}

	/**
	 * @param dimensiones the dimensiones to set
	 */
	public void setDimensiones(String dimensiones) {
		this.dimensiones = dimensiones;
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

	/**
	 * @return the copyright
	 */
	public String getCopyright() {
		return copyright;
	}

	/**
	 * @param copyright the copyright to set
	 */
	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	@Override
	public String toString() {
		return "Imagen [imagen_Id=" + imagen_Id + ", ancho=" + ancho + ", alto=" + alto + ", dimensiones=" + dimensiones
				+ ", autor=" + autor + ", copyright=" + copyright + "]";
	}

}
