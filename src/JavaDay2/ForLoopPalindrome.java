package JavaDay2;

import java.util.Scanner;

public class ForLoopPalindrome {
	public static void main(String[] args)   
	{  
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
	int rev=0;
	int i=0;
	
	for(i = 0; num!=0; ++i)  
	{  
		rev=rev*10+num%10;
		num=num/10;
	
	}  
	
	System.out.println("number after reverse= " + rev);  

	if (num==rev) {;
		System.out.println("number is palindrome"+rev);
	}
	else {
	
		System.out.println("number is not palindrome");
	}
}
}
