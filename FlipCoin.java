import java.util.Scanner;

public class FlipCoin {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int flip = 0 , head = 0, tail = 0;
		
		System.out.println("Enter the number of time you want to flip the coin");
		float flipNum = sc.nextInt();

		while (flip < flipNum) {
			double flipResult = Math.floor(Math.random() * 10) % 2;
			flip ++;

		if (flipResult == 1)
		head ++;
		else
		tail ++;
		}
		sc.close();

		float perHead = (head * 100 / flipNum);
		float perTail = (tail * 100 / flipNum);

		System.out.println("Number of Head is : "+head);
		System.out.println("Number of Tail is : "+tail);

		System.out.println("Head percentage is : "+perHead+"%");
		System.out.println("Tail percenatge is : "+perTail+"%");
		}
}

		