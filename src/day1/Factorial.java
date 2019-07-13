package day1;

public class Factorial {

	public int calculateFactorial(int number)
	{
		int ans=1;
		for(int i=number;i>1;i--)
			ans*=i;
		return ans;
	}
}
