import java.util.Scanner;

public class HousePainting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		
		double HouseWidth, HouseLength, SideSArea, HouseHeight, PeakSideSArea, TotalHouseSArea, WindowWidth, WindowLength, TotalWindowSArea, DoorWidth, DoorLength, TotalDoorSArea, PaintedSArea, CostPerSqFt, Cost;
		int AmtDoor, AmtWindow;
		
		//Obtaining values for variables:
		System.out.println("Please input the following:");
		
		System.out.print("House Width: ");
		HouseWidth = in.nextDouble();
		System.out.println();
		
		System.out.print("House Length: ");
		HouseLength = in.nextDouble();
		System.out.println();

		System.out.print("House Height: ");
		HouseHeight = in.nextDouble();
		System.out.println();

		System.out.print("Door Width: ");
		DoorWidth = in.nextDouble();
		System.out.println();
		
		System.out.print("Door Length: ");
		DoorLength = in.nextDouble();
		System.out.println();

		System.out.print("Number of Doors: ");
		AmtDoor = in.nextInt();
		System.out.println();

		System.out.print("Window Width: ");
		WindowWidth = in.nextDouble();
		System.out.println();

		System.out.print("Window Length: ");
		WindowLength = in.nextDouble();
		System.out.println();
		
		System.out.print("Number of Windows: ");
		AmtWindow = in.nextInt();
		System.out.println();

		System.out.print("Cost per Square Foot: ");
		CostPerSqFt = in.nextDouble();
		System.out.println();

		//Calculates total surface area of all sides and then subtracts the total surface area of all doors and windows
		PaintedSArea = (4*(HouseWidth * HouseLength) + (HouseLength*(HouseHeight - HouseWidth))) - ((AmtDoor*DoorWidth*DoorLength) + (AmtWindow*WindowWidth*WindowLength));
		Cost = PaintedSArea * CostPerSqFt;
		
		
		System.out.println("Total Paintable Surface Area: " + PaintedSArea + " square feet");
		System.out.println("Total Estimate: " + Cost + " Dollars");
	}

}
