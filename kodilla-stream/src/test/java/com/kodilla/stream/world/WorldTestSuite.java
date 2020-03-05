package com.kodilla.stream.world;

import com.kodilla.stream.sand.SandStorage;
import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;
import org.junit.Test;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

        public World prepareTestData() {

            //country
            Country country1 = new Country(new BigDecimal("211111110903703703670"));
            Country country2 = new Country(new BigDecimal("211111110903703703670"));
            Country country3 = new Country(new BigDecimal("211111110903703703670"));
            Country country4 = new Country(new BigDecimal("211111110903703703670"));
            Country country5 = new Country(new BigDecimal("211111110903703703670"));
            Country country6 = new Country(new BigDecimal("211111110903703703670"));

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
            List<Continent> getContinentList = new ArrayList<>();
            getContinentList.add(continent1);
            getContinentList.add(continent2);
            getContinentList.add(continent3);

            //world
            World world = new World(getContinentList);
            return world;

        }

    @Test
    public void testGetPeopleQuantity () {

        //Given
        World world = prepareTestData();

        //When
        //world.result
        //System.out.println(World.getPeopleQuantity);
        /*BigDecimal getPeopleQuantity = world.stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));*/

        //  }
    }


}



