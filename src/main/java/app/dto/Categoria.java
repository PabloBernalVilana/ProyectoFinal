package app.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "categorias")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int categoria_id;

	@OneToMany
	@JoinColumn(name = "categoria_id")
	private List<Gestion> gestion;

	@Column(name = "nombre")
	private String name;

	@Column(name = "fecha_subida")
	private Date uploadDate;

	@Column(name = "fecha_modificacion")
	private Date modifiedDate;

	@Column(name = "ruta_publica")
	private String path;

	@Column(name = "extension")
	private String extension;

	/**
	 * 
	 */
	public Categoria() {
	}

	/**
	 * @param categoria_id
	 * @param gestion
	 * @param name
	 * @param uploadDate
	 * @param modifiedDate
	 * @param path
	 * @param extension
	 */
	public Categoria(int categoria_id, List<Gestion> gestion, String name, Date uploadDate, Date modifiedDate,
			String path, String extension) {
		this.categoria_id = categoria_id;
		this.gestion = gestion;
		this.name = name;
		this.uploadDate = uploadDate;
		this.modifiedDate = modifiedDate;
		this.path = path;
		this.extension = extension;
	}

	/**
	 * @return the categoria_id
	 */
	public int getCategoria_id() {
		return categoria_id;
	}

	/**
	 * @param categoria_id the categoria_id to set
	 */
	public void setCategoria_id(int categoria_id) {
		this.categoria_id = categoria_id;
	}

	/**
	 * @return the gestion
	 */
	public List<Gestion> getGestion() {
		return gestion;
	}

	/**
	 * @param gestion the gestion to set
	 */
	public void setGestion(List<Gestion> gestion) {
		this.gestion = gestion;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the uploadDate
	 */
	public Date getUploadDate() {
		return uploadDate;
	}

	/**
	 * @param uploadDate the uploadDate to set
	 */
	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}

	/**
	 * @return the modifiedDate
	 */
	public Date getModifiedDate() {
		return modifiedDate;
	}

	/**
	 * @param modifiedDate the modifiedDate to set
	 */
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @param path the path to set
	 */
	public void setPath(String path) {
		this.path = path;
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

	@Override
	public String toString() {
		return "Categoria [categoria_id=" + categoria_id + ", gestion=" + gestion + ", name=" + name + ", uploadDate="
				+ uploadDate + ", modifiedDate=" + modifiedDate + ", path=" + path + ", extension=" + extension + "]";
	}

}
