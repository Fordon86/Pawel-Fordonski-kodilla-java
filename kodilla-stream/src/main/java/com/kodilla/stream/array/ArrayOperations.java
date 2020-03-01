package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static Double getAverage(int [] numbers) {

        IntStream.range(0, numbers.length)
                .forEach(i -> System.out.print(numbers[i] + " "));

        OptionalDouble x = IntStream.of(numbers)
                .average();
                return x.getAsDouble();
    }


}
