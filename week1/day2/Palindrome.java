package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		
	        int input = 121;
	        int temp = input;
	        int rev = 0;
	        
	        for (int i = input; i > 0; i/=10) {
	        	int rem = i%10;
	        	rev = (rev * 10) + rem;
	        	
	        } 
	        
	        if(temp==rev) {
	        	System.out.println("Reversed num: " +rev +" ,the given input is a palindrome");
	        } else {
	        	System.out.println("Reversed num: " +rev +" ,the given input is not a palindrome");
	        }
	        
	       
			}
	    }



