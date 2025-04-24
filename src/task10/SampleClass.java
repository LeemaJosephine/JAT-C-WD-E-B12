package task10;

public class SampleClass {

	public static void main(String[] args) {
		
		int num = 10;
		boolean flag=true;
		
		if(num <=1) {
			flag=false;
		} else {
			
			for(int i=2 ; i<num; i++) {
				
				if(num % i == 0) {
					
					flag=false;
					
				} else {
					
					flag=true;
				}
			}
		}
		
		if(flag) {
			
			System.out.println("Prime");
		} else {
			
			System.out.println("Not a prime");
		}
	}
}
