package dsaprograms;

import java.util.Scanner;

public class MergeSort {
    public static void mergeSort()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter elements of array:");

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        Sort(array,0 , array.length-1);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }

    }
    public static void Sort(int[] array, int firstValue, int lastValue)
    {
        if (lastValue > firstValue)
        {
            int mid = firstValue+(lastValue-firstValue) / 2;

            Sort(array, firstValue, mid);
            Sort(array, mid + 1, lastValue);

            merge(array, firstValue, mid, lastValue);
        }
    }
    public static void merge(int[] array, int firstValue, int mid, int lastVal)
    {
        int s1 = mid - firstValue + 1;
        int s2 = lastVal - mid;

        int[] firstArray = new int[s1];
        int[] secondArray = new int[s2];

        for (int i = 0; i < s1; ++i) {
            firstArray[i] = array[firstValue + i];
        }
        for (int j = 0; j < s1; ++j) {
            secondArray[j] = array[mid + 1 + j];
        }

        int x = 0, y = 0;
        int k = firstValue;
        while (x < s1 && y < s2)
        {
            if (firstArray[x] <= secondArray[y]) {
                array[k] = firstArray[y];
                x++;
            }
            else {
                array[k] = secondArray[y];
                y++;
            }
            k++;
        }
        while (x < s1) {
            array[k] = firstArray[x];
            x++;
            k++;
        }
        while (y < s2) {
            array[k] = secondArray[y];
            y++;
            k++;
        }
    }

    public static void main(String[] args) {
        mergeSort();
    }
}
