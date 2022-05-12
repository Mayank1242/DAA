package linkedlist;
import java.util.*;
public class linkedlist_method {
public static void main(String args[]) {
//	LinkedList<String> l1=new LinkedList<>();
//	l1.add("Mayank");
//	l1.add("Ashu");
//	l1.addFirst("Rajat");
//	l1.addLast("Mishra");
//	for(int i=0;i<l1.size();i++) {
//		System.out.println(l1.get(i));
//	}
	
	 LinkedList<Integer> arr=new LinkedList<>();
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the elment");
	for(int i=0;i<5;i++) {
		int a=sc.nextInt();
		arr.add(a);
	}
	for(int i=0;i<5;i++) {
		
		System.out.println(arr.get(i));
	}
	
}
}
