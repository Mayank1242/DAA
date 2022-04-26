
//design a recursive program to sort a array by repetedle finding the smallest and largest element in array and
//replacing with the first and last element of the subarray thererby sortingpackage lab_question;
package lab_question;
import java.util.*;
public class Question2_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String name[]=new String[n];
		
		int i=0;
		String nam;
		
		while(n!=0){
		    System.out.println("\nenter the name:");
		    nam=sc.next();
		    name[i]=nam;
		    i++;
		    
		    
		    for(int k=0;k<i;k++){
		        for(int j=k+1;j<i;j++){
		        if(name[k].compareTo(name[j])>0){
		            String temp=name[k];
	    	        name[k]=name[j];
	            	name[j]=temp;
		        }
		       }
		    }
		    n--;
		    
		    for(int j=0;j<i;j++){
		        System.out.print(name[j] + " ");
		    }
		}
	}
}
