package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

        if (numbers == null) {

            throw new IllegalArgumentException("ArrayList is empty");

        }

        ArrayList<Integer> even = new ArrayList<>();

        for (Integer i : numbers) {

            if (i % 2 == 0) {

                even.add(i);

            }

        }

        return even;

    }

}

