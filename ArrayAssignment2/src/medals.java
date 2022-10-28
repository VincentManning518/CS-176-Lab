import java.util.*;

public class medals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ALSO MAKE COLUMN TOTALS AND TOTAL MEDAL TOTAL
		
		//2 dimensional array list
		ArrayList<ArrayList<String>> medals = new ArrayList();
		
		//array of column labels
		ArrayList<String> columnLabels = new ArrayList();
		columnLabels.add("Country");
		columnLabels.add("Gold");
		columnLabels.add("Silver");
		columnLabels.add("Bronze");
		columnLabels.add("Total");
		
		ArrayList<String> canada = new ArrayList();
		canada.add("Canada");
		canada.add("0"); //Gold
		canada.add("3"); //Silver
		canada.add("0"); //Bronze
		canada.add("3"); //Total medals for country, follows same order below
		
		ArrayList<String> italy = new ArrayList();
		italy.add("Italy");
		italy.add("0");
		italy.add("0");
		italy.add("1");
		italy.add("1");
		
		ArrayList<String> germany = new ArrayList();
		germany.add("Germany");
		germany.add("0");
		germany.add("0");
		germany.add("1");
		germany.add("1");
		
		ArrayList<String> japan = new ArrayList();
		japan.add("Japan");
		japan.add("1");
		japan.add("0");
		japan.add("0");
		japan.add("1");
		
		ArrayList<String> kazakhstan = new ArrayList();
		kazakhstan.add("Kazakhstan");
		kazakhstan.add("0");
		kazakhstan.add("0");
		kazakhstan.add("1");
		kazakhstan.add("1");
		
		ArrayList<String> russia = new ArrayList();
		russia.add("Russia");
		russia.add("3");
		russia.add("1");
		russia.add("1");
		russia.add("5");
		
		ArrayList<String> southkorea = new ArrayList();
		southkorea.add("South Korea");
		southkorea.add("0");
		southkorea.add("1");
		southkorea.add("0");
		southkorea.add("1");

		ArrayList<String> unitedstates = new ArrayList();
		unitedstates.add("United States");
		unitedstates.add("1");
		unitedstates.add("0");
		unitedstates.add("1");
		unitedstates.add("2");
		
		medals.add(columnLabels);
		medals.add(canada);
		medals.add(italy);
		medals.add(germany);
		medals.add(japan);
		medals.add(kazakhstan);
		medals.add(russia);
		medals.add(southkorea);
		medals.add(unitedstates);

		//counts medal total for each type of medal
		int goldCount = 0, silverCount = 0, bronzeCount = 0;
		for (int p=1 ; p<medals.size() ; p++)
		{
			goldCount += Integer.parseInt(medals.get(p).get(1));
			silverCount += Integer.parseInt(medals.get(p).get(2));
			bronzeCount += Integer.parseInt(medals.get(p).get(3));
		}
		int totalCount = goldCount + silverCount + bronzeCount;
		String gold = Integer.toString(goldCount);
		String silver = Integer.toString(silverCount);
		String bronze = Integer.toString(bronzeCount);
		String grandTotal = Integer.toString(totalCount); 
		
		//places medal type totals into an array
		ArrayList<String> columnTotal = new ArrayList();
		columnTotal.add("Total");
		columnTotal.add(gold);
		columnTotal.add(silver);
		columnTotal.add(bronze);
		columnTotal.add(grandTotal);

		medals.add(columnTotal);
		
		//prints out 2 dimensional array of countries and medal numbers in format
		for (int i=0 ; i<medals.size() ; i++)
		{		
			int countryName = 0;

			for (int j=0 ; j<medals.get(i).size() ; j++)
			{
				System.out.print(medals.get(i).get(j) + "\t");
				
				if (medals.get(i).get(countryName).length() < 8 ) //makes short named countries' columns formatted 
				{
					System.out.print("\t");
				}
				countryName++;
			}
			System.out.println();
		}
	}



		
		




		

		



		


		



		
	}


