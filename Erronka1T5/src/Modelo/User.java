package Modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class User implements Serializable {

	private int id;
	private String name;
	private String surname;
	private String email;
	private String password;
	private boolean trainer;
	private Date birthDate;
	private String level;

	public User(int id, String name, String surname, String email, String password, boolean trainer,
			Date birthDate, String level) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
		this.trainer = trainer;
		this.birthDate = birthDate;
		this.level = level;
	}

	public User(String name, String surname, String email, String password, Date birthDate) {
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
		this.birthDate = birthDate;
		this.level = "beginner";
		this.trainer = false;
	}

	public User() {
		this.id = 0;
		this.name = "";
		this.surname = "";
		this.email = "";
		this.password = "";
		this.trainer = false;
		this.birthDate = null;
		this.level = "";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
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

	public boolean isTrainer() {
		return trainer;
	}

	public void setTrainer(boolean trainer) {
		this.trainer = trainer;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", surname=" + surname + ", email=" + email
				+ ", password=" + password + ", trainer=" + trainer + ", birthDate=" + birthDate
				+ ", level=" + level + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(surname, other.surname) && Objects.equals(email, other.email)
				&& trainer == other.trainer && Objects.equals(birthDate, other.birthDate)
				&& id == other.id && Objects.equals(level, other.level)
				&& Objects.equals(name, other.name)
				&& Objects.equals(password, other.password);
	}
}
