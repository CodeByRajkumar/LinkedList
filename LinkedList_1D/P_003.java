
public class P_003 {
	
	public static class Node{
		int data;//value
		Node next;//address of next node
		
		Node (int data){//constructor of node
			this.data = data;
		}
	}
	
	public static void display(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public static void displayRec(Node head) {
		Node temp = head;
		if(temp==null) {
			return;
		}else {
			System.out.print(temp.data+" ");
			displayRec(temp.next);
		}		
	}
	public static void displayRecRev(Node head) {
		if(head==null) return;
		
	    displayRecRev(head.next);
	    System.out.print(head.data+" ");
	    
	}
//Length
	public static int countLength(Node head) {
		int count = 0;
		Node temp = head;
		while(temp != null) {
			count++;
			temp=temp.next;
		}
		return count;
	}
	public static void main(String[] args) {
		
		Node a = new Node(5);
		Node b = new Node(3);
		Node c = new Node(9);
		Node d = new Node(8);
		Node e = new Node(16);
		System.out.println(a.next);//null
		a.next = b ;// 5->3  9  8  16 
		System.out.println(a);//P_003$Node@372f7a8d
		System.out.println(a.next);//P_003$Node@2f92e0f4
		System.out.println(b);//P_003$Node@2f92e0f4
		System.out.println(b.next);//null
		
		System.out.println(b.data);//3
		System.out.println(a.next.data);//3
		System.out.println();
		a.next = b ;// 5->3  9  8  16 
		b.next = c ;// 5->3->9  8  16 
		c.next = d ;// 5->3->9->8  16 
		d.next = e ;// 5->3->9->8->16 
		try {
			System.out.print(a.data+" ");
			System.out.print(a.next.data+" ");
			System.out.print(a.next.next.data+" ");
			System.out.print(a.next.next.next.data+" ");
			System.out.println(a.next.next.next.next.data+" ");
		} catch (Exception e2) {
			System.out.println(e);
		}
//#		
		Node temp = a;//we are not creating any object of Node type
		for (int i=1;i<=5;i++) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
//#		
		Node temp1 = a;
		while(temp1 != null) {
			System.out.print(temp1.data+" ");
			temp1 = temp1.next;
		}
		System.out.println();
//#
		display(a);
		
		System.out.println();
//#    
		displayRec(a);
		System.out.println();
//#	
		displayRecRev(a);
		System.out.println();
//#
		System.out.println("Length of the LinkedList is : "+countLength(a));
		try {
			System.out.println(a.next);
			System.out.println(a.next.next);
			System.out.println(a.next.next.next);
			System.out.println(a.next.next.next.next);
			System.out.println(a.next.next.next.next.next);
		} catch (Exception e1) {
			System.out.println(e);
		}
		
	}
}
/*OUTPUT:
null
P_003$Node@372f7a8d
P_003$Node@2f92e0f4
P_003$Node@2f92e0f4
null
3
3

5 3 9 8 16 
5 3 9 8 16 
5 3 9 8 16 
5 3 9 8 16 
5 3 9 8 16 
16 8 9 3 5 
Length of the LinkedList is : 5
P_003$Node@2f92e0f4
P_003$Node@28a418fc
P_003$Node@5305068a
P_003$Node@1f32e575
null
*/