package luki17;

public class Main {

    public static void main(String[] args) {
        BubbleSort bubble_sort = new BubbleSort();

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 4, 3, 2, 1};
        int[] array3 = fillAscendingArray();
        int[] array4 = fillDecendingArray();
        int[] array5 = {5, 2, 3, 1, 4};

        bubble_sort.run(array1);
        bubble_sort.run(array2);
        bubble_sort.run(array3);
        bubble_sort.run(array4);
        bubble_sort.run(array5);
    }

    private static int[] fillAscendingArray() {
        int[] array = new int[99];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    private static int[] fillDecendingArray() {
        int[] array = new int[99];
        int number = array.length;
        for (int i = 0; i < array.length; i++) {
            array[i] = number--;
        }
        return array;
    }
}
