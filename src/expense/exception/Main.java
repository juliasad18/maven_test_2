package expense.exception;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hi, dear! Welcome to your budget planner!");
		System.out.println("Enter your expenses using following template: amount:name:CATEGORY");
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			String s = scan.next();
			try {
				if (s.equals("quite")) {
					System.out.println("Ok. Have a nice day! And think about your expenses ;)");
					break;
//				System.out.println("Are you sure you want to quite?");
//				String r = scan.next();
//				if (r.equals("yes")) {
//					System.out.println("Ok. Have a nice day! And think about your expenses ;)");
//					break;
//				} else if (r.equals("no")) {
//					System.out.println("Enter your expenses using following template: amount:name:CATEGORY");
//				} 
				
			}
				CreateExpense ce = new CreateExpense();
				ce.createExpense(s);
			} catch (Exception ex) {
				System.out.println("Ups! Something went wrong. Be patient and try again ;)");
			}		

		}


	}	
	
}
