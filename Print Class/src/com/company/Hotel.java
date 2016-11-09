package com.company;

/**
 * Created by Arteman on 25.08.16.
 */
public class Hotel {
    private String name;
    private int roomNumbers;
    private Hotel_Type hotel_type;
    public enum Hotel_Type{
        LUX,
        NORMAL,
        ECONOMY
    }

    public Hotel(String name, int roomNumbers, Hotel_Type hotel_type) {
        this.name = name;
        this.roomNumbers = roomNumbers;
        this.hotel_type = hotel_type;
    }

    @Override
    public String toString() {
        return "Hotel name  "+name+". Quantity of roomnumbers = "+roomNumbers+". Category = "+this.hotel_type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hotel hotel = (Hotel) o;

        if (roomNumbers != hotel.roomNumbers) return false;
        if (name != null ? !name.equals(hotel.name) : hotel.name != null) return false;
        return hotel_type == hotel.hotel_type;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + roomNumbers;
        result = 31 * result + (hotel_type != null ? hotel_type.hashCode() : 0);
        return result;
    }

 /*   @Override
    public boolean equals(Object obj) {
        //if (this.getClass() == obj.getClass())
        if (obj instanceof Hotel)
            return true;
        else
            return false;
        //return super.equals(obj);
    }
 */
}
