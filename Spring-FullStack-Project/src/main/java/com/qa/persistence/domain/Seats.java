package com.qa.persistence.domain;

import javax.persistence.*;

@Entity
public class Seats {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int seats_id;

    private int seat_num;

    protected Seats() {
    }

    public Seats(int seats_id, int seat_num) {
        this.seats_id = seats_id;
        this.seat_num = seat_num;
    }

    public int getSeats_id() {
        return seats_id;
    }

    public void setSeats_id(int seats_id) {
        this.seats_id = seats_id;
    }

    public int getSeat_num() {
        return seat_num;
    }

    public void setSeat_num(int seat_num) {
        this.seat_num = seat_num;
    }
}

