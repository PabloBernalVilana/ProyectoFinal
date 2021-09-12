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
@Table(name = "documentos")
public class Documento extends Contenido {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int documento_id;

	@Column(name = "paginas")
	private int pages;

	@Column(name = "autor")
	private String author;

	@Column(name = "descripcion")
	private String description;

	/**
	 * 
	 */
	public Documento() {
	}

	/**
	 * @param documento_id
	 * @param pages
	 * @param author
	 * @param description
	 */
	public Documento(int pages, String author, String description) {
		this.pages = pages;
		this.author = author;
		this.description = description;
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
	public Documento(int contenido_id, List<Gestion> gestion, String name, Date uploadDate, Date modifiedDate,
			String path, String extension) {
		super(contenido_id, gestion, name, uploadDate, modifiedDate, path, extension);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the documento_id
	 */
//	public int getDocumento_id() {
//		return documento_id;
//	}

	/**
	 * @param documento_id the documento_id to set
	 */
//	public void setDocumento_id(int documento_id) {
//		this.documento_id = documento_id;
//	}

	/**
	 * @return the pages
	 */
	public int getPages() {
		return pages;
	}

	/**
	 * @param pages the pages to set
	 */
	public void setPages(int pages) {
		this.pages = pages;
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
		return "Documento [pages=" + pages + ", author=" + author + ", description="
				+ description + "]";
	}
	
	
}
