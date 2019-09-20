package choudhury_p3;

import java.util.Scanner;

public class Polling {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int x; // Holds the ratings inputted by the user
		int i; // Increment variable for row
		int j; // Increment variable for columns
		int k; // Increment variable for printing topic loop
		int numPeople; // Variable to see how many people will respond
		float min;
		float max;
		int minPlace = 0; // Variable to hold the spot within the minimum number in the array
		int maxPlace = 0; //Variable to hold the spot within the maximum number in the array
		float average = 0; // Variable to hold average
		float mult = 0; // Variable to hold mult
		String[] topics = { "School", "Food", "Movies", "Games", "Money" }; // 1D array for Topics
		float[][] responses = new float[5][10]; // Declare 2D array: 5 row, 10 column


		System.out.print("Enter the number of users that will be participating in this poll: ");
		numPeople = scnr.nextInt(); // Scans for user input

		for (j = 0; j < numPeople; j++) { // Loop that displays the the prompt for the user to enter rating for each topic
			for (i = 0; i < 5; i++) {
				System.out.print("Enter Person " + (j + 1) + "'s Rating for " + topics[i] + ": "); // Increments j+1 for person
				x = scnr.nextInt();
				responses[i][x - 1]++;
			}
		}

		for (i = 1; i <= 10; i++) { // Loop to print the Ratings Score at Top of Table
			System.out.print(" \t" + i + "\t");
		}

		System.out.println(""); //New Line for neatness

		for (i = 0; i < 5; i++) { // This prints out the count for the ratings and displays in a tabular format
			System.out.print(topics[i]);
			for (k = 1; k <= 10; k++) {
				System.out.print(" \t" + responses[i][k - 1] + "\t");
				mult += responses[i][k - 1] * (k);
			}

			average = mult / numPeople;
			responses[i][9] = average; //Average gets stored in here and is displayed at the end of each topic
			System.out.print("\t" + responses[i][9] + "\t");
			
			for (j=0; j < 5; j++) {
				
				min = responses[0][9];
				max = responses[0][9];
				
				if (min > responses[j][9]) {
					min = responses[j][9];
					minPlace = j;
				}
				
				if (max < responses[j][9]) {
					max = responses[j][9];
					maxPlace = j;
				}
			}

			System.out.println("");
			mult = 0; //Reset mult back to 0 to do average for next increment
			

		}
		System.out.println("");
		System.out.println("The issue that received the highest point total: " + topics[maxPlace] + ": " + responses[maxPlace][9]); //Prints highest point total
		System.out.println("The issue that received the lowest point total: " + topics[minPlace] + ": " + responses[minPlace][9]); //Prints lowest point total


	}
}