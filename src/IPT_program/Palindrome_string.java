package IPT_program;

import java.util.Scanner;

public class Palindrome_string {

	public static void main(String[] args) {

		Scanner  sc = new Scanner(System.in);
		System.out.println("ENTER THE STRING NAME");
		String str = sc.next();
		String original = str;
		String  rev ="";
		int length = str.length();
		for(int i=length-1;i>=0;i--)
			
		{
			rev= rev+str.charAt(i);
		
			
		}
		if(original.equals(rev))
		{
			System.out.println(original+"is palindrome string ");
		}
		else {
			System.out.println(original+"is a not palindrome string ");
		}
			
		
	}

}
