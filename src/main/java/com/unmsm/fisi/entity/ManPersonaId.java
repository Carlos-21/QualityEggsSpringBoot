package com.unmsm.fisi.entity;
// Generated 18/05/2019 03:01:04 PM by Hibernate Tools 5.0.6.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ManPersonaId generated by hbm2java
 */
@Embeddable
public class ManPersonaId implements java.io.Serializable {

	private String vtipoDocumento;
	private String vnumeroDocumento;

	public ManPersonaId() {
	}

	public ManPersonaId(String vtipoDocumento, String vnumeroDocumento) {
		this.vtipoDocumento = vtipoDocumento;
		this.vnumeroDocumento = vnumeroDocumento;
	}

	@Column(name = "vTipoDocumento", nullable = false, length = 20)
	public String getVtipoDocumento() {
		return this.vtipoDocumento;
	}

	public void setVtipoDocumento(String vtipoDocumento) {
		this.vtipoDocumento = vtipoDocumento;
	}

	@Column(name = "vNumeroDocumento", nullable = false, length = 20)
	public String getVnumeroDocumento() {
		return this.vnumeroDocumento;
	}

	public void setVnumeroDocumento(String vnumeroDocumento) {
		this.vnumeroDocumento = vnumeroDocumento;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ManPersonaId))
			return false;
		ManPersonaId castOther = (ManPersonaId) other;

		return ((this.getVtipoDocumento() == castOther.getVtipoDocumento())
				|| (this.getVtipoDocumento() != null && castOther.getVtipoDocumento() != null
						&& this.getVtipoDocumento().equals(castOther.getVtipoDocumento())))
				&& ((this.getVnumeroDocumento() == castOther.getVnumeroDocumento())
						|| (this.getVnumeroDocumento() != null && castOther.getVnumeroDocumento() != null
								&& this.getVnumeroDocumento().equals(castOther.getVnumeroDocumento())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getVtipoDocumento() == null ? 0 : this.getVtipoDocumento().hashCode());
		result = 37 * result + (getVnumeroDocumento() == null ? 0 : this.getVnumeroDocumento().hashCode());
		return result;
	}

}
