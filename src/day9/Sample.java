package day9;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	       //read the temp
	       double celsius = scanner.nextDouble();
	       //convert to fahrenheit
	       double fahrenheit = (celsius * 9/5) + 32;
	       // one decimal place
	       BigDecimal bd = new BigDecimal(fahrenheit).setScale(1, RoundingMode.HALF_UP);
	       double roundedFahrenheit = bd.doubleValue();
	       
	       //print the result
	       System.out.printf("%.1f", roundedFahrenheit);
	}

}
