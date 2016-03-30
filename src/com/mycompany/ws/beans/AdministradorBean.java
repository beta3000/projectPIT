package com.mycompany.ws.beans;

public class AdministradorBean {

	private int idAdministrador;
	private String nombresAdministrador;
	private String apellidosAdministrador;
	/* Campos login */
	private String emailAdministrador;
	private String passwordAdministrador;

	public AdministradorBean() {

	}

	public int getIdAdministrador() {
		return idAdministrador;
	}

	public void setIdAdministrador(int idAdministrador) {
		this.idAdministrador = idAdministrador;
	}

	public String getNombresAdministrador() {
		return nombresAdministrador;
	}

	public void setNombresAdministrador(String nombresAdministrador) {
		this.nombresAdministrador = nombresAdministrador;
	}

	public String getApellidosAdministrador() {
		return apellidosAdministrador;
	}

	public void setApellidosAdministrador(String apellidosAdministrador) {
		this.apellidosAdministrador = apellidosAdministrador;
	}

	public String getEmailAdministrador() {
		return emailAdministrador;
	}

	public void setEmailAdministrador(String emailAdministrador) {
		this.emailAdministrador = emailAdministrador;
	}

	public String getPasswordAdministrador() {
		return passwordAdministrador;
	}

	public void setPasswordAdministrador(String passwordAdministrador) {
		this.passwordAdministrador = passwordAdministrador;
	}

}
