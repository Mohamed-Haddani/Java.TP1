package package1;

import java.util.Scanner;



public class Test1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		
		
		System.out.println("Type Your Name");
		String Name = scanner.nextLine();
		
		System.out.println("Type Your Age");
		int Age = scanner.nextInt();
		
		System.out.println("Are you a Student");
		boolean isStudent = scanner.nextBoolean();
		
		
		System.out.println("Hello " + Name);
		System.out.println("Your are: " + Age + "Year old");
		if (isStudent) {
			System.out.println("You are a Student");
		}
		else { System.out.println("You are not a Student");
		}
		scanner.close();
	}
	
}
