package com.kodilla.testing.collection;

import org.junit.*;
import java.util.*;

import static org.junit.Assert.*;

public class CollectionTestSuite {

    @BeforeClass

    public static void beforeClass() {

        System.out.println("CollectionTestSuite BEGIN");

    }

    @AfterClass

    public static void afterClass() {

        System.out.println("CollectionTestSuite END");

    }

    @Before

    public void before() {

        System.out.println("Test unit BEGIN");

    }

    @After

    public void after() {

        System.out.println("Test unit END");

    }

    @Test

    public void testOddNumbersExterminatorEmptyList() {

        // given

        OddNumbersExterminator exterm = new OddNumbersExterminator();

        ArrayList<Integer> emptyList = new ArrayList<>();

        //when

        ArrayList<Integer> result = exterm.exterminate(emptyList);

        //then

        assertNotNull(result);

        assertTrue(result.isEmpty());

    }


    @Test

    public void testOddNumbersExterminatorNormalList() {

        //given

        OddNumbersExterminator exterm = new OddNumbersExterminator();

        ArrayList<Integer> averageList =

                new ArrayList<>(Arrays.asList(7, 99, -13, 4, -9, -7, 6, 1, 3, -4, 12, 5, -18, 99));

        //when

        ArrayList<Integer> result = exterm.exterminate(averageList);


        //then

        assertNotNull(result);

        ArrayList<Integer> expected =

                new ArrayList<>(Arrays.asList(99, 4, -4, 1, 4, -4, 99));

        assertEquals(expected, result);

    }


    @Test

    public void testOddNumbersExterminatorIllegalArgument() {

        //given

        OddNumbersExterminator exterm = new OddNumbersExterminator();

        ArrayList<Integer> invalidList = null;



        try {

            //when

            exterm.exterminate(invalidList);

            //then

            fail();

        } catch (IllegalArgumentException exc) {



        }

    }

}
