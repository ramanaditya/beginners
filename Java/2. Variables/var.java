import java.lang.*;

class Var {
	public static void main(String args[])
	{
		int rollno = 18;
		String name = "Aswin Gopinathan";
		float percentage = 90.4F;
		// F is written after 90.4 because by default JVM converts a decimal number to double. So we are type casting it to float type.
		
		System.out.println("Details are:");
		System.out.println("Name:"+name);
		System.out.println("Roll no:"+rollno);
		System.out.println("Percentage:"+percentage);
	}
	
}

/*The difference between System.out.print() and System.out.println() is that the former puts the cursor at the same line 
whereas the latter puts the cursor in the next line after the function is executed. */

/*There are different types of datatypes in Java:
* byte
* short
* int
* float
* double
* String
* char
* boolean */

