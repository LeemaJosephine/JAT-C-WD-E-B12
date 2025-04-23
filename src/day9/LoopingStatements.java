package day9;

public class LoopingStatements {

	public static void main(String[] args) {
		
		
		int a=10;
		
//		System.out.println(a++); // 10 -> 11 
//		System.out.println(++a); // 11 + 1 -> 12
	
		
		System.out.println("Print hello world 5 times");
		
		for(int i=1; i <= 5; i++) {
			
			System.out.println("Hello world");
		}
		
		System.out.println("End of program");
		System.out.println();
		
		System.out.println("Print numbers from 1 to 10");
		
		for(int i=1; i <=10 ;i++) {
			
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		System.out.println("Print numbers from 10 to 1");
		
		for(int i=10 ; i>=1 ;i--) {
			
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		int n=5;
		for(int i=1; i<=n;i++) {
			
			for(int j=1; j<=n;j++) {
				
				System.out.print(j);
				
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		// PRINT 1 TO 10 BUT SKIP 5
		
		for(int i=1; i<=10; i++) {
			
			if(i == 5) {
				continue;  // skip the iteration 
			}
			
			if( i==7 ) {
				
				break;  // end the loop
			}
			System.out.println(i);
		}
		
		System.out.println();
		
		System.out.println("While statement");
		
		int i = 1;
		
		while(i<=10) {
			
			System.out.println(i);
			i++;
		}
		
		System.out.println();
		
		System.out.println("do-while");
		
		int j=1;
		do {
			System.out.println(j);
			j++;
		}while(j<=10);
	}

}
