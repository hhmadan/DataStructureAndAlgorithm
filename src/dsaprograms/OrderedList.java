package dsaprograms;

public class OrderedList {
    static class Node{
        int data;
        Node next;

        public Node(int string){
            this.data = string;
            this.next = null;
        }
    }
    Node head = null;
    void add(int n){
        Node node = new Node(n);
        if(head == null){
            this.head = node;
        }else{
            Node tmp = head;
            while(tmp.next != null){
                tmp = tmp.next;
            }
            tmp.next = node;
        }
    }
    boolean findNode(int n){
        Node tmp = head;
        while(tmp != null){
            if(tmp.data == n){
                return true;
            }
            tmp = tmp.next;
        }
        return false;
    }
    public void sortNodes(){
        Node current = head, index;
        int temp;
        while (current != null)
        {
            index = current.next;
            while (index != null) {
                if (current.data > index.data)
                {
                    temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }
                index = index.next;
            }
            current = current.next;
        }
    }
    void getDisplay(){
        Node current = head;
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        while (current!= null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println("\b");
    }

    public static void main(String[] args) {
        OrderedList ol = new OrderedList();

        ol.add(10);
        ol.add(20);
        ol.getDisplay();


        System.out.println("Adding nodes...");
        int []array = {11, 22, 333, 44};
        for(int i =0; i< array.length;i++){
            if(ol.findNode(array[i])){
                continue;
            }
            else{
                ol.add(array[i]);
            }
            System.out.println("Updated Nodes are: ");
            ol.getDisplay();
            System.out.println("Ascending Ordered List: ");
            ol.sortNodes();
            ol.getDisplay();
        }
    }
}
