package JavaDay1;

public class staticvariables {
	static void incr() {
		 int a = 0; //static variable
			System.out.println("choose it from static method");
		a=a+50;
		System.out.println("a value :" +a);
		}
			static {   //static method
			System.out.println("From static block");
			 int a = 10;
			} 
			public static void main(String[]args)  //static block
			{
				System.out.println("from main block");
				int a = 0;
				System.out.println("value of a:" +a);
				incr();
				
			}


}
