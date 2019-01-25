package com.kodilla.testing.collection;

import java.util.ArrayList;

import java.util.*;
import java.lang.*;

public class OddNumbersExterminator {

    ArrayList<Integer> numbers = new ArrayList<Integer>();
    ArrayList<Integer> evenNumbers = new ArrayList<Integer>();


    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public ArrayList<Integer> getEvenNumbers() {
        return evenNumbers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OddNumbersExterminator that = (OddNumbersExterminator) o;
        return getNumbers().equals(that.getNumbers()) &&
                getEvenNumbers().equals(that.getEvenNumbers());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumbers(), getEvenNumbers());
    }




    public ArrayList<Integer> exterminate(ArrayList<Integer>numbers){

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);


        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }
}

