import java.util.Scanner;

public class Microwave {

		Scanner in = new Scanner(System.in);
		
		public Microwave() {
		}
		
		int PowerLevel = 1; // 1 is the default power level
		public int power(boolean PowerPress) {
			if (PowerPress == true)
			{
				// Determines if the power level was switched from 1 to 2, can be boolean since
				// there are only 2 options, 1 or 2, returns the power level as either 1 or 2
				PowerLevel = 2;
				System.out.println("Power button was pressed. Power level is 2");
			}
			else
			{
				PowerLevel = 1;
			}
			return PowerLevel;		
		}
		
		int TotalTime = 0;
		public int time(int TimePress) {
			for (TimePress = TimePress; TimePress > 0; TimePress-- ) {
				//adds 30 seconds per button press, reading out the total time for each button press
				TotalTime = TotalTime + 30; 
				System.out.println("Time Button was pressed. Time is " + TotalTime + " seconds");
			}
			return TotalTime;
		}
		
		public void start() {
			//Starts microwave, reading out current settings
			System.out.println("Cooking for " + TotalTime + " seconds at level " + PowerLevel);
		}
		
		public void reset() {
			System.out.println("Reset button was pressed. Power level is 1. Time is 0 seconds");
			TotalTime = 0;
			PowerLevel = 1;
			// sets settings back to default of 0 seconds and power level 1
		}
	}


