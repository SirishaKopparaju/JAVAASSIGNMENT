package Day6;
public class LogicalPrograms {
	public static int main(String[] args) {
	int i;
	int total;
	
   int[] notes = { 1000,500,100,50,10,5,2,1};
   int money;
  	
  	
        int rem;
		if(money==0)
		{
			return -1 ;
		}
		else
		{
			if(money>=notes[i])
			{
				int calNotes =money/notes[i];
				rem = money%notes[i];
				money =rem;
				total += calNotes;
				System.out.println(notes[i]+   " Notes ---> " +calNotes );
			}
			i++;
			return calculate(money, notes);
		}
	}

	private static int calculate(int money, int[] notes) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
}


