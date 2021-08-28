// Java program to demonstrate
// asList() method for String value

import java.util.*;

public class example{
	public static void main(String[] argv) throws Exception
	{

		try {

			// creating Arrays of String type
			String a[]
				= new String[] { "A", "B", "C", "D" };

			// getting the list view of Array
			List<String> list = Arrays.asList(a);

			// printing the list
			System.out.println("The list is: " + list);
		}

		catch (NullPointerException e) {
			System.out.println("Exception thrown : " + e);
		}
	}
}
