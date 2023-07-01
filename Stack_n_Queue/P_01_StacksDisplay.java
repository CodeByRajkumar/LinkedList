
import java.util.*;
public class P_01_StacksDisplay {
//#	
	public static void displayRevRec(Stack<Integer> st) {
		if(st.size()==0) {
			return;
		}
		int top = st.pop();
		System.out.print(top+" ");
		displayRevRec(st);
		st.push(top);
	}
//#	
	public static void displayRec(Stack<Integer> st) {
		if(st.size()==0) {
			return;
		}
		int top = st.pop();
		displayRec(st);
		System.out.print(top+" ");
		st.push(top);
	}
//#
	public static void pushAtBottom(Stack<Integer> st ,int x) {
		if(st.size()==0) {
			st.push(x);
			return;
		}
		int top = st.pop();
		pushAtBottom(st,x);
		st.push(top);
	}
	public static void reverseStack(Stack<Integer> st ) {
		if(st.size()==1)
			return;
		int top = st.pop();
		reverseStack(st);
		pushAtBottom(st,top);
	}
	public static void removeElement(int indx ,Stack<Integer> st) {
		Stack<Integer> rt = new Stack<>();
		while(st.size()>indx+1) {
			rt.push(st.pop());
		}
		st.pop();
		while(rt.size()>0) {
			st.push(rt.pop());
		}
		displayRec(st);
	}
	public static void main(String[] args) {

		Stack<Integer> st = new Stack<>();
		
		System.out.println("Enter the total no. of elements");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		System.out.println("Enter the elements");
		for(int i=0 ; i<n ; i++) {
			int x = sc.nextInt();
			st.push(x);
		}
		System.out.println(st);
		
		Stack<Integer> rt = new Stack<>();
		while(st.size()>0) {
			rt.push(st.pop());
		}
		while(rt.size()>0) {
			int x = rt.pop();
			System.out.print(x+" ");
			st.push(x);
		}
		System.out.println();
		System.out.println("Reverse of stack is ");
		displayRevRec(st);
		
		System.out.println();
		System.out.println("stack is ");
		displayRec(st);
		
		
		System.out.println();
		System.out.println("Enter the index you want to remove");
		int y = sc.nextInt();
		removeElement(y, st);
		System.out.println();
		System.out.println("After reverse the same stack");
		reverseStack(st);
		System.out.println(st);
	}

}
