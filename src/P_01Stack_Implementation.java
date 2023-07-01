
//by LinkedList
public class P_01Stack_Implementation {

	public static class Node{ //usefr defined data type
		int val;
		Node next;
		Node(int val){
			this.val=val;
		}
	}
	public static class LLStsck{  //user defined data structure
		Node head = null;
		int size = 0;
//#push		
		void push(int x) { 
			Node temp = new Node(x);
			temp.next = head;
			head = temp;
			size++;
		}
//#pop
		int pop() {
			if(head == null) {
				System.out.println("Stack is Empty !");
				return -1;
			}
			int x = head.val;
			head = head.next;
			return x;
		}
//#peek  
		int peek() {
			if(head == null) {
				System.out.println("Stack is Empty !");
				return -1;
			}
			return head.val;
		}
//#isEmpty
		boolean isEmpty() {
			if(size == 0) {
				return true;
			}
			return false;
		}
//#size
		int size() {
			return size;
		}
//#displayRec
		void displayRec(Node hd){
			if(hd == null)
				return;
			displayRec(hd.next);
			System.out.print(hd.val+" ");
		}
//#Display
		void display() {
			displayRec(head);
			System.out.println();
		}
//#reverseDisplay		
		void displayRev() {
			Node temp = head;
			while(temp!=null) {
				System.out.print(temp.val+" ");
				temp = temp.next;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		LLStsck st = new LLStsck();
		st.push(23);
		st.push(12);
		st.push(44);
		st.push(6);
		st.push(34);
		
		st.display();
		
		System.out.println("Size is "+st.size());
		
		st.push(89);
		st.display();
		System.out.println("Size is "+st.size());
		st.pop();
		st.display();
		
		System.out.println("Peek value is "+ st.peek());
		st.display();
		st.pop();
		System.out.println("Size is "+st.size());
	}
}
