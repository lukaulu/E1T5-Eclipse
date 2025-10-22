package Modelo;

import java.io.Serializable;
import java.util.Objects;

public class Exercise implements Serializable {
	
	private int id;
	private String name;
	private int seriesCount;
	private int repetitionsCount;
	private String url;
	private int durationSeconds;
	private int workoutId;
	private String description;
	
	public Exercise(int id, String name, int seriesCount, int repetitionsCount, String url, int durationSeconds, int workoutId, String description) {
		this.id = id;
		this.name = name;
		this.seriesCount = seriesCount;
		this.repetitionsCount = repetitionsCount;
		this.url = url;
		this.durationSeconds = durationSeconds;
		this.workoutId = workoutId;
		this.description = description;
	}
	
	public Exercise() {
		this.id = 0;
		this.name = "";
		this.seriesCount = 0;
		this.repetitionsCount = 0;
		this.url = "";
		this.durationSeconds = 0;
		this.workoutId = 0;
		this.description = "";
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public int getSeriesCount() {
		return seriesCount;
	}

	public void setSeriesCount(int seriesCount) {
		this.seriesCount = seriesCount;
	}

	public int getRepetitionsCount() {
		return repetitionsCount;
	}

	public void setRepetitionsCount(int repetitionsCount) {
		this.repetitionsCount = repetitionsCount;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getDurationSeconds() {
		return durationSeconds;
	}

	public void setDurationSeconds(int durationSeconds) {
		this.durationSeconds = durationSeconds;
	}

	public int getWorkoutId() {
		return workoutId;
	}
	
	public void setWorkoutId(int workoutId) {
		this.workoutId = workoutId;
	}	
	
	@Override
	public String toString() {
		return " " + name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exercise other = (Exercise) obj;
		return id == other.id && Objects.equals(name, other.name)
				&& repetitionsCount == other.repetitionsCount
				&& seriesCount == other.seriesCount
				&& durationSeconds == other.durationSeconds
				&& Objects.equals(url, other.url);
	}
}
