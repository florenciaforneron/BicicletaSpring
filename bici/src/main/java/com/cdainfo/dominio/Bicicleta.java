package com.cdainfo.dominio;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bicicleta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "rodado")
	private String rodado;
	
	@Column(name = "precio")
	private Double precio;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRodado() {
		return rodado;
	}

	public void setRodado(String rodado) {
		this.rodado = rodado;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	@Override
	public String toString(){
		return "Bicicleta: \n" +
					" id: " + this.id +
						" \n rodado: " + this.rodado +
							" \n precio: " + this.precio;
	}
	
	

}
