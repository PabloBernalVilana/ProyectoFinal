package app.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Documento")
public class Documento extends Contenido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int documento_Id;

	@Column(name = "Paginas")
	private int paginas;

	@Column(name = "Autor")
	private String autor;

	@Column(name = "Descripcion")
	private String descripcion;

	/**
	 * 
	 */
	public Documento() {
	}

	/**
	 * @param documento_Id
	 * @param paginas
	 * @param autor
	 * @param descripcion
	 */
	public Documento(int documento_Id, int paginas, String autor, String descripcion) {
		this.documento_Id = documento_Id;
		this.paginas = paginas;
		this.autor = autor;
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
	public Documento(int contenido_Id, String nombre, String extension, String ruta_Publica, Date fecha_Subida,
			Date fecha_Modificacion) {
		super(contenido_Id, nombre, extension, ruta_Publica, fecha_Subida, fecha_Modificacion);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the documento_Id
	 */
	public int getDocumento_Id() {
		return documento_Id;
	}

	/**
	 * @param documento_Id the documento_Id to set
	 */
	public void setDocumento_Id(int documento_Id) {
		this.documento_Id = documento_Id;
	}

	/**
	 * @return the paginas
	 */
	public int getPaginas() {
		return paginas;
	}

	/**
	 * @param paginas the paginas to set
	 */
	public void setPaginas(int paginas) {
		this.paginas = paginas;
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
		return "Documento [documento_Id=" + documento_Id + ", paginas=" + paginas + ", autor=" + autor
				+ ", descripcion=" + descripcion + "]";
	}

}
