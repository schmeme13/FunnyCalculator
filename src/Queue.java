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

    public int dequeue() throws Exception {
        if(front == null) {
            throw new Exception("Queue is empty");
        }
        int value = front.data;
        front = front.next;
        if(front == null) {
            rear = null;
        }
        return value;
    }

    public int peek() throws Exception {
        if(front == null) {
            throw new Exception("Queue is empty");
        }
        return front.data;
    }

    public void print() {
        Node temp = front;

        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
