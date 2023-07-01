
import java.util.*;
import java.util.Stack;
public class P_01_Stacks {
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
		System.out.println("Size is : "+st.size());
//#Reverse
		Stack<Integer> rev = new Stack<>();
		while(st.size()>0) {
			int x = st.peek();
			rev.push(x);  //rev.push(st.pop());
			st.pop();
		}
		System.out.println("Reverse stack is "+rev );
//#Copy
		Stack<Integer> copy = new Stack<>();
		while(rev.size()>0) {
			//int x = rev.peek();
			//copy.push(x); 
			//rev.pop();
			copy.push(rev.pop());
		}
		System.out.println("Copied stack is "+copy);
		System.out.println("Old stack is now empty"+ st);
//#Inrsetion
		st=copy;// we can also copy by this
		System.out.println("Enter the index number and inrsertion number");
		int indx = sc.nextInt();
		
		int x = sc.nextInt();
		Stack<Integer> temp = new Stack<>();
    	while(indx<st.size()) {
			temp.push(st.pop());
		}
    	st.push(x);
    	while(temp.size()>0) {
    		st.push(temp.pop());
    	}
    	System.out.println("The stack after inrstion is "+ st);
	}
}
