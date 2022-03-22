package JavaDay2;
import java.util.Scanner;


public class SwitchCaseVowelOrConsont {
	public static void main(String args[]){
	    char ch;
	    Scanner scan=new Scanner(System.in); 
	       
	       
	   System.out.println("Enter the Alphabet for check vowel or consonant  ");
	   ch=scan.next().charAt(0);;
	
	
	switch(ch)
	{
	case 'a': 
		System.out.println("a is vowel");
		break;
	case 'e':
		System.out.println("e is vowel");
		break;
	case 'i' :
		System.out.println("i is vowel");
		break;
	case 'o' :
		System.out.println("o is vowel");
		break;
	case 'u' :
		System.out.println("u is vowel");
		break;
	default :
		System.out.println("it is not vowel,it is consonant");
		break;
	}
	}
}

		