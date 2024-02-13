public class Main {
    public static void main(String[] args) {
        SinglyLinkedList myList = new SinglyLinkedList();
        myList.insertFirst(100);
        myList.insertFirst(200);
        myList.insertFirst(67);
        myList.insertFirst(90);
        myList.insertFirst(12);
        myList.insertLast(999999);

        myList.displayList();


    }
}