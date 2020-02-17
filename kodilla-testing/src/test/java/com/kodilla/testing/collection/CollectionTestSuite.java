package com.kodilla.testing.collection;
import java.util.ArrayList;
import org.junit.*;

public class CollectionTestSuite {
    private static int testCounter = 0;

    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Startet test " + testCounter + ".");
    }

    @After
    public void afterEveryTest() {
        System.out.println("Test " + testCounter + " completed.");
    }

    @Test
    public void testOddNumbersExterminatorNormalList  () {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(6);
        numbers.add(37);
        //When
        ArrayList<Integer> evenNumbers = oddNumbersExterminator.exterminate(numbers);
        //Then
        for (int n = 0; n < evenNumbers.size(); n++) {
            if (evenNumbers.get(n) % 2 != 0) {
                Assert.assertTrue("Not even", false );
            }
        }
     }
     @Test
    public void testOddNumbersExterminatorEmptyList() {
         //Given
         OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
         ArrayList<Integer> numbers = new ArrayList<Integer>();
         //When
         ArrayList<Integer> evenNumbers = oddNumbersExterminator.exterminate(numbers);
         //Then
     }
}