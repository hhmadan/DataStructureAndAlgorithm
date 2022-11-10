package dsaprograms;

public class PrimeNosUsing2DArray {
    public static boolean checkPrime(int number) {
        boolean prime = true;
        for(int i = 2; i <= number/2; i++) {
            if(number % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
    public static void get2DArr(int[][] primeNumArr) {
        int i, j;
        int num =1;
        for(i = 0; i < 10; i++) {
            for(j = 0; j < 100; j++) {
                if(checkPrime(num)) {
                    primeNumArr[i][j] = num;
                }
                else {
                    primeNumArr[i][j] = -1;
                }
                num++;
            }
        }
    }
    public static void getPrimeArray(int[][] primeNumArr) {
        for(int[] a : primeNumArr) {
            for(int b : a) {
                if(b != -1 && b != 1) {
                    System.out.print(b + " ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        System.out.println("\n-----------PRIME NUMBERS USING 2D ARRAY-----------\n");

        int[][] primeNumArr = new int[10][100];
        get2DArr(primeNumArr);
        getPrimeArray(primeNumArr);

    }
}
