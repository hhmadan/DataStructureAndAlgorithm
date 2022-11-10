package dsaprograms;
import java.util.Scanner;

public class BankingCashCounter {
    static class Queue {
        int queue[] = new int[1000];
        int size;
        int front;
        int rear;

        public void enqueue(int i){
            queue[rear] = i;
            rear += 1;
            size++;
        }

        public int deque(){
            front += 1;
            size--;
            return front;
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of persons");
        int person = sc.nextInt();

        int cash = 500000;

        for (int i = 0; i < person; i++) {
            queue.enqueue(i);
        }
        while (person != 0) {
            System.out.println("Cash available " + cash);
            int cnt = 0, ch;

            while (cnt == 0) {
                System.out.println("Enter\n1: Withdraw \n2: Deposit");
                ch = sc.nextInt();

                switch (ch) {
                    case 1:
                        System.out.println("Enter cash to withdraw");
                        int amount = sc.nextInt();
                        System.out.println("Cash withdrawn successfully");
                        queue.deque();
                        cash -= amount;
                        cnt += 1;
                        System.out.println("Remaining cash " + cash);
                        person--;
                        System.out.println("$$$$$$$$ THANK YOU $$$$$$$$$");
                        break;

                    case 2:
                        System.out.println("Enter the required amount to deposit");
                        int amount1 = sc.nextInt();
                        System.out.println("amount deposited successfully");
                        queue.deque();
                        cash = cash + amount1;
                        cnt += 1;
                        System.out.println("Remaining cash " + cash);
                        person--;
                        System.out.println("--------THANK YOU VISIT AGAIN-------");
                        break;

                    default:
                        System.out.println("Invalid input");
                }
            }
        }
    }

}
