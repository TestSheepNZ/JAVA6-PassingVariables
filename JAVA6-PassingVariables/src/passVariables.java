/*
 * This program is part of my learning Java series
 * This one looks at passing variables to a method
 * 
 * Find the blog here,
 * http://testsheepnz.blogspot.co.nz/2016/08/java-6-avoiding-tangled-code-with.html
 * 
 * For more information - please reread.
 * 
 * Mike Talks, Aug 2016
 */

public class passVariables {

	private static void printMe(int num, String str)
	{
		System.out.println(num);
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		// Declare a string and a number
		int printNum = 1;
		String printStr = "Hello, World";
		
		printMe(printNum, printStr);

	}

}
