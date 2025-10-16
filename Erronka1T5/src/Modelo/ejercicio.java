package Modelo;

public class ejercicio {
	
	private String nombre;
	private String descripcion;
	private int tSegs; //en segundos
	private int nSeries;
	private int nRepeticiones;
	
	public ejercicio(String nombre, String descripcion, int tSegs, int nSeries, int nRepeticiones) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.tSegs = tSegs;
		this.nSeries = nSeries;
		this.nRepeticiones = nRepeticiones;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int gettSegs() {
		return tSegs;
	}

	public void settSegs(int tSegs) {
		this.tSegs = tSegs;
	}

	public int getnSeries() {
		return nSeries;
	}

	public void setnSeries(int nSeries) {
		this.nSeries = nSeries;
	}

	public int getnRepeticiones() {
		return nRepeticiones;
	}

	public void setnRepeticiones(int nRepeticiones) {
		this.nRepeticiones = nRepeticiones;
	}
	
	

}
