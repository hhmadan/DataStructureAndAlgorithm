package dsaprograms;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection {
    public void detectAnagram(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Word");
        String firstString = sc.next();
        System.out.println("Enter Second Word");
        String secondString = sc.next();

        firstString = firstString.toLowerCase();
        secondString = secondString.toLowerCase();
        char[] arr1 = firstString.toCharArray();
        char[] arr2 = secondString.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String str1 = new String(arr1);
        String str2 = new String(arr2);
//        System.out.println(str1);
//        System.out.println(str2);
        int compare = str1.compareTo(str2);
        if(compare == 0)
            System.out.println("Both Words are Anagrams");
        else
            System.out.println("Both Words are NOT Anagrams");
    }

    public static void main(String[] args) {
        AnagramDetection ad = new AnagramDetection();
        System.out.println("-------CHECK ANAGRAMS--------");
        ad.detectAnagram();
    }
}
