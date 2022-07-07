import java.util.Scanner;

public class SwapNumbers {
	public static void main(String[] args) {
		
		int a, b, c;
		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter the value of A and B:"); 
		a = sc.nextInt(); 
		b = sc.nextInt(); 
		 
		System.out.println("Before swapping numbers: "+a +"  "+ b); 
		sc.close(); 
		c = a;
		a = b;
		b = c;
		System.out.println("After swapping: "+a +"   " + b);
		}
}