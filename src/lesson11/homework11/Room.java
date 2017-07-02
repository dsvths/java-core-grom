package lesson11.homework11;

import java.util.Date;

/**
 * Created by Savenko on 29.06.2017.
 */
public class Room {
    private long id;
    private int price;
    private int persons;
    private Date dataAvailableFrom;
    private String hotelName;
    private String cityName;

    public Room(long id, int price, int persons, Date dataAvailableFrom, String hotelName, String cityName) {
        this.id = id;
        this.price = price;
        this.persons = persons;
        this.dataAvailableFrom = dataAvailableFrom;
        this.hotelName = hotelName;
        this.cityName = cityName;
    }

    public long getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public int getPersons() {
        return persons;
    }

    public Date getDataAvailableFrom() {
        return dataAvailableFrom;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}