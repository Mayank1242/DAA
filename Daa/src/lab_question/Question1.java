package lab_question;
import java.util.*;

public class Question1 {
	
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("l");
		int n=sc.nextInt();
	   
		while(n!=0){
			 int count=0;
		    int x=sc.nextInt();   //total point on chess
		    int y=sc.nextInt();    //total points she want get
		    int k;
		    
		    if(x==y){
		    	count++;
		        System.out.println(count);
		        
		    }else  if(x<y) {	
		    	k=x+8;
		        if(k>y){
		        	count++;
		            System.out.println(count);
		        }
		        
		    }else {
		    
		    k=x+18;
		    do {
				count++;
			}  while(k<y); {
		    	k=k+18;
		    	count++;
		    }
			System.out.println(count);
		    }
		    
		    
		   
		    n--;
		}
		    
		    
		    
		    
		}
	}

