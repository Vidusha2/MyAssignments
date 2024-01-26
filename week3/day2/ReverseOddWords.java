package week3.day2;

public class ReverseOddWords {

	public static void main(String[] args) {
		
		/*- Reverse the odd position words from a String with the input:
		- String test = "I am a software tester";
		- Expected output: “I ma a erawtfos tester”*/
		
		/*- Split the words and have it in an array
		- Traverse through each word using loop
		- Find the odd index within the loop
		- Convert the String array into a character array
		- Print the even position words using another loop*/
		
		/*- Print the even position words in reverse order using nested loop
		- Convert words to character array if the position is odd else print the word as it is (concatenate space at the
		end).*/
		
		String test = "I am a software tester";
		String[] words = test.split(" ");
		
		for (int i = 0; i < words.length; i++) {
			if(i%2 == 1) {
				char[] charArray = words[i].toCharArray();
				for (int j = charArray.length-1; j >= 0; j--) {
					System.out.print(charArray[j]);
				}
				System.out.print(" ");
			} else {
				System.out.print(words[i] + " ");
			}
		}

			

	}

}
