package app.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "administradores")
public class Administrador {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long administrador_id;

	@Column(name = "contraseña")
	private String password;

	@Column(name = "telefono")
	private long phoneNumber;

	@Column(name = "nombre")
	private String name;

	@Column(name = "correo_electronico")
	private String email;

	/**
	 * 
	 */
	public Administrador() {
	}

	/**
	 * @param administrador_id
	 * @param password
	 * @param phoneNumber
	 * @param name
	 * @param email
	 */
	public Administrador(long administrador_id, String password, long phoneNumber, String name, String email) {
		this.administrador_id = administrador_id;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.email = email;
	}

	/**
	 * @return the administrador_id
	 */
	public long getAdministrador_id() {
		return administrador_id;
	}

	/**
	 * @param administrador_id the administrador_id to set
	 */
	public void setAdministrador_id(long administrador_id) {
		this.administrador_id = administrador_id;
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
	 * @return the phoneNumber
	 */
	public long getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
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
		return "Administrador [administrador_id=" + administrador_id + ", password=" + password + ", phoneNumber="
				+ phoneNumber + ", name=" + name + ", email=" + email + "]";
	}

}
