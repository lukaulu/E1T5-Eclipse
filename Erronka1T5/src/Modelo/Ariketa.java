package Modelo;

import java.io.Serializable;
import java.util.Objects;

public class Ariketa implements Serializable{
	
	private int id;
	private String izena;
	private int serieKop;
	private int repKop;
	private String url;
	private int luzaeraSeg;
	private int idWorkout;
	private String desk;
	
	public Ariketa(int id, String nombre, int numSeries, int numRepeticiones, String url, int tiempoenSegs,int idWorkout, String desk) {
		this.id = id;
		this.izena = nombre;
		this.serieKop = numSeries;
		this.repKop = numRepeticiones;
		this.url = url;
		this.luzaeraSeg = tiempoenSegs;
		this.idWorkout = idWorkout;
		this.desk = desk;
	}
	
	public Ariketa() {
		this.id = 0;
		this.izena = "";
		this.serieKop = 0;
		this.repKop = 0;
		this.url = "";
		this.luzaeraSeg = 0;
		this.idWorkout = 0;
	}

	public String getDesk() {
		return desk;
	}

	public void setDesk(String desk) {
		this.desk = desk;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return izena;
	}

	public void setNombre(String nombre) {
		this.izena = nombre;
	}

	public int getNumSeries() {
		return serieKop;
	}

	public void setNumSeries(int numSeries) {
		this.serieKop = numSeries;
	}

	public int getNumRepeticiones() {
		return repKop;
	}

	public void setNumRepeticiones(int numRepeticiones) {
		this.repKop = numRepeticiones;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getTiempoenSegs() {
		return luzaeraSeg;
	}

	public void setTiempoenSegs(int tiempoenSegs) {
		this.luzaeraSeg = tiempoenSegs;
	}

	
	public int getIdWorkout() {
		return idWorkout;
	}
	
	public void setIdWorkout(int idWorkout) {
		this.idWorkout = idWorkout;
	}	
	
	@Override
	public String toString() {
		return  " " + izena ;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ariketa other = (Ariketa) obj;
		return id == other.id && Objects.equals(izena, other.izena) && repKop == other.repKop
				&& serieKop == other.serieKop && luzaeraSeg == other.luzaeraSeg && Objects.equals(url, other.url);
	}
	
	

}