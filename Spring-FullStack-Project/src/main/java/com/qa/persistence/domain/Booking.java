package com.qa.persistence.domain;

import javax.persistence.*;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
public class Booking  extends Transaction{

    private String name;
    private String time;
    private String booking_date;
    private String booking_movie;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Seats> seats;

    protected Booking(){}

    public Booking(String name, String time, String booking_date, String booking_movie, List<Seats> seats) {
        this.name = name;
        this.time = time;
        this.booking_date = booking_date;
        this.booking_movie = booking_movie;
        this.seats = seats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getBooking_date() {
        return booking_date;
    }

    public void setBooking_date(String booking_date) {
        this.booking_date = booking_date;
    }

    public String getBooking_movie() {
        return booking_movie;
    }

    public void setBooking_movie(String booking_movie) {
        this.booking_movie = booking_movie;
    }

    public List<Seats> getSeats() {
        return seats;
    }

    public void setSeats(List<Seats> seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "name='" + name + '\'' +
                ", time='" + time + '\'' +
                ", booking_date='" + booking_date + '\'' +
                ", booking_movie='" + booking_movie + '\'' +
                ", seats=" + seats +
                '}';
    }

}
