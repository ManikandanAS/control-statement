package org.control;

public class ControlStatement {

	public static void main(String[]args) {
		
		String name = "SathyaSelvam";
		
		if (name == "Sathya") {
			System.out.println("His name is correct");
			
		}
		else if (name == "Manoranjan") {
			System.out.println("His name is Manoranjan");
			
		} 
		else if (name == "SathyaSelvam") {
			System.out.println("His name is SathyaSelvam");
			
		}
		else {
			System.out.println("His name is updated");
		}
	}
}