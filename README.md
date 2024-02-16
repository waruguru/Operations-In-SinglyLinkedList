# Operations-In-SinglyLinkedList
Linked List - collection of data elements called Nodes,
List contacins any datatype
First element of the list is the head
head reference points to the first element
the last element points to null
Tail - last element of the list and next pointer points to null
next - knows memory location for next Node(reference)

Node has:
value stored in the node and a reference to the next node
The last node has no successor(next node)

Singly linked list can be: root node, intermediate node or last node

Advantages of Linked Lists:
easy to append an element to a list
easy to insert an element to a list
easy to delete an element from the list
node count for the list is not needed in advance

Disadvantages for Linked Lists:
More difficult(time-consuming) to search for an element
large amount of memory is needed

Operations supported: insert, delete, update, traverse nodes, search or lookup.
Time Complsity of searching for an element in un-sorted list is O of n
Adding a Node to the end of the list:
O(N) becuse of traversing through out the Nodes.

Adding a Node to the head of a lists has time complexity is 0(1).
Finding an element in a linked List has a time complexity of o(N)- because of looping through worst case the element is not there
Delteing a Node from head has o(1)
Delting a Node elsewhere othr than from head has a time complexity of o(N)

Why study LinkedList:
Foundation for other datastructures like stack and queue


