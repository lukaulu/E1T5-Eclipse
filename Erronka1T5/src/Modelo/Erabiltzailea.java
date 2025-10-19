package Modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.xml.crypto.Data;

public class Erabiltzailea implements Serializable{

	private int id;
	private String izena;
	private String abizena;
	private String email;
	private String password;
	private boolean entrenador;
	private Date jaiotzaData;
	private String maila;

	public Erabiltzailea(int id, String nombre, String apellido, String email, String password, boolean entrenador,
			Date fechaNacimiento, String nivel) {
		this.izena = nombre;
		this.abizena = apellido;
		this.email = email;
		this.password = password;
		this.entrenador = entrenador;
		this.jaiotzaData = fechaNacimiento;
		this.maila = nivel;
	}

	public Erabiltzailea(String nombre, String apellido, String email, String password, 
			Date fechaNacimiento) {
		this.izena = nombre;
		this.abizena = apellido;
		this.email = email;
		this.password = password;
		this.jaiotzaData = fechaNacimiento;
		this.maila = "hasiberri";
		this.entrenador = false;
	}

	public Erabiltzailea() {
		this.id = 0;
		this.izena = "";
		this.abizena = "";
		this.email = "";
		this.password = "";
		this.entrenador = false;
		this.jaiotzaData = null;
		this.maila = "";
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

	public String getApellido() {
		return abizena;
	}

	public void setApellido(String apellido) {
		this.abizena = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEntrenador() {
		return entrenador;
	}

	public void setEntrenador(boolean entrenador) {
		this.entrenador = entrenador;
	}

	public Date getFechaNacimiento() {
		return jaiotzaData;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.jaiotzaData = fechaNacimiento;
	}

	public String getNivel() {
		return maila;
	}

	public void setNivel(String nivel) {
		this.maila = nivel;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + izena + ", apellido=" + abizena + ", email=" + email
				+ ", password=" + password + ", entrenador=" + entrenador + ", fechaNacimiento=" + jaiotzaData
				+ ", nivel=" + maila +  "]";
	}
	
	public String idatziDat() {
		return id +"\n"+ izena +"\n"+abizena +"\n"+email+"\n"+password +"\n"+ entrenador +"\n"+ jaiotzaData +"\n"+maila;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Erabiltzailea other = (Erabiltzailea) obj;
		return Objects.equals(abizena, other.abizena) && Objects.equals(email, other.email)
				&& entrenador == other.entrenador && Objects.equals(jaiotzaData, other.jaiotzaData)
				&& id == other.id && Objects.equals(maila, other.maila) && Objects.equals(izena, other.izena)
				&& Objects.equals(password, other.password);
	}
}