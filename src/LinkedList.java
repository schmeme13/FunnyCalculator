public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }
    
    public void add(int data) {
        Node node = new Node(data);
        
        if(head == null) {
            head = node;
        } else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }

        
    }

    public void print() {
        Node temp = head;

        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
