package org.example.io;

import java.io.File;

public interface ArrayReader {
//    int[] readOneDimensionalArray(File file);
//    int[][] readTwoDimensionalArray(File file);

    int[] readOneDimensionalArray(String fileName);
    int[][] readTwoDimensionalArray(String fileName);
}