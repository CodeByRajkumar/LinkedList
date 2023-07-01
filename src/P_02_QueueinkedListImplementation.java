import java.util.*;

public class P_02_QueueinkedListImplementation {

	public static class Node{
		int val;
		Node next;
	}
	public static Node Push(Node top) {
		Scanner sc = new Scanner(System.in);
		Node newNode = new Node();
		System.out.println("Enter the value:");
		newNode.val = sc.nextInt();
		newNode.next = top;
		return top;
	}
	public static Node Pop(Node top) {
		if(top==null){
			System.out.println("Stack Underflow");
		}
		System.out.println("Deteled item in :"+top.val);
		top = top.next;
		return top;
	}
	public static Node display(Node top) {
		if(top==null){
			System.out.println("No element in stack");
		}
		Node temp = top;
		while(temp!=null){
			System.out.print(temp.val+" ");
			temp = temp.next;
		}
		System.out.println();
		return temp;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Node top;
		top = null;
		while(true) {
			System.out.println("***MENU***\n0:Exit\n1:Push\n2:Pop\n3:display\nEnter your choice");
			int choice = sc.nextInt();
			switch(choice) {
			case 0:
				System.out.println("  EXIT");
				System.exit(0);
			case 1:
				top=Push(top);
				break;
			case 2:
				top=Pop(top);
				break;
			case 3:
				display(top);
				break;
			case 4:
				System.out.println("Invalalid Choice");
			}
			
		}
	}

}
