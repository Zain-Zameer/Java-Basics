package first;

// Main Class
public class first {
	// main Function
	public static void main(String[] args) {

//		DATA TYPES IN JAVA  ------------------------------------------------------------
		
//		int numInt = 4;
//		float numFloat = 7.28f;
//		char Letter = 'D';
//		String myText = "LOG KIA KAHEIN GEIN";
//		boolean myBool = true;
//	    System.out.println("This is int Data Type: "+numInt);
//	    System.out.println("This is float Data Type: "+numFloat);
//	    System.out.println("This is char Data Type: "+Letter);
//	    System.out.println("This is String Data Type: "+myText);
//	    System.out.println("This is boolean Data Type: "+myBool);
//	    
		
		
//		// TypeCasting In Java ---------------------------------------------------------
//		
//		// Narrowing TypeCasting
//		float a = 2.82f;
//		int b = (int)a;
//		
//		System.out.println(a);
//		System.out.println(b);
//	    
//		
//		// Widening TypeCasting
//		int c = 2;
//		float d = a;
//				
//		System.out.println(c);
//		System.out.println(d);

		
		// STRINGS IN JAVA ------------------------------------------------------------
		
		// Length Function in Java
//		String text = "ZAIN IS A GOOD BOY";
//		System.out.println(text.length());
	  
		// STRINGS UPPERCASE AND LOWERCASE CONVERSION
		
//		String address = "Gulshan e Jamal, Al Haider";
//		System.out.println(address.toLowerCase()); // LowerCase Conversion Function
//		System.out.println(address.toUpperCase()); // UpperCase Conversion Function

		// Find character By index method in String
		
//		String text = "This is something crazy about Linda and Alizeh. They like to drink alot";
//		System.out.println(text.indexOf("Alizeh"));
//		System.out.println(text.indexOf("drink"));
		
	
//		Concatenation In Java 
		
		// Method 01 By Manually
//		String firstName = "Muhammad";
//		String lastName = "Zain";
//		System.out.println(firstName+" "+lastName);
		
		// Method 02 By using built-in Function
//		String firstName = "Muhammad ";
//		String lastName = "Zain";
//		System.out.println(firstName.concat(lastName));
		
		
		// MATH IN JAVA -----------------------------------------------------------------
	
		// max Function
//		System.out.println(Math.max(2,10));
		
		// min Function
//		System.out.println(Math.min(2,10));
		
		// sqrt Function to find square root of value
//		System.out.println(Math.sqrt(4));
		
		// abs Function
//		System.out.println(Math.abs(-98.6));  returns positive value
		
//		Random Function

//		int a = (int)(Math.random()*101);
//		double b = Math.random()*99;
//		System.out.println(a);
//		System.out.println((int)b);
	
		// Booleans in Java -------------------------------------------------------------
		
//		int a = 8;
//		int b = 5;
//		System.out.println(a>b); // returns true
//		System.out.println(a<b); // returns false
		
		//IF ELSE IN JAVA----------------------------------------------------------------
		
//		int a = 2;
//		int b = 2;
//		
//		if(a==2 && b==2) {
//			System.out.println("A and B are 2");
//		}
//		if(a>b) {
//			System.out.println("A is greater than B");
//		}
//		else if (a<b) {
//			System.out.println("A is less than B");
//		}
//		else {
//			System.out.println("Both Are Equal");
//		}
		
		// SWITCH CASE IN JAVA ---------------------------------------------------------
		
//		int a = 55;
//		
//		switch(a) {
//		case 1:
//			System.out.println("Value is 1");
//			break;
//		case 2:
//			System.out.println("Value is 2");
//			break;
//		case 3:
//			System.out.println("Value is 3");
//			break;
//		default:
//			System.out.println("Value not 1,2 or 3");
//		}
		
		
		// Loops in Java ----------------------------------------------------------------
		
		// For loop in Java (1)
		
//		for(int i = 0;i<10;i++) {
//			System.out.println(i);
//		}
		

//		For Each Loop in java (2) 

//		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//		for (String i : cars) {
//		  System.out.println(i);
//		}
	
		
//		While Loop In Java (3)
		
//		int i = 0;
//		while(i<10) {
//			System.out.println(i);
//			i++;
//		}
		
//		Do-While Loop In Java (4)
		
//		int i = 0;
//		do {
//			System.out.println(i);
//			i++;
//		}while(i<10);
		
		
	// ARRAYS IN JAVA----------------------------------------------------------------	
		
		// One dimensional array

//		int[] nums = {1,2,3,4,5};
//		System.out.println(nums[2]);
	
		
		// Two dimensional array
//		int[][] nums= {
//				{1,2,3},
//				{4,5,6}
//		};
//		System.out.println(nums[1][2]);
	
		
		
		// Three Dimensional array
//		int[][][] nums = {
//				{	{2,3,4}, // First Channel First Row Three columns
//					{5,6,7}}, // First Channel second Row Three columns
//				
//				{	{7,8,9}, // Second Channel First Row Three columns
//					{10,11,12}} // Second Channel second Row Three columns
//				
//		};
//		
//		for(int i =0;i<2;i++) { // access channel
//			for(int j = 0;j<2;j++) { // access rows
//				for(int k = 0;k<3;k++) {  // access columns
//					System.out.println(nums[i][j][k]+" ");
//				}
//				System.out.println("\n");
//			}
//			System.out.println("\n\n");
//		}
		
		
		//NOTE::   WE CAN CREATE AN ARRAY IN ANY DATA TYPE IN JAVA
	}
}