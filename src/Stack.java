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
}
