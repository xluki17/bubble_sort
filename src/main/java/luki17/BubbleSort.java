package luki17;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class BubbleSort {

    public void run() {
        int numbersArray = enterNumber("Podaj ilość liczb w tablicy");
        int[] array = drawNumbers(numbersArray);
        showArray(array);
        System.out.println();
        sort(array);
        showArray(array);
    }

    public static void sort(int array[]) {
        int numberComparison = 0;
        boolean hasChange;
        do {
            hasChange = false;
            for (int i = 0; i <= array.length - 2; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    hasChange = true;
                    numberComparison++;
                }
            }
        } while (hasChange);
        System.out.println(numberComparison);
        //showArray(array);
    }

    private void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    private int[] drawNumbers(int nmberArray) {
        Random random = new Random();
        int[] array = new int[nmberArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    private int enterNumber(String text) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean isNumber = false;
        while (!isNumber) {
            try {
                System.out.println(text);
                number = scanner.nextInt();
                isNumber = true;
            } catch (InputMismatchException e) {
                System.out.println("błędne dane! ");
                scanner.nextLine();
            }
        }
        return number;
    }
}
