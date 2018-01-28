package com.kodilla.testing.collection;



import java.util.ArrayList;



public class OddNumbersExterminator {

  

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

        if (numbers == null) {

            throw new IllegalArgumentException("ArrayList is null");

        }

        ArrayList<Integer> evens = new ArrayList<>();

        for (Integer i : numbers) {

            if (i % 2 == 0) {

                evens.add(i);

            }

        }

        return evens;

    }


}

