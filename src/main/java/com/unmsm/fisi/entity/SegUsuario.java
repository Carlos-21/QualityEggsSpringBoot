package com.unmsm.fisi.entity;
// Generated 18/05/2019 03:01:04 PM by Hibernate Tools 5.0.6.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SegUsuario generated by hbm2java
 */
@Entity
@Table(name = "seg_usuario", catalog = "qualityeggs")
public class SegUsuario implements java.io.Serializable {

	private String vidUsuario;
	private ManPersona manPersona;
	private SegPerfil segPerfil;
	private String vclave;
	private Boolean bactivo;
	private Date dfecha;
	private Date thora;

	public SegUsuario() {
	}

	public SegUsuario(String vidUsuario, ManPersona manPersona, SegPerfil segPerfil) {
		this.vidUsuario = vidUsuario;
		this.manPersona = manPersona;
		this.segPerfil = segPerfil;
	}

	public SegUsuario(String vidUsuario, ManPersona manPersona, SegPerfil segPerfil, String vclave, Boolean bactivo,
			Date dfecha, Date thora) {
		this.vidUsuario = vidUsuario;
		this.manPersona = manPersona;
		this.segPerfil = segPerfil;
		this.vclave = vclave;
		this.bactivo = bactivo;
		this.dfecha = dfecha;
		this.thora = thora;
	}

	@Id

	@Column(name = "vIdUsuario", unique = true, nullable = false, length = 20)
	public String getVidUsuario() {
		return this.vidUsuario;
	}

	public void setVidUsuario(String vidUsuario) {
		this.vidUsuario = vidUsuario;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "man_persona_vTipoDocumento", referencedColumnName = "vTipoDocumento", nullable = false),
			@JoinColumn(name = "man_persona_vNumeroDocumento", referencedColumnName = "vNumeroDocumento", nullable = false) })
	public ManPersona getManPersona() {
		return this.manPersona;
	}

	public void setManPersona(ManPersona manPersona) {
		this.manPersona = manPersona;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "seg_perfil_nIdPerfil", nullable = false)
	public SegPerfil getSegPerfil() {
		return this.segPerfil;
	}

	public void setSegPerfil(SegPerfil segPerfil) {
		this.segPerfil = segPerfil;
	}

	@Column(name = "vClave", length = 70)
	public String getVclave() {
		return this.vclave;
	}

	public void setVclave(String vclave) {
		this.vclave = vclave;
	}

	@Column(name = "bActivo")
	public Boolean getBactivo() {
		return this.bactivo;
	}

	public void setBactivo(Boolean bactivo) {
		this.bactivo = bactivo;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dFecha", length = 10)
	public Date getDfecha() {
		return this.dfecha;
	}

	public void setDfecha(Date dfecha) {
		this.dfecha = dfecha;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "tHora", length = 8)
	public Date getThora() {
		return this.thora;
	}

	public void setThora(Date thora) {
		this.thora = thora;
	}

}
