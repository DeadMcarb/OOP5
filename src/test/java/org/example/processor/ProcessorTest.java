package org.example.processor;

import org.assertj.core.api.Assert;
import org.example.Main;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


class ProcessorTest {

    Processor processor;

    @BeforeEach
    void setUp() {
        processor = new Processor();
    }

    @Test
    void testCalculate1() {
        //    Знайти суму елементів масиву між першим та останнім від’ємними
        int[] array = {1,2,3,4,-5, 6, 7, 8, 9, -10, 11, 12, 13, 14, 15};
        int expected = 30;
        assertEquals(expected, processor.calculate(array));
    }

    @Test
    void testCalculate2() {
        int[][] array1 = {{1,2,3,4,5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}};

        assertEquals(26, processor.calculate(array1));
    }

    @Test
    void testProcessArray() {
        int[][] array1 = {{1,2,3,4,5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}};

        ArrayList<Integer> expected1 = new ArrayList(Arrays.asList(1, 2, 3, 7, 8, 13, 18, 19, 23, 24, 25));

        assertEquals(expected1, processor.processArray(array1));

        int[][] array2 = {{1,2,3,4,5, 91},
                  {6, 7, 8, 9, 10, 92},
                {11, 12, 13, 14, 15, 93},
                {16, 17, 18, 19, 20, 94},
                {21, 22, 23, 24, 25, 95},
                {91, 92, 93, 94, 95, 96}};

        ArrayList<Integer> expected2 = new ArrayList(Arrays.asList(1, 2, 3, 7, 8, 13, 19, 24, 25, 94, 95, 96));

        assertEquals(expected2, processor.processArray(array2));
    }

}