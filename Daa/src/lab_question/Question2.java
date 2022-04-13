package lab_question;
import java.util.*;
public class Question2 {
 
	 public static void main(String[] args)
	    {
	        // storing input in variable
	        int n = 4;
	        
	        // create string array called names
	        String names[]
	            = { "Rahul", "Ajay", "Gourav", "Riya" };
	        String temp;
	        for (int i = 0; i < n; i++) {
	            for (int j = i + 1; j < n; j++) {
	                
	                // to compare one string with other strings
	                if (names[i].compareTo(names[j]) > 0) {
	                    // swapping
	                    temp = names[i];
	                    names[i] = names[j];
	                    names[j] = temp;
	                }
	            }
	        }
	        
	        // print output array
	        System.out.println(
	            "The names in alphabetical order are: ");
	        for (int i = 0; i < n; i++) {
	            System.out.println(names[i]);
	        }
	    }
}
