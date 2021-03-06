package org.tfg.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
public class Seguimiento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private boolean aceptado;

	@OnDelete(action = OnDeleteAction.CASCADE)
	@ManyToOne
	private Usuario seguidor;

	@OnDelete(action = OnDeleteAction.CASCADE)
	@ManyToOne
	private Usuario seguido;

	public Seguimiento(boolean aceptado, Usuario seguidor, Usuario seguido) {
		super();
		this.aceptado = aceptado;
		this.seguidor = seguidor;
		this.seguido = seguido;
	}
	
	public Seguimiento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean getAceptado() {
		return aceptado;
	}

	public void setAceptado(boolean aceptado) {
		this.aceptado = aceptado;
	}

	public Usuario getSeguidor() {
		return seguidor;
	}

	public void setSeguidor(Usuario seguidor) {
		this.seguidor = seguidor;
	}

	public Usuario getSeguido() {
		return seguido;
	}

	public void setSeguido(Usuario seguido) {
		this.seguido = seguido;
	}
	
	

}
