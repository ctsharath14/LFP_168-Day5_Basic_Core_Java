import java.util.Scanner;

public class FlipCoin {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int flip = 0 , head = 0, tail = 0;
		
		System.out.println("Enter the number of time you want to flip the coin");
		int flipNum = sc.nextInt();

		while (flip < flipNum) {
			int flipResult = (int) (Math.random() * 2);
			flip ++;

		if (flipResult == 1)
		head ++;
		else
		tail ++;
		}
		sc.close();

		int perHead = (head * 100 / flipNum);
		int perTail = (tail * 100 / flipNum);

		System.out.println("Number of Head is : "+head);
		System.out.println("Number of Tail is : "+tail);

		System.out.println("Head percentage is : "+perHead+"%");
		System.out.println("Tail percenatge is : "+perTail+"%");
		}
}

		
