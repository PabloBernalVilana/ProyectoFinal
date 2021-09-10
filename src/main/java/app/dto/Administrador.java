package app.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Administrador")
public class Administrador {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int administrador_Id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "password")
	private String password;

	@Column(name = "telefono")
	private int telefono;

	@Column(name = "correo_electronico")
	private String email;

	/**
	 * 
	 */
	public Administrador() {
	}

	/**
	 * @param administrador_Id
	 * @param nombre
	 * @param password
	 * @param telefono
	 * @param email
	 */

	public Administrador(int administrador_Id, String nombre, String password, int telefono, String email) {
		this.administrador_Id = administrador_Id;
		this.nombre = nombre;
		this.password = password;
		this.telefono = telefono;
		this.email = email;
	}

	/**
	 * @return the administrador_Id
	 */
	public int getAdministrador_Id() {
		return administrador_Id;
	}

	/**
	 * @param administrador_Id the administrador_Id to set
	 */
	public void setAdministrador_Id(int administrador_Id) {
		this.administrador_Id = administrador_Id;
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
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the telefono
	 */
	public int getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Administrador [administrador_Id=" + administrador_Id + ", nombre=" + nombre + ", password=" + password
				+ ", telefono=" + telefono + ", email=" + email + "]";
	}

}
