package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElement {

	public static void main(String[] args) {

		/*- Declare an array {1, 2, 3, 4, 10, 6, 8}.
		- Do a comparison check if there is a gap in the sequence of numbers.
		- Print the numbers that are missing.*/
		
		/*- Arrange the collection in ascending order
		- Inside the loop, check the current element + 1 is not equal to the next element. This comparison checks if
		there is a gap in the sequence of numbers
		- Use the get() method to get an element from the list
		- Print the number if a gap is detected.*/
		
		int[] array = {1, 2, 3, 4, 10, 6, 8};
		
		List<Integer> list = new ArrayList<Integer>();
				
		for (int each : array) {
			list.add(each);
		
		}
		
		Collections.sort(list);
		
		for (int i = 0; i < list.size()-1; i++) {
			int currentEle = list.get(i);
			int nextEle = list.get(i+1);
			if(currentEle+1 != nextEle) {
				int missingEle = currentEle+1;
				System.out.println(missingEle);
			}
						
		}
	}

}
