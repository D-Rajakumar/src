package coreJava;

public class stringFunctions {

	void performStringOperations() {

		String First_Name = "Rajakumar";
		String Last_Name = "Dharmalingam";
		String Blank = " ";

		String Full_Name = First_Name + Blank + Last_Name;

		System.out.println(Full_Name);
		System.out.println(Full_Name.length());

		System.out.println(First_Name.length());
		System.out.println(Last_Name.length());

		StringBuffer sb = new StringBuffer();
		
		sb.append(First_Name);
		sb.append(Blank);
		sb.append(Last_Name);
		
		System.out.println("Printing from String Buffer: "+ sb);
		
		sb.reverse();

		System.out.println("Printing from String Buffer reverse: "+sb);

	}
}
