package dsaprograms;

import java.util.Arrays;
public class PrimeAnagram<T> {
    static class Node<T>{
        T data;
        Node<T> next;

        public Node(T data){
            this.data = data;
            this.next = null;
        }
    }

    Node<T> head;
    public static void main(String[] args) {
            PrimeAnagram p = new PrimeAnagram();
            String[] primeNumbers = p.getPrime(1000);

            for (int i = 0; i < primeNumbers.length; i++) {
                for (int j = i + 1; j < primeNumbers.length; j++) {
                    if (p.anagram(primeNumbers[i], primeNumbers[j])) {
                        p.push(primeNumbers[i]);
                        p.push(primeNumbers[j]);
                    }
                }
            }

            String numbers = p.display();
            System.out.println("Anagrams in Reverse Order :");
            for(int i=numbers.length()-1;i>0;i--) {
                System.out.print(numbers.charAt(i)+"");
                //System.out.println();
            }
        }
        public  String[] getPrime(int num){
            String[]arr = new String[1000];
            int pos = 0;
            for(int i =2; i<= num; i++){
                boolean prime = true;
                for(int j=2; j<=i/2; j++){
                    if((i%j)==0){
                        prime = false;
                        break;
                    }
                }
                if(prime){
                    arr[pos] = String.valueOf(i);
                    pos++;
                }
            }
            String[]getArr = new String[pos];
            for(int i =0;i<pos;i++){
                getArr[i] = arr[i];
            }
            return getArr;
        }
        public boolean anagram(String string1, String string2) {
            if(string1.length() != string2.length()) {
                return false;
            }
            char[] array1 = string1.toCharArray();
            Arrays.sort(array1);
            char[] array2 = string2.toCharArray();
            Arrays.sort(array2);

            for(int i = 0; i < array1.length; i++) {
                if(array1[i] != array2[i]) {
                    return false;
                }
            }
            return true;
        }
    public void push(T data){
        int cnt =0;
        Node<T> node = new Node<T>(data);
            node.next = head;
            head = node;
            cnt++;
    }
    public String display() {
        Node<T> node = head;
        String temp = "";

        while (node.next != null) {
            temp += node.data + " ";
            node = node.next;
        }
        temp += node.data;
        return temp;
    }

}
