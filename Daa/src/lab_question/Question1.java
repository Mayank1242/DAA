package lab_question;
import java.util.*;

public class Question1 {
	  public static void insertionsort(int arr[],int size){
	        for(int i=1;i<size;i++){
	            int current=arr[i];
	            int j=i-1;
	            while(j>=0 && current<arr[j]){
	                arr[j+1]=arr[j];
	                j--;
	            }
	            arr[j+1]=current;
	        }
	    }
		public static void main(String[] args) {
			
		    
			Scanner sc=new Scanner(System.in);
			System.out.println("\nenter the size of counter");
			int n=sc.nextInt();
		    int arr[]=new int[n];
		    
		    int i=0;
		    int age;
		    int size;
		    
		    while(n!=0){
		        		System.out.println("\nenter age");
		        		age=sc.nextInt();
		        		
		        		arr[i]=age;
		        		i++;
		        		
		        		insertionsort(arr,i);
		        		
		        		n--;

		        		for(int k=0;k<i;k++){
			        		System.out.print(arr[k]+" ");

			    }
		    }
		    
		    
		}
}
