import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		sc.close();
		
		if(num % 2 == 0)
			System.out.println(num + " is a even number");
		else
			System.out.println(num + " is a odd number");
		}
}