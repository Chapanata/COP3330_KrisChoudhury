package choudhury_p2;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		int formulaChoice; //Variable to hold value entered by user when choosing which formula to use
		
		double weightSTD; //Weight in pounds
		double weightMetric; //Weight in kilograms
		
		int heightFeet; //Height in feet
		int heightInch; //Remaining height in inches
		int heightMetric; //Height in centimeters
		double heightInchTot; //Conversion of height in feet to centimeters 
		
		double metricBMI; //Final BMI in metric
		double stdBMI; //Final BMI in standard
		
		System.out.println("To calculate your BMI, first select which formula you would like to use. Enter 1 for Standard or enter 2 for Metric:");
		formulaChoice = scnr.nextInt(); //Asks user to choose from formula 1 or 2. If anything else is entered the program will stop
		
		if (formulaChoice == 1 ) { //Standard BMI Calculator. Feet and Pounds.
			
			System.out.println("Enter weight in pounds: ");
			weightSTD = scnr.nextDouble(); 
			
			System.out.println("Enter height in feet: ");
			heightFeet = scnr.nextInt();
			
			System.out.println("Enter remaining height in inches: ");
			heightInch = scnr.nextInt();
			
			heightInchTot = (heightFeet * 12.0) + heightInch; //Converts entire height to inches
			stdBMI = (703 * weightSTD) / Math.pow(heightInchTot, 2.0); //Calculates BMI using standard system
			
			System.out.printf("Your BMI is: %.1f\n", stdBMI);
			
			if (stdBMI < 18.5) { 
				System.out.println("Underweight");
			}
			
			else if ( stdBMI >= 18.5 && stdBMI < 25) {
				System.out.println("Normal weight");
			}
			
			else if ( stdBMI >= 25 && stdBMI < 30) {
				System.out.println("Overweight");
			}
			
			else if (stdBMI >= 30) {
				System.out.println("Obese");
			}
		}
		
		if (formulaChoice == 2 ) { //Metric BMI Calculator. Feet and Pounds.
			
			System.out.println("Enter weight in kilograms: ");
			weightMetric = scnr.nextDouble();
			
			System.out.println("Enter height in centimeters: ");
			heightMetric = scnr.nextInt();
					
			metricBMI = (100 * 100 * weightMetric) / Math.pow(heightMetric, 2.0); //Calculates BMI using metric system. Also converts height from centimeters to meters
			
			System.out.printf("Your BMI is: %.1f\n", metricBMI);
			
			if (metricBMI < 18.5) {
				System.out.println("Underweight");
			}
			
			else if ( metricBMI >= 18.5 && metricBMI < 25) {
				System.out.println("Normal weight");
			}
			
			else if ( metricBMI >= 25 && metricBMI < 30) {
				System.out.println("Overweight");
			}
			
			else if (metricBMI >= 30) {
				System.out.println("Obese");
			}
		}
		

		
	}
}
