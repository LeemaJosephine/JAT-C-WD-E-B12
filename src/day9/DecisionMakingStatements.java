package day9;

public class DecisionMakingStatements {

	public static void main(String[] args) {

		// This program demonstrates the decision making statement
		
		// Check voting eligibility
		
		int age = 20;
		
		boolean voterid = false;
		boolean votingSlip = false;
		
		// Simple-if
		
		System.out.println("----Simple-if----");
		
		if(age >= 18) {
			
			System.out.println("Eligible to vote");
		}
		
		System.out.println();
		// If-else
		
		System.out.println("----if-else----");
		
		if(age >= 18) {
			
			System.out.println("Eligible to vote");
			
		} else {
			
			System.out.println("Sorry not eligible");
		}
		
		System.out.println();
		
		// if-else-if ladder
		
//		if(voterid==true && votingSlip==true) {
//		
//				System.out.println("Eligible to vote");
//			
//		} else {
//			
//			System.out.println("Oops!! Sorry you are not eligible to vote");
//		}
//		
		
		System.out.println("---if-else-if ladder----");
		if(voterid==true) {
			
			System.out.println("Person has voter id, eligible to vote");
			
		} else if(votingSlip==true) {
			
			System.out.println("Person has voting slip, eligible to vote");
			
		} else {
			
			System.out.println("Oops!! Sorry you are not eligible to vote");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("----Nested-if---");
		
		if(age >=18 ) {
			
			if(voterid==true || votingSlip==true) {
				
				System.out.println("Eligible to vote");
			} else {
				
				System.out.println("Voter id is required");
			}
		} else {
			
			System.out.println("Sorry, you are under age!!");
		}
		
		System.out.println("End of program");
		
		//switch case
		
		// Print day of week as per week number
		
		int number= 8;
		
		// 
		
		switch(number) {
		
		case 0:
			 System.out.println("Sunday");
			 break;
		
		case 1:
			System.out.println("Monday");
			break;
			
		case 2:
			System.out.println("Tuesday");
			break;
			
		case 3:
			System.out.println("Wednesday");
			break;
			
		case 4:
			System.out.println("Thursday");
			break;
			
		case 5:
			System.out.println("Friday");
			break;
			
		case 6,7,8,9:
			System.out.println("Saturday");
			break;
			
		default:
				System.out.println("Invalid input");
		}
		
	}

}
