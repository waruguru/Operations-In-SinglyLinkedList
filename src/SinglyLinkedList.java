public class SinglyLinkedList {
    /***
     * This is singl directional
     */
    private Node first;
    private Node last;

    public SinglyLinkedList(){
        first = null;
        last = null;
    }
    /**
     * Node only  knows about he node
     * next to it not the one before it
     */

    public boolean isEmpty(){
        return (first==null);
    }

    /***
     * Insert at th begining of the link
     *
     */

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode;

    }

    /**
     * Insert last
     */
    public void insertLast(int date){
        Node current = first;
        while (current.next != null){
            //will loop untill current .next is null
            current = current.next;
        }
        Node newNode = new Node();
        current.data = date;
        current.next = newNode;

    }

    /**
     * return a node and delete from bgining from first
     */

    public Node deleteFirst(){
        Node temp = first;
        first = first.next;
        return temp;
    }

    /**
     *
     */

    public void displayList(){
        Node current = first;
        while(current != null){
            System.out.print(current.data + " ");
            current.displayNode();
            current =current.next;
        }
        System.out.println();
    }

}
