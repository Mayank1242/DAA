package lab_question;
import java.util.*;
public class Question3 {
	 public static int getmax(int arr[],int n){
	        int max=arr[0];
	        for(int i=0;i<n;i++){
	            if(arr[i]>max){
	                max=arr[i];
	            }
	        }
	        return max;
	    }
	    public static void countsort(int arr[],int size){
	       int max=getmax(arr,size);
	       int newarr[]=new int[max+1];
	       
	       for(int i=0;i<max+1;i++){
	           newarr[i]=0;
	           
	       }
	       for(int i=0;i<size;i++){
	           newarr[arr[i]]++;
	       }
	       
	       int i=0;
	       int j=0;
	       while(i<=max){
	           if(newarr[i]>0){
	               arr[j]=i;
	               newarr[i]--;
	               j++;
	           }else{
	               i++;
	           }
	       }
	    }
		public static void main(String[] args) {
			
		    
			Scanner sc=new Scanner(System.in);
			System.out.println("\nenter the size of array to store marks");
			int n=sc.nextInt();
		    int arr[]=new int[n];
		    
		    System.out.println("enter the marks");
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		    
		    countsort(arr,n);
		   // for(int i=0;i<n;i++){
		   //     System.out.print(arr[i] + " ");
		   // }
		    System.out.println("Higest students no are "+ arr[n-1] + " " +arr[n-2] + " " +arr[n-3] + " \nlowest students no are "+ arr[0] + " "+ arr[1] + " "+ arr[2]);
		   
		}
}
