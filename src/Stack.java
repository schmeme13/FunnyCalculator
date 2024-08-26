public class Stack {
    Node top;

    public Stack() {
        this.top = null;
    }

    public void push(int data) {
        Node node = new Node(data);
        node.next = top;
        top = node;
    }

    public int pop() {
        Node node = top;
        top = top.next;
        return node.data;
    }

    public void print() {
        Node temp = top;

        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
