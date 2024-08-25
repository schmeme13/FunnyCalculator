public class Main {
    public static void main(String args[]) {
        LinkedList list = new LinkedList();

        list.add(1);
        list.add(2);
        list.add(3);

        list.remove(2);
        list.add(3);

        list.print();

        System.out.println("Value count for no. 3: " + list.valueCount(3));
    }

}
