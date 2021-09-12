package app.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "imagenes")
public class Imagen extends Contenido {

//	@Id
//	@Column(name="imagen_id")
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int imagen_id;

	@Column(name = "dimensiones")
	private String sizes;

	@Column(name = "ancho")
	private int width;

	@Column(name = "alto")
	private int height;

	@Column(name = "autor")
	private String author;

	@Column(name = "copyright", columnDefinition = "BOOLEAN")
	private boolean haveCopyright;

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
	 * @param haveCopyright
	 */
	public Imagen(String sizes, int width, int height, String author, boolean haveCopyright) {
		this.sizes = sizes;
		this.width = width;
		this.height = height;
		this.author = author;
		this.haveCopyright = haveCopyright;
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
	public Imagen(int contenido_id, List<Gestion> gestion, String name, Date uploadDate, Date modifiedDate, String path,
			String extension) {
		super(contenido_id, gestion, name, uploadDate, modifiedDate, path, extension);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the imagen_id
	 */
//	public int getImagen_id() {
//		return imagen_id;
//	}

	/**
	 * @param imagen_id the imagen_id to set
	 */
//	public void setImagen_id(int imagen_id) {
//		this.imagen_id = imagen_id;
//	}

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
	 * @return the haveCopyright
	 */
	public boolean isHaveCopyright() {
		return haveCopyright;
	}

	/**
	 * @param haveCopyright the haveCopyright to set
	 */
	public void setHaveCopyright(boolean haveCopyright) {
		this.haveCopyright = haveCopyright;
	}

	@Override
	public String toString() {
		return "Imagen [sizes=" + sizes + ", width=" + width + ", height=" + height
				+ ", author=" + author + ", haveCopyright=" + haveCopyright + "]";
	}

}
