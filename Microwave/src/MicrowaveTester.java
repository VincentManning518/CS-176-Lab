
public class MicrowaveTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Microwave myMicrowave = new Microwave();
		
		myMicrowave.power(false);
		myMicrowave.time(3);
		
		myMicrowave.start();
		myMicrowave.reset();
		
		myMicrowave.start();
		myMicrowave.reset();
		
		myMicrowave.power(true);
		myMicrowave.time(4);
		
		myMicrowave.start();
		
	}

}
