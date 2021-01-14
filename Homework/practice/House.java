package practice;

import java.util.Objects;

public class House {
    private int id;
    private int roomNum;
    private int square;
    private int floor;
    private int numOfRooms;
    private String street;
    private String city;
    private String timeOfExploitation;

    public House(int id, int roomNum, int square, int floor, int numOfRooms,
                 String street, String city, String timeOfExploitation){

        this.id = id;
        this.roomNum = roomNum;
        this.square = square;
        this.floor = floor;
        this.numOfRooms = numOfRooms;
        this.street = street;
        this.city = city;
        this.timeOfExploitation = timeOfExploitation;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", roomNum=" + roomNum +
                ", square=" + square +
                ", floor=" + floor +
                ", numOfRooms=" + numOfRooms +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", timeOfExploitation='" + timeOfExploitation + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return id == house.id && roomNum == house.roomNum && square == house.square && floor == house.floor &&
                numOfRooms == house.numOfRooms && Objects.equals(street, house.street) &&
                Objects.equals(city, house.city) && Objects.equals(timeOfExploitation, house.timeOfExploitation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, roomNum, square, floor, numOfRooms, street, city, timeOfExploitation);
    }
}
