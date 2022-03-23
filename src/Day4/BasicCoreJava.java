package Day4;

import java.util.Scanner;

public class BasicCoreJava {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n,p,res=1;
		double sum=0.0;
		System.out.println("enter n value");
		n=sc.nextInt();
		System.out.println("enter p value");

		p=sc.nextInt();

		for (int i=1;i<=p;i++) {
			res=n*res;
		}
		System.out.println("power is"+res);
	}
}

