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
//    Что делать, если надо затестировать 2 функ. с одинаковым названием??

    // Как сделать параметризованный тест на несколько массивов?


    @Test
    void testCalculate2() {
    }

    @Test
    void testProcessArray() {
//        int[][] array = {{1,2,3,4,5},
//                {6, 7, 8, 9, 10},
//                {11, 12, 13, 14, 15},
//                {16, 17, 18, 19, 20},
//                {21, 22, 23, 24, 25}};
//
//
////        int[] arr = {1, 2, 3, 7, 8, 13, 18, 19, 23, 24, 25};
//        ArrayList<Integer> expected = new ArrayList(Arrays.asList(1, 2, 3, 7, 8, 13, 18, 19, 23, 24, 25));
//
////НАВЕРНОЕ НАДО ПЕРЕДЕЛАТЬ ПОД ОБЫЧНЫЕ МАССИВЫ
//
//        assertArrayEquals(expected, processor.processArray(array), "Arrays are not equal");
    }
}