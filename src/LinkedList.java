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

    public boolean remove(int data) {
        if(head == null) {
            return false;
        }

        if(head.data == data) {
            head = head.next;
            return true;
        }

        Node temp = head;

        while(temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }
        
        if(temp.next == null) {
            return false;
        }
        temp.next = temp.next.next;
        return true;
    }

    public void print() {
        Node temp = head;

        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
