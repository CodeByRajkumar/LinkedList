
public class P_004 {
	public static class Node{
		int data;//value
		Node next;//address of next node
		
		Node (int data){//constructor of node
			this.data = data;
		}
	}
	public static class Linkedlist{
		Node head = null;//initialization
		Node tail = null;
		
		void insertAtEnd(int val) {
			Node temp = new Node(val);
			
			if(head==null && tail==null){
				head=tail=temp;
			}else {
				tail.next = temp;
				tail = temp;
			}
		}
		void display() {
			Node temp = head;
			while(temp != null) {
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		}
		int countLength() {
			int count = 0;
			Node temp = head;
			while(temp != null) {
				count++;
				temp=temp.next;
			}
			return count;
		}
		void insertAtBegin(int val) {
			
			Node temp = new Node(val);
			if(head==null && tail==null){
			//	head=tail=temp;
				insertAtEnd(val);
			}else {
				temp.next = head;
				head = temp;
			}
		}
		void insertAt(int indx,int val) {
			Node t = new Node(val);//for new
			Node temp = head;//initialise the variable as head
			if(indx == countLength()) {
				insertAtEnd(val);
				return;
			}else if(indx == 0) {
				insertAtBegin(val);
				return;
			}else if(indx<0 || indx>countLength()) {
				System.out.println("your input index is out of Linked List");
			}
			for(int i=1; i<=indx-1; i++) {
				temp = temp.next;
			}
			t.next = temp.next;
			temp.next = t;
		}
		int getAt(int indx) {
			if(indx<0 || indx>countLength()) {
				System.out.print("your input index is out of Linked List");
				return -1;
			}
			Node temp = head;
			for(int i=1;i<=indx;i++) {
				temp = temp.next;
			}
			return temp.data;
		}
	}
	public static void main(String[] args) {
		
		Linkedlist ll = new Linkedlist();
		ll.insertAtEnd(12);
		ll.display();
		ll.insertAtEnd(15);
		ll.display();
		ll.insertAtEnd(99);
		ll.display();
		System.out.println(ll.countLength());
		
		ll.insertAtBegin(17);
		ll.display();
		ll.insertAt(4, 10);
		ll.display();
		System.out.println(ll.getAt(45));
		
	}

}
/*OUTPUT:
12 
12 15 
12 15 99 
3
17 12 15 99 
17 12 15 99 10 
your input index is out of Linked List-1
*/