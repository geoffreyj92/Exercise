package com.example.Exercise.model;

import java.time.LocalDate;
import java.util.Objects;

public class Exercise {

    private Integer id;
    private String name;
    private LocalDate date;
    private boolean complete;

    public Exercise(Integer id, String name, LocalDate date, boolean complete) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.complete = complete;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exercise exercise = (Exercise) o;
        return complete == exercise.complete && id.equals(exercise.id) && name.equals(exercise.name) && date.equals(exercise.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, date, complete);
    }

    @Override
    public String toString() {
        return "Exercise{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", complete=" + complete +
                '}';
    }
}
