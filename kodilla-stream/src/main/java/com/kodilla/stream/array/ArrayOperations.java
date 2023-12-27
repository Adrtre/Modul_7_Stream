package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        System.out.println("Liczby z tablicy:");
        IntStream.range(0, numbers.length)
                .mapToObj(index -> numbers[index])
                .forEach(number -> System.out.print(number + " "));

        double average = IntStream.range(0, numbers.length)
                .mapToDouble(index -> numbers[index])
                .average()
                .orElse(0.0);

        System.out.println("\nŚrednia: " + average);
        return average;
    }
}