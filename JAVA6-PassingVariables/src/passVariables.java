
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
