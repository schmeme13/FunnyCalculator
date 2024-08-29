public class Queue {
    Node front;
    Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int data) {
        Node node = new Node(data);

        if(rear != null) {
			rear.next = node;
		}
		rear = node;
		if(front == null) {
			front = node;
		}
    }

    public void print() {
        Node temp = front;

        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
