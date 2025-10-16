package Modelo;

public class usuario {
	
	private String nombre;
	private String apedillo;
	private String fechaNacimiento;
	private String email;
	private String pass;
	
	public usuario(String nombre, String apedillo, String fechaNacimiento, String email, String pass) {
		super();
		this.nombre = nombre;
		this.apedillo = apedillo;
		this.fechaNacimiento = fechaNacimiento;
		this.email = email;
		this.pass = pass;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApedillo() {
		return apedillo;
	}

	public void setApedillo(String apedillo) {
		this.apedillo = apedillo;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
}
