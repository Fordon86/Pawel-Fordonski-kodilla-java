package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

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
