import java.io.FileNotFoundException;
import java.util.Scanner;
public class DonationsTester {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Donations giveToMe = new Donations();
		
		System.out.println("Would you like to process donations? (Enter 'Yes' to continue): ");
		String YorN = in.next();
		
		if (YorN.equals("Yes"))
		{
		giveToMe.getStatistics();
		}
		
		else
		{
			System.out.println("Ending now without processing donations.");
		}
		
	in.close();
	}
}
