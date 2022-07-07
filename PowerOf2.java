import java.util.Scanner;

public class PowerOf2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        	System.out.print("Enter a number : ");
        	int n = sc.nextInt();
        
        	if(n > 31)
        	{
        	System.out.println("Value of number should be less than 31");
        	return;
        	}
        	else
        	{
        	for(int i=0 ; i<=n ; i++)
            	{
                System.out.println(i + "\t" + ((int)(Math.pow(2,i))));
		}
		}
		sc.close();
	}
}