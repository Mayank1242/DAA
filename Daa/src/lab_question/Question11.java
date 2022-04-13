package lab_question;
import java.util.*;
public class Question11 {
  public static void main(String args[]) {
	  Scanner sc=new Scanner(System.in);
	  
	  System.out.println("Enter the name");
	  String[] name=new String[10];
	  
	  for(int i=0;i<10;i++) {
		  name[i]=sc.nextLine();
	  }
	  
	  for(int i=0;i<10;i++) {
	  for(int j=i+1;j<10;j++) {
	    if(name[i].compareTo(name[j])>0) {
	    	String temp=name[i];
	    	name[i]=name[j];
	    	name[j]=temp;
	    }
	  }
	  
	  
	  }
	  for(int i=0;i<10;i++) {
		  System.out.print( name[i] +" ");
	  }
  }
}
