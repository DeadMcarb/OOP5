package org.example.processor;


import java.util.ArrayList;
import java.util.Iterator;

public class Processor implements ProcessArray {

    //    Знайти суму елементів масиву між першим та останнім від’ємними
    @Override
    public int calculate(int[] array) {
        int sumBetweenNegativeNumbers = 0;
        int NegativeNumberCount = 0;

        for (int i = 1; i < array.length; i++) {

            if (array[i] < 0) {
                NegativeNumberCount++;
            } else {
                switch (NegativeNumberCount) {
                    case 1 -> sumBetweenNegativeNumbers += array[i];
                    case 2 -> {return sumBetweenNegativeNumbers;}
                }
            }

        } return sumBetweenNegativeNumbers;
    }


    //    Знайти суму найбільшого та найменшого елементів у заштрихованій частині
    @Override
    public int calculate ( int[][] array){
        ArrayList<Integer> newArray = processArray (array);
        int sum = 0;
        int min = newArray.get(0);
        int max = newArray.get(0);

        for (Iterator<Integer> iterator = newArray.iterator(); iterator.hasNext(); ) {
            Integer next =  iterator.next();
            if (next > max) {
                max = next;
            }
            if (next < min) {
                min = next;
            }

        }
        return min+max;
    }


    // будет создавать новый массив
    @Override
    public ArrayList<Integer> processArray (int[][] array){

        ArrayList<Integer> newArray = new ArrayList<Integer>();

        return newArray;
    }


//    @Override
//    public int[] processArray(int[][] array) {
//        int n = array.length;
//
//        int[] newArray = new int[11];
//        int index = 0;
//
////        System.out.print(array.length);
//
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if ((i < (n + 1) / 2) && (i <= j) && (j < (n + 1) / 2)) {
//                    newArray[index] = array[i][j];
//                    index++;
//
//                    System.out.print(" " + array[i][j]);
//                } else {
//                    System.out.print("  ");
//                }
//
//                if ((i >= (n + 1) / 2) && (i >= j) && (j >= n / 2)) {
//                    newArray[index] = array[i][j];
//                    index++;
//
//                    System.out.print(" " + array[i][j]);
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//    }
}
