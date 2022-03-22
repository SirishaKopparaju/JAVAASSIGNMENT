package JavaDay2;

import java.util.Scanner;

public class WhileLoopReverseNumber {
	public static void main (String[]args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number");

	int rev=0;
	int num = sc.nextInt();
	
	while(num!=0){

	rev=rev*10+num%10;
	num=num/10;
	}
	
	System.out.println("Enter revrse number"+rev);
	}

}

