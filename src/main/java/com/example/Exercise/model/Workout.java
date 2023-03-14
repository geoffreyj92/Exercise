package com.example.Exercise.model;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Objects;
@Component
public class Workout {

    @Id
    private Integer workoutId;
    private String workoutName;
    private boolean completed;
    private LocalDate workoutDate;


    public Workout(Integer workoutId, String workoutName, boolean completed, LocalDate workoutDate) {
        this.workoutId = workoutId;
        this.workoutName = workoutName;
        this.completed = completed;
        this.workoutDate = workoutDate;

    }

    public Workout() {
    }

    public Integer getWorkoutId() {
        return workoutId;
    }

    public void setWorkoutId(Integer workoutId) {
        this.workoutId = workoutId;
    }

    public String getWorkoutName() {
        return workoutName;
    }

    public void setWorkoutName(String workoutName) {
        this.workoutName = workoutName;
    }

    public LocalDate getWorkoutDate() {
        return workoutDate;
    }

    public void setWorkoutDate(LocalDate workoutDate) {
        this.workoutDate = workoutDate;
    }

    public boolean isComplete() {
        return completed;
    }

    public void setCompleted(boolean complete) {
        this.completed = complete;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Workout workout = (Workout) o;
        return completed == workout.completed && workoutId.equals(workout.workoutId) && workoutName.equals(workout.workoutName) && workoutDate.equals(workout.workoutDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workoutId, workoutName, workoutDate, completed);
    }

    @Override
    public String toString() {
        return "Workout{" +
                "id=" + workoutId +
                ", name='" + workoutName + '\'' +
                ", date=" + workoutDate +
                ", complete=" + completed +
                '}';
    }
}
