package choudhury_p1;

import java.util.Scanner;

class Decrypt {

	public void Decrypt() {
		
		Scanner scnr = new Scanner(System.in);
		int fourDigit; // Four digit encrypted number to be entered.
		
		System.out.println("Please enter a 4-digit integer to decrypt:");
		fourDigit = scnr.nextInt();
		
		int w = fourDigit / 1000; //Saves the 1st digit into variable a. Ex/ 1234 is entered. a = 1.	
		int x = (fourDigit % 1000) / 100; //Saves the 2nd digit into variable b. Ex/ 1234 is entered. b = 2.
		int y = (fourDigit % 100) / 10; //Saves the 3rd digit into variable x. Ex/ 1234 is entered. x = 3.
		int z = fourDigit % 10; //Saves the 4th digit into variable y. Ex/ 1234 is entered. y = 4.
		
		// Decryption Part. Problem requires that you decrypt each part of the four digit integer to form the original number.
			
		w = (w + 3) % 10; //Encryption
		x = (x + 3) % 10; //Encryption
		y = (y + 3) % 10; //Encryption
		z = (z + 3) % 10; //Encryption
		
		//Decryption is finished. Last thing to do is to swap first digit (w) with third digit (y) and swap second digit (x) with fourth digit (z)
		
		System.out.println("The decrypted integer is:");
		System.out.print(y + "" + z + "" + w + "" + x); //Prints Decrypted integer.
	
		
	}
}
