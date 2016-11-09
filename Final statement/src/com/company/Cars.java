package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arteman on 15.08.16.
 */
public class Cars {
    private final String name;
    private static int count;
    private List<Seat> seats;

    public Cars (String name,int count){
        this.name = name;
        this.count+=count;
        seats = new ArrayList<>();
    }

    public int getSeats() {
        return seats.size();
    }
    public Seat getSeat(int num){
        return seats.get(num);
    }

    public int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }
    public void add_seat (int seat_num){
        seats.add(new Seat(seat_num));
    }
    public class Seat {
        private int seat_num;
        private Seat seat;
        private boolean drivers_seat = false;

        public Seat (int seat_num){
            this.seat_num = seat_num;

        }

        public boolean isDrivers_seat() {
            return drivers_seat;
        }

        public void setDrivers_seat(boolean drivers_seat) {
            this.drivers_seat = drivers_seat;
        }
    }
}
