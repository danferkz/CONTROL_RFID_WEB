package web.basic.crud.entities;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class UsuarioRolId implements Serializable {
    private Long usuarioId;
    private Long rolId;
    // constructores, equals, hashCode, etc.
	public Long getUsuarioId() {
		return usuarioId;
	}
	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}
	public Long getRolId() {
		return rolId;
	}
	public void setRolId(Long rolId) {
		this.rolId = rolId;
	}
}