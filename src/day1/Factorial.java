package day1;

public class Factorial {

	public int calculateFactorial(int number)
	{
		int ans=1;
			
		if(number<0)
		{
			System.out.println("Negative numbers are not allowed");
			return 0;
		}
		if(number==0)
			return 1;
		
		for(int i=number;i>1;i--)
			ans*=i;
			
		return ans;
	}
}
