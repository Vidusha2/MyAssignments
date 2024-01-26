package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {
		
		/*- Declare an array {3, 2, 11, 4, 6, 7}.
		- Pick the 2nd element from the last and print it.*/
		
		/*- Arrange the collection in ascending order
		- Use the get method to print the second largest number*/
		
		int[] array = {3, 2, 11, 4, 6, 7};
		
		List<Integer> list = new ArrayList<Integer>();
		
		for (int eachvalue : array) {
			list.add(eachvalue);
		}
		
		Collections.sort(list);
		int size = list.size();
		System.out.println("The second largest number is: " +list.get(size-2));
	}

}
