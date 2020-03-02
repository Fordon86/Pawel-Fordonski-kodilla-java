package com.kodilla.stream.world;

import java.util.List;

public class Continent {
    private List <Country> countryList;
    public List <Country> getCountryList(){
        return countryList;
    }
    public Continent (List<Country> countryList){
        this.countryList=countryList;
    }

    public void setCountryList(List<Country> countryList) {
        this.countryList=countryList;
    }
}
