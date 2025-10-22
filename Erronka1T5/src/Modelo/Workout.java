package Modelo;

import java.io.Serializable;
import java.util.Objects;

public class Workout implements Serializable {

	private String id;
	private String name;
	private String level;
	private int exerciseCount;
	private String url;

	public Workout(String id, String name, String level, int exerciseCount, String url) {
		this.id = id;
		this.name = name;
		this.level = level;
		this.exerciseCount = exerciseCount;
		this.url = url;
	}

	public Workout() {
		this.id = "";
		this.name = "";
		this.level = "";
		this.exerciseCount = 0;
		this.url = "";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id; 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public int getExerciseCount() {
		return exerciseCount;
	}

	public void setExerciseCount(int exerciseCount) {
		this.exerciseCount = exerciseCount;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Workout: " + name + " | Level: " + level + " | Exercise count: " + exerciseCount + " | URL: " + url;
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
		return Objects.equals(id, other.id)
				&& Objects.equals(level, other.level)
				&& Objects.equals(name, other.name)
				&& exerciseCount == other.exerciseCount
				&& Objects.equals(url, other.url);
	}
}
