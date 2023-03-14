package org.example.io;

import java.io.File;

public interface ArrayReader {
    int[] readOneDimensionalArray(String fileName);
    int[][] readTwoDimensionalArray(String fileName);
}