package org.example.io;

import org.example.processor.Processor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class IOTest {
    IO reader;

    @BeforeEach
    void setUp() {
        reader = new IO();
    }

    @Test
    void testReadOneDimensionalArray() {
        int[] expected = {1,2,3,4,5};
//        assertEquals(expected, reader.readOneDimensionalArray("testTXT1.txt"));
        assertArrayEquals(expected, reader.readOneDimensionalArray("testTXT1.txt"));
    }

    // Почему всегда файл не найден????

    @Test
    void testReadTwoDimensionalArray() {
        int[][] expected = {{1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5}};

        assertTrue(Arrays.deepEquals(expected,reader.readTwoDimensionalArray("testTXT2.txt")));
    }

}