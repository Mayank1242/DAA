package lab_practical_questions;
import java.util.*;
public class Q1_linear {

	public  static int linear_search(int arr[],int key) {
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]==key) {
				 return i;
			 }
			 
		 }
		 return -1;
	}
	 public static void main(String args[]) {
		 System.out.println("Enter the size of the array:");
		 Scanner sc=new Scanner(System.in);
		 int size = sc.nextInt();
		 int[] arr=new int[size];
		 
		 for(int i=0;i<size;i++) {
			 arr[i]=sc.nextInt();
		 }
		 
		 
		 for(int i=0;i<size;i++) {
			System.out.print(arr[i] + " ");
		 }
		 int key;
		 System.out.println("Enter the element name you want ot search:");
		 key=sc.nextInt();
		 System.out.print("\nelemetn is :" + key + "at" + (linear_search(arr,key)+1) + "index.");
		 
		 
	 }
}
