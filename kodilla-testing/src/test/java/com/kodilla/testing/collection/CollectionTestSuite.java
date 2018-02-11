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
        //Given
        OddNumbersExterminator exterm = new OddNumbersExterminator();
        ArrayList<Integer> emptyList = new ArrayList<>();

        //When
        ArrayList<Integer> result = exterm.exterminate(emptyList);

        //Then
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {

        //Given
        OddNumbersExterminator exterm = new OddNumbersExterminator();
        ArrayList<Integer> averageList =
                new ArrayList<>(Arrays.asList(-1, 100, 3, 2, -5, -2, 7, 0, -9, 4, 11, -4, -13, 100));

        //When
        ArrayList<Integer> result = exterm.exterminate(averageList);

        //Then
        assertNotNull(result);
        ArrayList<Integer> expected =
                new ArrayList<>(Arrays.asList(100, 2, -2, 0, 4, -4, 100));
        assertEquals(expected, result);
    }

    @Test
    public void testOddNumbersExterminatorIllegalArgument() {

        //Given
        OddNumbersExterminator exterm = new OddNumbersExterminator();
        ArrayList<Integer> invalidList = null;
        try {

            //When
            exterm.exterminate(invalidList);

            //Then
            fail();
        } catch (IllegalArgumentException exc) {
        }
    }
}