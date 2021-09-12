package app.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "gestiones")

public class Gestion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int gestiones_id;

	@ManyToOne
	@JoinColumn(name = "administrador_id")
	Administrador administrador;

	@ManyToOne
	@JoinColumn(name = "contenido_id")
	Contenido contenido;

	@ManyToOne
	@JoinColumn(name = "categoria_id")
	Categoria categoria;

	/**
	 * 
	 */
	public Gestion() {

	}

	/**
	 * @param gestiones_id
	 * @param administrador
	 * @param contenido
	 * @param categoria
	 */
	public Gestion(int gestiones_id, Administrador administrador, Contenido contenido, Categoria categoria) {
		this.gestiones_id = gestiones_id;
		this.administrador = administrador;
		this.contenido = contenido;
		this.categoria = categoria;
	}

	/**
	 * @return the gestiones_id
	 */
	public int getGestiones_id() {
		return gestiones_id;
	}

	/**
	 * @param gestiones_id the gestiones_id to set
	 */
	public void setGestiones_id(int gestiones_id) {
		this.gestiones_id = gestiones_id;
	}

	/**
	 * @return the administrador
	 */
	public Administrador getAdministrador() {
		return administrador;
	}

	/**
	 * @param administrador the administrador to set
	 */
	public void setAdministrador(Administrador administrador) {
		this.administrador = administrador;
	}

	/**
	 * @return the contenido
	 */
	public Contenido getContenido() {
		return contenido;
	}

	/**
	 * @param contenido the contenido to set
	 */
	public void setContenido(Contenido contenido) {
		this.contenido = contenido;
	}

	/**
	 * @return the categoria
	 */
	public Categoria getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Gestion [gestiones_id=" + gestiones_id + ", administrador=" + administrador + ", contenido=" + contenido
				+ ", categoria=" + categoria + "]";
	}

}
