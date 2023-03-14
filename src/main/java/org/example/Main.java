package org.example;

import java.util.Scanner;

import org.example.io.ArrayReader;
import org.example.io.IO;
import org.example.processor.ProcessArray;
import org.example.processor.Processor;

public class Main {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
////////////////////////////////////////
        ArrayReader reader = new IO();
        ProcessArray processor = new Processor();

////////////////////////////////////////

        boolean status = true;

        while (status) {

            switch (printMenu()) {
                case 1 -> {
                    int[] array = reader.readOneDimensionalArray("f.txt");
                    int result = processor.calculate(array);
                    System.out.println("Сума елементів масиву між першим та останнім від’ємними = " + result);
                }
                case 2 -> {
                    int[][] array = reader.readTwoDimensionalArray("lab52.txt");
                    int result = processor.calculate(array);
                    System.out.println("Сума найбільшого та найменшого елементів у заштрихованій частині = " + result);
                }
                case 3 -> status = false;
            }
        }
    }


    private int printMenu() {
        System.out.println("Виберіть який пунк виконати 1 чи 2");
        System.out.print(">> ");
        int a = scanner.nextInt();
        scanner.nextLine();
        return a;
    }

}






