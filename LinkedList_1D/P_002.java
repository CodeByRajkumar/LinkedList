
public class P_002 {
	public static class basic1{
		int data;
		Node next;//Node type
	}
	public static void main(String[] args) {
		basic1 obj = new basic1();
		
		System.out.println(obj.data);//value of obj
		System.out.println(obj);//location of obj
		System.out.println(obj.next);//null by default
	}

}
/*OUTPUT:
0
P_002$basic1@372f7a8d
null

 
*/