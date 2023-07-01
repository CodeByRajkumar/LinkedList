
import java.util.*;
public class P_02_Queue {
	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		//rear--> 5 4 3 2 1 -->front
		//q.remove  or  q.poll -> remove one element from front side so the element 1 will remove from the q
		//q.size -> giving size of q
		System.out.println(q);
//#display		
		Queue<Integer> hlpr = new LinkedList<>();		
		while(q.size()>0) {//printing the q using another helper queue
			System.out.print(q.peek()+" ");
			int x = q.poll();//hlpr.add(q.poll())
			hlpr.add(x);
			
		}
		while(hlpr.size()>0) {//inserting all the elements from hlpr queue to q 
			q.add(hlpr.poll());
		}
		System.out.println();
	}

}
