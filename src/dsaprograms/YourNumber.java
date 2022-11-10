package dsaprograms;

import java.util.Scanner;

public class YourNumber {
    static Scanner sc = new Scanner(System.in);
    public static void number(int num1, int num2){

        int mid = num1 + (num2-num1) /2;

//        if((num1 == mid)){
//            System.out.println(mid+" ==> This is your secret Number");
//            System.exit(0);
//        }
        System.out.println("Number "+mid+" is Greater Than your Number ?" +
                "Enter Y or N...If this is Your Secret Number Enter C");
        char reply = sc.next().charAt(0);

        if(reply == 'C' || reply == 'c'){
            System.out.println(mid+" ==> This is Your Secret Number");
        }


        else if(reply == 'Y' || reply == 'y'){
            number(num1, mid-1);
        }
        else if(reply == 'N' || reply == 'n'){
            number(mid+1, num2);
        }
        else System.out.println("Invalid option..Please Type Y for YES And N for NO");
    }

    public static void main(String[] args) {
        System.out.println("Enter number limit to find your number: ");
        double num = sc.nextInt();
        double n= Math.pow(2,num);

        System.out.println("THINK OF A NUMBER BETWEEN 0 to "+(int)(n-1)+"....");
        number(0, (int) (n-1));

    }

}
