package dsaprograms;

public class BalancedParentheses {
    static class Node {
        int data;
        Node next;
        public Node(int x) {
            this.data = x;
            this.next = null;
        }
    }
    Node top = null;
    public void push(int x){
        Node node = new Node(x);

        node.next = top;
        top = node;
    }
    public int pop(){
        if (top == null)
            System.out.println("Stack is Empty");
        else{
            return top.data;
        }
        return 0;
    }

    public static void main(String[] args) {
        BalancedParentheses balance = new BalancedParentheses();
        char[] expression = {'(', '5','+','6',')','∗','(','7','+','8',')','/','(','4','+','3',')','(','5','+','6',')','∗','(','7','+','8',')','/','(','4','+','3',')'};
        for (int i=0; i<expression.length; i++){
            char c = expression[i];
            if (c == '('){
                balance.push(i);
            }
            else if (c == ')'){
                try {
                    int p = balance.pop()+1;
                    System.out.println("TRUE: Matched Parentheses");
                    break;
                } catch (Exception e) {
                    System.out.println("FALSE: Unmatched Parentheses");
                    break;
                }
            }
        }
    }
}
