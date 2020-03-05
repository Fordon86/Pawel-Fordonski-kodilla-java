package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

        public World prepareTestData() {

            //country
            Country country1 = new Country(new BigDecimal("1"));
            Country country2 = new Country(new BigDecimal("2"));
            Country country3 = new Country(new BigDecimal("3"));
            Country country4 = new Country(new BigDecimal("4"));
            Country country5 = new Country(new BigDecimal("5"));
            Country country6 = new Country(new BigDecimal("6"));

            List<Country> countryList1 = new ArrayList<>();
            countryList1.add(country1);
            countryList1.add(country2);
            List<Country> countryList2 = new ArrayList<>();
            countryList1.add(country3);
            countryList1.add(country4);
            List<Country> countryList3 = new ArrayList<>();
            countryList1.add(country5);
            countryList1.add(country6);

            //continent
            Continent continent1 = new Continent(countryList1);
            Continent continent2 = new Continent(countryList2);
            Continent continent3 = new Continent(countryList3);
            List<Continent> continentList = new ArrayList<>();
            continentList.add(continent1);
            continentList.add(continent2);
            continentList.add(continent3);

            //world
            World world = new World(continentList);
            return world;

        }

    @Test
    public void testGetPeopleQuantity () {

        //Given
        World world = prepareTestData();

        //When
        BigDecimal result = world.getPeopleQuantity();

        //Them
        Assert.assertEquals(new BigDecimal(21), result);
    }

}



