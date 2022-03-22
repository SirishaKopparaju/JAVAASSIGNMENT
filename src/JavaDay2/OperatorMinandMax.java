package JavaDay2;

import java.util.Scanner;

public class OperatorMinandMax {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int a,b,c,largest,temp1,temp2;
		a = sc.nextInt();  
		b = sc.nextInt();  
		c = sc.nextInt();  
		System.out.println(a+b*c); 
		System.out.println(c+a/b);
		System.out.println(a%b+c);
		System.out.println(a*b+c); 
		temp1=a+b*c>c+a/b?a+b*c:c+a/b;  
		temp2=a%b+c>a*b+c?a%b+c:a*b+c;  
		largest=temp1>temp2?temp1:temp2;
		System.out.println("The largest number is: "+largest);  


			
}
}
