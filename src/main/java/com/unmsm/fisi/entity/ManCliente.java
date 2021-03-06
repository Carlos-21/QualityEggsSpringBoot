package com.unmsm.fisi.entity;
// Generated 18/05/2019 03:01:04 PM by Hibernate Tools 5.0.6.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * ManCliente generated by hbm2java
 */
@Entity
@Table(name = "man_cliente", catalog = "qualityeggs")
public class ManCliente implements java.io.Serializable {

	private ManClienteId id;
	private ManPersona manPersona;
	private String vempresa;
	private String vrubro;
	private Set<RegPedidoCliente> regPedidoClientes = new HashSet<RegPedidoCliente>(0);

	public ManCliente() {
	}

	public ManCliente(ManPersona manPersona) {
		this.manPersona = manPersona;
	}

	public ManCliente(ManPersona manPersona, String vempresa, String vrubro, Set<RegPedidoCliente> regPedidoClientes) {
		this.manPersona = manPersona;
		this.vempresa = vempresa;
		this.vrubro = vrubro;
		this.regPedidoClientes = regPedidoClientes;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "manPersonaVNumeroDocumento", column = @Column(name = "man_persona_vNumeroDocumento", nullable = false, length = 20)),
			@AttributeOverride(name = "manPersonaVTipoDocumento", column = @Column(name = "man_persona_vTipoDocumento", nullable = false, length = 20)) })
	public ManClienteId getId() {
		return this.id;
	}

	public void setId(ManClienteId id) {
		this.id = id;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public ManPersona getManPersona() {
		return this.manPersona;
	}

	public void setManPersona(ManPersona manPersona) {
		this.manPersona = manPersona;
	}

	@Column(name = "vEmpresa", length = 50)
	public String getVempresa() {
		return this.vempresa;
	}

	public void setVempresa(String vempresa) {
		this.vempresa = vempresa;
	}

	@Column(name = "vRubro", length = 50)
	public String getVrubro() {
		return this.vrubro;
	}

	public void setVrubro(String vrubro) {
		this.vrubro = vrubro;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "manCliente")
	public Set<RegPedidoCliente> getRegPedidoClientes() {
		return this.regPedidoClientes;
	}

	public void setRegPedidoClientes(Set<RegPedidoCliente> regPedidoClientes) {
		this.regPedidoClientes = regPedidoClientes;
	}

}
