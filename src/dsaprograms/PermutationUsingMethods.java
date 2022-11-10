package dsaprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PermutationUsingMethods {
    public static void iterativeMethod(String str) {
            if (str == null || str.length() == 0) {
                return;
            }
            List<String> rem = new ArrayList<>();
            rem.add(String.valueOf(str.charAt(0)));

            for (int i = 1; i < str.length(); i++) {
                for (int j = rem.size() - 1; j >= 0 ; j--) {
                    String string = rem.remove(j);
                    for (int k = 0; k <= string.length(); k++) {
                        rem.add(string.substring(0, k) + str.charAt(i) + string.substring(k));
                    }
                }
            }
            System.out.println(rem);
    }
    private static void recursiveMethod(char[] word, int currentIndex) {
        if (currentIndex == word.length - 1) {
            System.out.println(String.valueOf(word));
        }

        for (int i = currentIndex; i < word.length; i++) {
            swap(word, currentIndex, i);
            recursiveMethod(word, currentIndex + 1);
            swap(word, currentIndex, i);
        }
    }
    private static void swap(char[] word, int i, int j) {
        char temp = word[i];
        word[i] = word[j];
        word[j] = temp;
    }
    public static void getPermutationOfString(String str) {

        if (str == null || str.length() == 0) {
            return;
        }
        recursiveMethod(str.toCharArray(), 0);
    }

//    public static void recursiveMethod(String word,int n1, int n2){
//        if (n1 == n2)
//        {
//            System.out.println(word);
//        }
//        else{
//            for (int i = 1; i <= n2; i++)
//            {
//                word = swap(word, n1, i);
//                recursiveMethod(word, n1+1, n2 );
//                word = swap(word, n1, i);
//            }
//        }
//    }
//    public static String swap(String a, int i, int j){
//        String string;
//        char temp;
//        char[] arr = a.toCharArray();
//        temp = arr[i];
//        arr[i]=arr[j];
//        arr[j]=temp;
//        string = new String(arr);
//        return string;
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;
        System.out.println("Enter The String: ");
        word = sc.next();
        System.out.println("All The Possible Strings Using Iterative Method Are: ");
        iterativeMethod(word);
        System.out.println("All The Possible Strings Using Recursive Method Are: ");
        getPermutationOfString(word);
    }
}

