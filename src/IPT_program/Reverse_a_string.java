package IPT_program;

import java.util.Scanner;

public class Reverse_a_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the number");
		int num = sc.nextInt();
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
			
		}
		System.out.println("reverse a number is :"+rev);
	}

}
