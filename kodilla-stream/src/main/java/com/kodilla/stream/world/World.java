package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;

public class World {

    private List<Continent> continentList;
    public List<Continent> getContinentList(){
        return continentList;
    }
    public World (List<Continent> continentList){
        this.continentList=continentList;
    }
    public void setContinentList (List<Continent> continentList){
        this.continentList=continentList;
    }
    public BigDecimal getPeopleQuantity (){

        BigDecimal result = continentList.stream().flatMap(continent -> continent.getCountryList().stream())
               .map(Country::getPeopleQuantity)
               .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

       return result;
    }


}
