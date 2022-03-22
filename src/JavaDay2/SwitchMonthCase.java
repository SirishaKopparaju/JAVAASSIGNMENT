package JavaDay2;

import java.util.Scanner;

public class SwitchMonthCase {
	public static void main(String args[]){
	    char ch;
	    Scanner scan=new Scanner(System.in);        
	   System.out.println("Enter the month name  ");
	   ch=scan.next().charAt(0);;
	   switch(ch)
		{
		case '1': 
			System.out.println("januaray");
			break;
		case '2':
			System.out.println("feb");
			break;
		case '3' :
			System.out.println("march");
			break;
		case '4' :
			System.out.println("april");
			break;
		case '5' :
			System.out.println("may");
			break;
		case '6' :
			System.out.println("june");
			break;
		case '7' :
			System.out.println("july");
			break;
		case '8' :
			System.out.println("august");
			break;
		case '9' :
			System.out.println("september");
			break;
		case '0' :
			System.out.println("october");
			break;
		case '*' :
			System.out.println("novemeber");
			break;
		default :
			System.out.println("december");
			break;
	

}
}
}
