package Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Workout implements Serializable {

	private String id;
	private String izena;
	private String maila;
	private int ariketaKop;
	private String url;

	public Workout(String id, String nombre, String nivel, int numDeEjer, String url) {
		this.id = id;
		this.izena = nombre;
		this.maila = nivel;
		this.ariketaKop = numDeEjer;
		this.url = url;
	}

	public Workout() {
		this.id = "";
		this.izena = "";
		this.maila = "";
		this.ariketaKop = 0;
		this.url = "";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id; 
	}

	public String getNombre() {
		return izena;
	}

	public void setNombre(String nombre) {
		this.izena = nombre;
	}

	public String getNivel() {
		return maila;
	}

	public void setNivel(String nivel) {
		this.maila = nivel;
	}

	public int getNumDeEjer() {
		return ariketaKop;
	}

	public void setNumDeEjer(int numDeEjer) {
		this.ariketaKop = numDeEjer;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Workout: " + izena + " | Maila: " + maila + " | Ariketa kopurua: " + ariketaKop + " | URL: " + url;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Workout other = (Workout) obj;
		return id == other.id && Objects.equals(maila, other.maila) && Objects.equals(izena, other.izena)
				&& ariketaKop == other.ariketaKop && Objects.equals(url, other.url);
	}
}