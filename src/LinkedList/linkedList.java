package LinkedList;

public class linkedList {
    /**
     * head is the only reference we have in a linkedList
     */
    private Node head;

    /**
     * Insert a new element to the head
     */
   public void insertAtHead(int data){
       Node newNode = new Node(data);
       newNode.setNextNode(this.head);
       this.head = newNode;
   }

   int getListLenght(){
       int listLength =0;
       Node current = this.head;

       while (current != null){
           listLength++;
           current = current.getNextNode();
       }
       return listLength;
   }

    @Override
    public String toString(){
       String result = "{";
       Node current = this.head;

       while (current != null){
           result += current.toString() ;
           current = current.getNextNode();
           if (current != null){
               result += ", ";
           }

       }
       result += "}";
        return result;
    }


}
