package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city: This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This checks if the city exists in the list or not
     * @param city: candidate city to check for
     * @return
     * return the true/false
     * */
    public boolean hasCity(City city){
        return cities.contains(city);
    }

    /**
     * This deletes a city to the from the list if it exists
     * @param city: Candidate city to delete
     * */
    public void delete(City city){
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /**
     * This counts the number of cities in the list
     * @return no_of_cities: int
     * */
    public int countCities(){
        return cities.size();
    }
}