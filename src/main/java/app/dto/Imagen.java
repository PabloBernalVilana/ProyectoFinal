package app.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="imagenes")
public class Imagen extends Contenido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int imagen_id;

	@Column(name = "dimensiones")
	private String sizes;

	@Column(name = "ancho")
	private int width;

	@Column(name = "alto")
	private int height;

	@Column(name = "autor")
	private String author;

	@Column(name = "copyright")
	private boolean copyright;

	/**
	 * 
	 */
	public Imagen() {

	}

	/**
	 * @param imagen_id
	 * @param sizes
	 * @param width
	 * @param height
	 * @param author
	 * @param copyright
	 */
	public Imagen(int imagen_id, String sizes, int width, int height, String author, boolean copyright) {
		this.imagen_id = imagen_id;
		this.sizes = sizes;
		this.width = width;
		this.height = height;
		this.author = author;
		this.copyright = copyright;
	}

	/**
	 * @param contenido_id
	 * @param name
	 * @param uploadDate
	 * @param modifiedDate
	 * @param path
	 * @param extension
	 */
	public Imagen(int contenido_id, String name, Date uploadDate, Date modifiedDate, String path, String extension) {
		super(contenido_id, name, uploadDate, modifiedDate, path, extension);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the imagens_id
	 */
	public int getImagen_id() {
		return imagen_id;
	}

	/**
	 * @param imagens_id the imagens_id to set
	 */
	public void setImagen_id(int imagen_id) {
		this.imagen_id = imagen_id;
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
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
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

	/**
	 * @return the copyright
	 */
	public boolean isCopyright() {
		return copyright;
	}

	/**
	 * @param copyright the copyright to set
	 */
	public void setCopyright(boolean copyright) {
		this.copyright = copyright;
	}

	@Override
	public String toString() {
		return "Imagen [imagen_id=" + imagen_id + ", sizes=" + sizes + ", width=" + width + ", height=" + height
				+ ", author=" + author + ", copyright=" + copyright + "]";
	}

}
