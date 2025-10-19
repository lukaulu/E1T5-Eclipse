package Modelo;

import java.util.Objects;

public class HistorialWorkout {

	private String email;
	private java.util.Date dataH;
	private int luzeeraTotala;
	private int idWorkout;
	private int egindakoSerieak;
	private String izena;
	private int luzeeraPrevista;
	private int serieTotala;
	private String nivel;

	public HistorialWorkout(String email, java.util.Date fecha, int tiempoTotal, int idWorkout, int egindakoSerieak) {
		this.email = email;
		this.dataH = fecha;
		this.luzeeraTotala = tiempoTotal;
		this.idWorkout = idWorkout;
		this.egindakoSerieak = egindakoSerieak; 
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public int getSerieTotala() {
		return serieTotala;
	}

	public void setSerieTotala(int serieTotala) {
		this.serieTotala = serieTotala;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getIzena() {
		return izena;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public java.util.Date getFecha() {
		return dataH;
	}

	public int getluzeeraPrevistan() {
		return luzeeraPrevista;
	}

	public void setluzeeraPrevista(int luzeeraSegundutan) {
		this.luzeeraPrevista = luzeeraSegundutan;
	}

	public void setFecha(java.util.Date fecha) {
		this.dataH = fecha;
	}

	public int getTiempoTotal() {
		return luzeeraTotala;
	}

	public void setTiempoTotal(int tiempoTotal) {
		this.luzeeraTotala = tiempoTotal;
	}

	public int getIdWorkout() {
		return idWorkout;
	}

	public void setIdWorkout(int idWorkout) {
		this.idWorkout = idWorkout;
	}

	public int getEgindakoSerieak() {
		return egindakoSerieak;
	}

	public void setEgindakoSerieak(int egindakoSerieak) {
		this.egindakoSerieak = egindakoSerieak;
	}

	public String egindakoEhunekoa() {
		String ar = "";

		int egindakoa = this.egindakoSerieak;
		int totala = this.serieTotala;
		
		double ehunekoa = (double) egindakoa * 100 / totala ;
		ar = String.format("%.2f%%", ehunekoa);

		return ar;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HistorialWorkout other = (HistorialWorkout) obj;
		return egindakoSerieak == other.egindakoSerieak && Objects.equals(email, other.email)
				&& Objects.equals(dataH, other.dataH) && idWorkout == other.idWorkout
				&& luzeeraTotala == other.luzeeraTotala;
	}

	@Override
	public String toString() {
		return "HistorialWorkout [email=" + email + ", fecha=" + dataH + ", tiempoTotal=" + luzeeraTotala
				+ ", idWorkout=" + idWorkout + ", egindakoSerieak=" + egindakoSerieak + "]";
	}

}
