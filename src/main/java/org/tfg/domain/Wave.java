package org.tfg.domain;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Wave {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private LocalDate fechaLike;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Usuario daWave;

	@ManyToOne(cascade = CascadeType.ALL)
	private Publicacion publicacionWaved;

	public Wave(LocalDate fechaLike, Usuario daWave, Publicacion publicacionWaved) {
		super();
		this.fechaLike = fechaLike;
		this.daWave = daWave;
		this.publicacionWaved = publicacionWaved;
	}

	public LocalDate getFechaLike() {
		return fechaLike;
	}

	public void setFechaLike(LocalDate fechaLike) {
		this.fechaLike = fechaLike;
	}

	public Usuario getDaWave() {
		return daWave;
	}

	public void setDaWave(Usuario daWave) {
		this.daWave = daWave;
	}

	public Publicacion getPublicacionWaved() {
		return publicacionWaved;
	}

	public void setPublicacionWaved(Publicacion publicacionWaved) {
		this.publicacionWaved = publicacionWaved;
	}
	
}