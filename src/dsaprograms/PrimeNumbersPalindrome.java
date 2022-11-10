package dsaprograms;

public class PrimeNumbersPalindrome {
    public static void main(String args[]) {
        for (int n = 0; n <= 1000; n++) {
            int num, cnt = 0;
            for(num=n-1; num>=2; num--){
                if(n%num==0)
                    cnt = cnt+1;
            }
            if(cnt == 0){
                if(n>=2){
                    System.out.println(n + " is a prime number");
                    isPalindrome(String.valueOf(n));
                }
            }
        }
    }
    private static void isPalindrome(String string) {
         String revString = "";
         int length = string.length();
         for(int i = length-1; i>=0; i--){
             revString = revString +string.charAt(i);
         }
         if(string.equalsIgnoreCase(revString))
             System.out.println(string+" is Palindrome Prime Number");
    }

}
