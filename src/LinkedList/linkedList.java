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

    /**
     * Delete a head from head list
     * @return
     */
    public void  deleteAtHead(){
        this.head = head.getNextNode();
    }

    /**
     * Search for an item froma LinkedList
     * Timecomplexity s 0(n)
     */
    public Node searchItem(int data){
        Node current = this.head;
        while (current !=null){
            if (current.getData() == data){
                return current;
            }
            current = current.getNextNode();
        }
        return null;
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
