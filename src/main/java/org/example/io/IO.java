package org.example.io;

import java.io.*;
import java.util.Scanner;

public class IO implements ArrayReader {

    @Override
    public int[] readOneDimensionalArray(String fileName) {
        try (Scanner in = new Scanner(new File(fileName))) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
            return arr;
        } catch (IOException ex) {
            System.err.println("Error reading file");
            return null;
        }
    }


    @Override
    public int[][] readTwoDimensionalArray(String fileName) {
        try (BufferedReader in = new BufferedReader(new FileReader(fileName))) {
            int n = Integer.parseInt(in.readLine());
            int[][] array = new int[n][n];
            for (int i = 0; i < n; i++) {
                String[] line = in.readLine().trim().split("[ ]+");
                for (int j = 0; j < line.length; j++) {
                    array[i][j] = Integer.parseInt(line[j]);
                }
            }
            return array;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            return new int[0][0];
        } catch (IOException e) {
            return new int[0][0];
        }
    }
}




