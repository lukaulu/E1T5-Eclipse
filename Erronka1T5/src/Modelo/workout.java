package Modelo;

public class workout {
	
	private String nombre;
	private String nivel;
	private int NEjercicios;
	
	public workout(String nombre, String nivel, int nEjercicios) {
		super();
		this.nombre = nombre;
		this.nivel = nivel;
		NEjercicios = nEjercicios;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public int getNEjercicios() {
		return NEjercicios;
	}

	public void setNEjercicios(int nEjercicios) {
		NEjercicios = nEjercicios;
	}
	
	

}
