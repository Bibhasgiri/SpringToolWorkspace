package bibhas.pract.program;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DecimalExample {
	private static DecimalFormat df2 = new DecimalFormat("#.##");

	public static void main(String[] args) {
		double input = 3.1498923482;
		System.out.println("Double: " + df2.format(input));

		df2.setRoundingMode(RoundingMode.DOWN);
		System.out.println(df2.format(input));
	}

}
