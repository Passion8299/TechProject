package Java_Task;

public class Ex {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			
			for(int j=i; j<=5; j++) {
				
				System.out.print("  ");
			}
			for(int k=1; k<=i; k++) {
				
				System.out.print(k+" ");
				
			}
			System.out.println();
		}

	}
	
}
