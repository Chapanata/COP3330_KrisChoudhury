package choudhury_p1;

import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) {
		//Run this class for the program to work. It calls the decrypt class at the end.
		Scanner scnr = new Scanner(System.in);
		int fourDigit; // Four digit number to be entered.
		
		System.out.println("Please enter a 4-digit integer to encrypt:");
		fourDigit = scnr.nextInt();
		
		int w = fourDigit / 1000; //Saves the 1st digit into variable a. Ex/ 1234 is entered. a = 1.	
		int x = (fourDigit % 1000) / 100; //Saves the 2nd digit into variable b. Ex/ 1234 is entered. b = 2.
		int y = (fourDigit % 100) / 10; //Saves the 3rd digit into variable x. Ex/ 1234 is entered. x = 3.
		int z = fourDigit % 10; //Saves the 4th digit into variable y. Ex/ 1234 is entered. y = 4.
		
		//Encryption Part. Problem requires that you replace each digit by adding 7 and using the modulo operator by 10 to get the remainder. (a + 7) % 10
			
		w = (w + 7) % 10; //Encryption
		x = (x + 7) % 10; //Encryption
		y = (y + 7) % 10; //Encryption
		z = (z + 7) % 10; //Encryption
		
		//Encryption is finished. Last thing to do is to swap first digit (w) with third digit (y) and swap second digit (x) with fourth digit (z)
		System.out.println("The encrypted integer is:");
		System.out.println(y + "" + z + "" + w + "" + x); //Prints encrypted integer.
		
		Decrypt DecryptObject = new Decrypt();
		DecryptObject.Decrypt();

	}
}
