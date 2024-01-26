package week3.day2;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		/*- Convert the given String to a character array.
		- Implement a loop to iterate through each character of the String (from end to start).
		- Find the odd index within the loop
		- Inside the loop, change the character to uppercase only if the index is odd
		- Print the characters with the expected output: cHaNgEmE*/

		/*- Use appropriate method to convert the String into a character array.
		- Use the appropriate operator to get the odd index
		- Use toUpperCase() method from the Character class to convert the odd index values to uppercase*/
		
		String text = "changeme";
		
		char[] charArray = text.toCharArray();
		
		for (int i = charArray.length-1; i >= 0; i--) {
			if(i%2 != 0) {
				charArray[i] = Character.toUpperCase(charArray[i]);
			}
			
		}
		
		System.out.println(charArray);

	}

}
