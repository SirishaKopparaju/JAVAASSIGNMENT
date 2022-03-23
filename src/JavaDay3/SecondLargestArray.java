package JavaDay3;

public class SecondLargestArray {
	public static int getSecondLargest(int[] a, int total){  
		int temp;  
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[total-2];  
		}  
		public static void main(String args[]){  
		int a[]={7,6,4,3,2,8,9};  
		int b[]={22,33,34,56,77,89};  
		System.out.println("Second Largest: "+getSecondLargest(a,7));  
		System.out.println("Second Largest: "+getSecondLargest(b,6));  
		}
}
