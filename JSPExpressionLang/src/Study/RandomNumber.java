package Study;
import java.util.Random;

public class RandomNumber {

	int uppercap;
	@Override
	public String toString() {
		
		return "the Upper cap is"+uppercap;
	}
	public RandomNumber(int uc) {
		
		uppercap = uc;
	}
	
	
	public int getRandomNumber() {
		Random r = new Random();
		int rn = r.nextInt(uppercap);
		return rn;
		
	}

}
//uppercap= range up we want random numbers