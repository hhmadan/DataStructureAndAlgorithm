package dsaprograms;

import java.util.Scanner;

public class InsertionSort {
    public void insertionSort(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of Array: ");
        int size = sc.nextInt();
        String[] arr = new String[size];
        System.out.println("Enter String Elements Of The Array:");
        for (int i = 0; i < size; i++)
        {
            arr[i] = sc.next();
        }
        for (int i = 1; i < arr.length; i++)
        {
            String key = arr[i];
            int j = i - 1;
            while ((j >= 0) && (arr[j].compareTo(key) > 0))
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        for (String s : arr) {
            System.out.println(s + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("PERFORMING INSERTION SORT");
        InsertionSort is = new InsertionSort();
        is.insertionSort();
    }
}
