package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		
		/*- Declare an array for {3, 2, 11, 4, 6, 7}
		- Declare another array for {1, 2, 8, 4, 9, 7}
		- Compare both the arrays
		- Print the values if they are equal*/
		
		/*- Add array elements to a list
		- Iterate the values through the length of the list
		- Use an appropriate conditional statement to compare the values*/
		
		int[] array1 = {3, 2, 11, 4, 6, 7};
		int[] array2 = {1, 2, 8, 4, 9, 7};
		
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		for (int eachvalue : array1) {
			list1.add(eachvalue);
		}
		
		for (int eachvalue : array2) {
			list2.add(eachvalue);
		}
		
		for (int value : list1) {
			if(list2.contains(value)) {
				System.out.println(value);
			}
		}
		
	}

}
