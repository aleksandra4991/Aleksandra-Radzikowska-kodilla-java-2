package com.kodilla.stream.array;

import java.util.stream.IntStream;

public final class Array implements ArrayOperations{

    private final ArrayOperations arrayOperations;

    public Array(final ArrayOperations arrayOperations) {
        this.arrayOperations = arrayOperations;
    }

    public ArrayOperations getArrayOperations() {
        return arrayOperations;
    }

    @Override
    public final double getAverage(int[]numbers){
        double average;
        return average= IntStream.range(0,numbers.length)
                .IntStream.range(0,numbers.length).average();

    }


}

