package Day4;

import java.util.Scanner;

public class BasicCoreJava {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n;
		double sum=0.0;
		System.out.println("enter n value");
		n=sc.nextInt();
		while(n>0)
		{
			sum+=(1.0)/n;
			n--;
			
		}
		System.out.println("harmonic sum is"+sum);
	}
}

