package com.unmsm.fisi.entity;
// Generated 18/05/2019 03:01:04 PM by Hibernate Tools 5.0.6.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * SegPerfil generated by hbm2java
 */
@Entity
@Table(name = "seg_perfil", catalog = "qualityeggs")
public class SegPerfil implements java.io.Serializable {

	private Integer nidPerfil;
	private String vnombre;
	private String vdescripcion;
	private Set<SegUsuario> segUsuarios = new HashSet<SegUsuario>(0);

	public SegPerfil() {
	}

	public SegPerfil(String vnombre, String vdescripcion, Set<SegUsuario> segUsuarios) {
		this.vnombre = vnombre;
		this.vdescripcion = vdescripcion;
		this.segUsuarios = segUsuarios;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "nIdPerfil", unique = true, nullable = false)
	public Integer getNidPerfil() {
		return this.nidPerfil;
	}

	public void setNidPerfil(Integer nidPerfil) {
		this.nidPerfil = nidPerfil;
	}

	@Column(name = "vNombre", length = 40)
	public String getVnombre() {
		return this.vnombre;
	}

	public void setVnombre(String vnombre) {
		this.vnombre = vnombre;
	}

	@Column(name = "vDescripcion", length = 50)
	public String getVdescripcion() {
		return this.vdescripcion;
	}

	public void setVdescripcion(String vdescripcion) {
		this.vdescripcion = vdescripcion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "segPerfil")
	public Set<SegUsuario> getSegUsuarios() {
		return this.segUsuarios;
	}

	public void setSegUsuarios(Set<SegUsuario> segUsuarios) {
		this.segUsuarios = segUsuarios;
	}

}