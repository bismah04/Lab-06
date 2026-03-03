package com.example.listcity;

import java.util.Objects;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable {
    /**
     * The name of the city.
     */
    private String city;
    /**
     * The name of the province.
     */
    private String province;

    /**
     * Constructor for City.
     * @param city Name of the city.
     * @param province Name of the province.
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * Gets the city name.
     * @return The city name.
     */
    String getCityName(){
        return this.city;
    }

    /**
     * Gets the province name.
     * @return The province name.
     */
    String getProvinceName(){
        return this.province;
    }

    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return Objects.equals(city, city1.city) && Objects.equals(province, city1.province);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}
