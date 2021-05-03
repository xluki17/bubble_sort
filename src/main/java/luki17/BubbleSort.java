package luki17;

public class BubbleSort {

    public void run(int[] array) {
        System.out.print("Tablica do sortowania:");
        showArray(array);
        System.out.println();
        sort(array);
        System.out.print("poortowana tablica: ");
        showArray(array);
        System.out.println();
        System.out.println();
    }

    public static void sort(int array[]) {
        if (array == null) {
            System.out.println("tablica nie może być pusta");
        } else {
            boolean hasChange;
            int numberComparison = 0;
            int numberElements = array.length;
            do {
                hasChange = false;
                for (int i = 0; i < numberElements - 1; i++) {
                    numberComparison++;
                    if (array[i] > array[i + 1]) {
                        int temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                        hasChange = true;
                    }
                }
                numberElements--;
            } while (numberElements > 1 && hasChange);
            System.out.println("Ilość porównań to: " + numberComparison);
        }
    }

    private void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}
