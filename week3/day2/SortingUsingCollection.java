package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		
		/*- Reverse the given collection of String elements
		- Declare a String array and add the values as {HCL, Wipro, Aspire Systems, CTS}
		- Add the collection to a list
		- Iterate the values in the list
		- Print the required output as Wipro, HCL, CTS, Aspire Systems
		- Arrange the collection in ascending order
		- Use reverse loop to iterate the collection*/
		
		String[] array = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		List<String> list = new ArrayList<String>(Arrays.asList(array));
		Collections.sort(list);
		
		for (int i = list.size()-1; i >= 0; i--) {
			System.out.print(list.get(i));
			if(i > 0) {
				System.out.print(", ");
			}
		}
		
		

	}

}
