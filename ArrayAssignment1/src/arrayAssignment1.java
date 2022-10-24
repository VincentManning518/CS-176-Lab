
public class arrayAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double [] values = {25.3, 100, -10, -1.5, 13, 98.6, 17, 123.145, 125.6, 123.146};
		
		//Printing all elements of an array in a single row, separated by spaces
		for (double element : values)
		{
			System.out.print(element + " ");
		}
		System.out.println();
		
		//Computing and printing the largest elements in the array
		double largest = values[0];
		for (double element : values)
		{
			if(element > largest)
			{
				largest = element;
			}
		}
		System.out.println("The largest element in the array is: " + largest);
		
		//Computing and printing a count of elements in the array that are negative
		int counter = 0;
		for(double element : values)
		{
			if (element < 0)
			{
				counter ++;
			}
		}
		System.out.println("There are " + counter + " negative elements in the array");
	}

}
