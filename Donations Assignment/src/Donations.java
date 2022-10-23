import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Donations {
	
	//initializing variables
	int numIndividual=0, numBusiness=0, numOther=0;
	double amtIndividual=0, amtBusiness=0, amtOther=0;
	
	//Sums of total number of donations and total amount of donations for 
	//each category from the Donations.txt file and displays the results
	public void getStatistics() throws FileNotFoundException {
	
	File inputFile = new File("C:\\Users\\vmann\\Downloads\\Donations.txt");
	Scanner in = new Scanner(inputFile);	
	Scanner lineReader = new Scanner(inputFile);
	
	String number = null;
	String donationType = null;

	//Checks if the next line in the doc has anything in it, ends method 
	//when <EOF> sentinel is encountered
	while (!in.nextLine().contains("EOF"))
	{	
		int i = 0;	
		String line = lineReader.nextLine();
		
		//Divides line into category portion and number portion
		while(!Character.isDigit(line.charAt(i)))
		{
			i++;
		}
		
		donationType = line.substring(0, i); //category portion
		//System.out.print(donationType); //<-- Unnecessary for final code, only to check what lines are being processed by following if else statements
		number = line.substring(i);  //number portion
		//System.out.println(number); //<-- See comment above comment above
		double amount = Double.parseDouble(number);

		if (donationType.contains("individual"))
		{
			if (line.substring(i-1, i).contains("-")) //determines if donation is negative
			{
				numIndividual -= 1;
				amtIndividual -= amount;
			}
			else
			{
				numIndividual += 1;
				amtIndividual += amount;
			}
		}
		
		else if (donationType.contains("business"))
		{
			if (line.substring(i-1, i).contains("-"))  //determines if donation is negative
			{
				numBusiness -= 1;
				amtBusiness -= amount;
			}
			else
			{
				numBusiness += 1;
				amtBusiness += amount;
			}
		}
		else if (donationType.contains("other"))
		{
			if (line.substring(i-1, i).contains("-")) //determines if donation is negative
			{
				numOther -= 1;
				amtOther -= amount;
			}
			else
			{
				numOther += 1;
				amtOther += amount;	
			}
		}
	}
	
	//prints the results
	System.out.println("Number of Donations from Individuals: " + numIndividual);
	System.out.println("Total Donations from Indivduals: $" + amtIndividual);
	System.out.println("Number of Donations from Businesses: " + numBusiness);
	System.out.println("Total Donations from Businesses: $" + amtBusiness);
	System.out.println("Number of Donations from Other: " + numOther);
	System.out.println("Total Donations from Other: $" + amtOther);
		
	in.close();
	lineReader.close();
	}
	
	//Processes a new donation for a specific category
	public void processDonation(String cat, double amt) {
		
		//following beginning if else statements determine category and then adjust amount 
		//and number as necessary, printing the donation category and amount
		if (cat.contains("individual"))
		{
			if(amt < 0) //determines if donation is negative
			{
				numIndividual -= 1;
				amtIndividual -= amt;
			}
			
			else
			{
				numIndividual += 1;
				amtIndividual +=amt;
			}
			
			System.out.println(cat + " donation amount: $" + amt);
		}
		
		else if (cat.contains("business"))
		{
			if(amt < 0) //determines if donation is negative
			{
				numBusiness -= 1;
				amtBusiness -= amt;
			}
			
			else
			{
				numBusiness += 1;
				amtBusiness +=amt;
			}
			
			System.out.println(cat + " donation amount: $" + amt);
		}
		
		else if (cat.contains("other"))
		{
			if(amt < 0) //determines if donation is negative
			{
				numOther -= 1;
				amtOther -= amt;
			}
			
			else
			{
				numOther += 1;
				amtOther += amt;
			}
			
			System.out.println(cat + " donation amount: $" + amt);
		}
		
	}
}
