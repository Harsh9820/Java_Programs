public class List{
    private Node head;
    private Node tail;
    private int length;

    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }

    public List(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print("" + temp.val);
            temp = temp.next;
        }
    }

    public void getHead(){

    }

    public void getTail(){

    }

    public void getLength(){
        System.out.println(length);
    }

    public void append(int value){
        Node n = new Node(value);
        if(length == 0){
            head = n;
            tail = n;
        }
        else{
            tail.next = n;
            tail = n;
        }
        length++;
    }

    public static void main(String[] args) {
        List ll = new List(4);
        ll.append(6);
        ll.printList();
        ll.getLength();
    }
}
