package com.qa.persistence.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Screen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private int num_of_seats;

    protected Screen(){}

    public Screen(String title, String description, int num_of_seats) {
        this.title = title;
        this.description = description;
        this.num_of_seats = num_of_seats;
    }

    public int getNum_of_seats() {
        return num_of_seats;
    }

    public void setNum_of_seats(int num_of_seats) {
        this.num_of_seats = num_of_seats;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getScreenTitle() {
        return title;
    }

    public void setScreenTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Screen{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", num_of_seats=" + num_of_seats +
                '}';
    }

}
