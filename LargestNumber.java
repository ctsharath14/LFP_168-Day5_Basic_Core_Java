//Java Program to Find the Largest Among Three Numbers

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
        	System.out.print("Enter the first number:");
        	a = sc.nextInt();
        	System.out.print("Enter the second number:");
        	b = sc.nextInt();
        	System.out.print("Enter the third number:");
        	c = sc.nextInt();
		
		sc.close();
        
        	if(a > b && a > c)
        	{
            	System.out.println("Largest number is:" + a);
        	}
        	else if(b > c)
        	{
            	System.out.println("Largest number is:"+b);
        	}
        	else
        	{
            	System.out.println("Largest number is:"+c);
        	}
       
	}
}