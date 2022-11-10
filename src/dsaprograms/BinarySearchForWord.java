package dsaprograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchForWord {
    public static int searchWord(String[] array, String searchingWord){
        int left = 0, right = array.length-1;
        while(left <= right){
            int mid = left + (right-left) /2;
            int res = searchingWord.compareTo(array[mid]);

            if(res == 0){
               return mid;
            }
            if(res > 0){
                left = mid +1;
            }else {
                right = mid -1;
            }
        }
        return -1;
    }

    public static void readWords() throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader words = new BufferedReader(new FileReader("ReadWords.csv"));

        String line;
        line = words.readLine();
        String[] values = line.split(",");
        for(String str:values){
            System.out.println(str+" ");
        }
        System.out.println("Performing sort...");
        Arrays.sort(values);
        for(int i =0;i<values.length;i++){
            System.out.println(i+"==> "+values[i]);
        }

        System.out.println("Enter word to Search: ");
        String sWord = sc.next();

        int answer = searchWord(values,sWord);

        if(answer == -1){
            System.out.println("Word is NOT present");
        }
        else {
            System.out.println(sWord+" is Present at "+answer+" position");
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println("BINARY SEARCH FOR WORD");
        readWords();
    }

}
