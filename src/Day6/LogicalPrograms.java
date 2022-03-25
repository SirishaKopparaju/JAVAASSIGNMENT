package Day6;

import java.time.LocalDateTime;

public class LogicalPrograms {
	public static void main(String[] args) 
	{
		LocalDateTime localdatetime	=LocalDateTime.now();
		char ch = 0;
		
System.out.println(localdatetime);
	
	switch(ch)
	{
	case '0': 
		System.out.println("start the stop watch");
		break;
	case '1':
		System.out.println("stop the stop watch");
		break;
	}
	}
}
