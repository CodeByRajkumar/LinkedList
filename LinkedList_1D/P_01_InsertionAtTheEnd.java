/* Linked list :
 #linear data structure
 #It is not storing data in a contigous memory location

 #Node:
 #it contain two things- Data,Pointer
 #pointer-address of the next node eg. head ,tail
 #Null-tail ie. last element
 #Head-to store the address of first node
 #Tail-store the address the last node
 */
class Node{
	int data;
    Node next;//Node type

    Node(int d){//constructor
    data = d;
    next = null;
    }     
}

class MyLinkedList1 {
    Node head;

    // insert the node at the very end in the linked list
    public void insertAtEnd(int newData){
        // intialize the newNode with the newData entered by the user
        Node newNode = new Node(newData);

        // LinkedList is empty
        if(head == null){
            head = new Node(newData);
            return;
        }
        else {
        // LinkedList is not empty
        newNode.next = null;
        // traversing the linkedlist at the end of the node
        Node temp = head;//creating temm object of node class
        while(temp.next != null){
            temp = temp.next;
           }
        temp.next = newNode;
        return;
        }
    }
        
    // display all the nodes after the insertion
    public void printNodes(){
        Node current = head;
        while(current!= null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }
}
public class P_01_InsertionAtTheEnd{ 
    public static void main(String[] args) {
        MyLinkedList1 llist = new MyLinkedList1();

        // function calling
        llist.insertAtEnd(2);
        llist.insertAtEnd(4);
        llist.insertAtEnd(8);
        llist.insertAtEnd(10);
        llist.insertAtEnd(15);

        System.out.println("Linked List after successful insertion of all the nodes:");
        llist.printNodes();

    }
}