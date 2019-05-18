package com.unmsm.fisi.model;

public class Perfil {
	private Integer nidPerfil;
	private String vnombre;
	private String vdescripcion;

	public Perfil() {

	}

	public Perfil(Integer nidPerfil, String vnombre, String vdescripcion) {
		super();
		this.nidPerfil = nidPerfil;
		this.vnombre = vnombre;
		this.vdescripcion = vdescripcion;
	}

	public Integer getNidPerfil() {
		return nidPerfil;
	}

	public void setNidPerfil(Integer nidPerfil) {
		this.nidPerfil = nidPerfil;
	}

	public String getVnombre() {
		return vnombre;
	}

	public void setVnombre(String vnombre) {
		this.vnombre = vnombre;
	}

	public String getVdescripcion() {
		return vdescripcion;
	}

	public void setVdescripcion(String vdescripcion) {
		this.vdescripcion = vdescripcion;
	}

}
