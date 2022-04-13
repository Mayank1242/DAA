package revise;
import java.util.*;
public class Linear_search_Recursive {
  
	public static int linearsearch(int arr[],int low,int high,int key) {
		if(high<low) {
			return -1;
		}
		if(arr[low]==key) {
			return low;
		}
		return linearsearch(arr,low+1,high,key);
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
		int result=(linearsearch(arr,0,n-1, key));
		
		if(result !=-1) {
			System.out.println("your elemnt is found at "+ (result+1)+ " location");
			
		}else {
			System.out.println("Cant find the element");
		}
	}
}
