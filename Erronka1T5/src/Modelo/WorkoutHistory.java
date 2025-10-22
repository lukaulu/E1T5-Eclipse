package Modelo;

import java.util.Objects;
import java.util.Date;

public class WorkoutHistory {

	private String email;
	private Date date;
	private int totalDuration;
	private int workoutId;
	private int completedSeries;
	private String name;
	private int plannedDuration;
	private int totalSeries;
	private String level;

	public WorkoutHistory(String email, Date date, int totalDuration, int workoutId, int completedSeries) {
		this.email = email;
		this.date = date;
		this.totalDuration = totalDuration;
		this.workoutId = workoutId;
		this.completedSeries = completedSeries;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalSeries() {
		return totalSeries;
	}

	public void setTotalSeries(int totalSeries) {
		this.totalSeries = totalSeries;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getPlannedDuration() {
		return plannedDuration;
	}

	public void setPlannedDuration(int plannedDuration) {
		this.plannedDuration = plannedDuration;
	}

	public int getTotalDuration() {
		return totalDuration;
	}

	public void setTotalDuration(int totalDuration) {
		this.totalDuration = totalDuration;
	}

	public int getWorkoutId() {
		return workoutId;
	}

	public void setWorkoutId(int workoutId) {
		this.workoutId = workoutId;
	}

	public int getCompletedSeries() {
		return completedSeries;
	}

	public void setCompletedSeries(int completedSeries) {
		this.completedSeries = completedSeries;
	}

	public String getCompletionPercentage() {
		if (totalSeries == 0) return "0.00%";
		double percentage = (double) completedSeries * 100 / totalSeries;
		return String.format("%.2f%%", percentage);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WorkoutHistory other = (WorkoutHistory) obj;
		return completedSeries == other.completedSeries 
				&& Objects.equals(email, other.email)
				&& Objects.equals(date, other.date)
				&& workoutId == other.workoutId
				&& totalDuration == other.totalDuration;
	}

	@Override
	public String toString() {
		return "WorkoutHistory [email=" + email + ", date=" + date + ", totalDuration=" + totalDuration
				+ ", workoutId=" + workoutId + ", completedSeries=" + completedSeries + "]";
	}
}
