package week1.day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {

		int[] elements = {1,4,3,2,8,6,7};
		int totalLen = elements.length;
		Arrays.sort(elements);
		
		for (int i = 0; i < totalLen; i++) { 
			
			if(i+1!=elements[i]) { 
				System.out.println("The missing element is " +(i+1));
				break;
			}
			
		}
		
	}

}
