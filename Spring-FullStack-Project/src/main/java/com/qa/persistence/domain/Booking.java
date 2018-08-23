package com.qa.persistence.domain;

import javax.persistence.*;

@Entity
public class Booking  extends Transaction{

    private String name;
    private Long seat_nums;
    private String time;
    private String booking_date;
    private String booking_movie;

    protected Booking(){}

    public Booking(String name, Long seat_nums, String time, String booking_date, String booking_movie) {
        this.name = name;
        this.seat_nums = seat_nums;
        this.time = time;
        this.booking_date = booking_date;
        this.booking_movie = booking_movie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSeat_nums() {
        return seat_nums;
    }

    public void setSeat_nums(Long seat_nums) {
        this.seat_nums = seat_nums;
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

    @Override
    public String toString() {
        return "Booking{" +
                "name='" + name + '\'' +
                ", seat_nums=" + seat_nums +
                ", time='" + time + '\'' +
                ", booking_date='" + booking_date + '\'' +
                ", booking_movie='" + booking_movie + '\'' +
                '}';
    }
}
