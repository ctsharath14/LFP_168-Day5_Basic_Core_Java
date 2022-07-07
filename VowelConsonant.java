import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a alphabet to check if it is a Vowel or Consonant : ");
		char cr = sc.next().charAt(0);
		switch (cr) {
        	case 'a':
        	case 'e':
        	case 'i':
        	case 'o':
        	case 'u':
            	System.out.println(cr+" is a Vowel");
            	break;
            	default :
            	System.out.println(cr+" is a Consonant");
    		}
	}

}