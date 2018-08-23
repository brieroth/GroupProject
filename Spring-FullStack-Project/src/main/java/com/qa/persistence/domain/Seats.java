package com.qa.persistence.domain;

import javax.persistence.*;

@Entity
public class Seats {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long seats_id;
    private String seat_status;
    private Long screen_id;

    protected Seats(){}

    public Seats(String seat_status, Long screen_id) {
        this.seat_status = seat_status;
        this.screen_id = screen_id;
    }

    public Long getSeats_id() {
        return seats_id;
    }

    public void setSeats_id(Long seats_id) {
        this.seats_id = seats_id;
    }

    public String getSeat_status() {
        return seat_status;
    }

    public void setSeat_status(String seat_status) {
        this.seat_status = seat_status;
    }

    public Long getScreen_id() {
        return screen_id;
    }

    public void setScreen_id(Long screen_id) {
        this.screen_id = screen_id;
    }

    @Override
    public String toString() {
        return "Seats{" +
                "seats_id=" + seats_id +
                ", seat_status='" + seat_status + '\'' +
                ", screen_id=" + screen_id +
                '}';
    }

}
