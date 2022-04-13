package revise;

import java.util.Scanner;

public class Linear_Search {
	public static int linearsearch(int arr[],int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		
		
		return -1;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		System.out.println("ENter element in the array:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.print("\nEnter the element you want to search:");
		int key =sc.nextInt();
		int result=linearsearch(arr,key);
		
		if(result==-1) {
			System.out.println("Cant find the element");
		}else {
			System.out.println("your elemnt is found at "+ (linearsearch(arr, key)+1)+ " location");
		}
	}
}
