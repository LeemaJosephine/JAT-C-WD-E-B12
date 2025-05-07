package codekataDay2;

import java.util.Scanner;

public class EngineNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String plateNumber = sc.nextLine();
		
		int res =calculateEngineNumber(plateNumber);
		System.out.println(res);
		
	}
	
	public static int calculateEngineNumber(String plateNumber) {
		
		int engineNumber = 0;
		
		for(int i=0; i<plateNumber.length();i++) {
			
			char c = plateNumber.charAt(i);
			if(Character.isDigit(c)) {
				engineNumber += Character.getNumericValue(c);
			}
		}
		
		return engineNumber;
	}

}
