package day1;

public class SumOfNumbers {

	public int sumOfEvenNumbers(int start, int end)
	{
		int sum=0;
		if(start%2==1)
			start++;
		
		for(int i=start;i<=end;i+=2)
			sum+=i;
		
		return sum;
	}
	
	public int sumOfOddNumbers(int start, int end)
	{
		int sum=0;
		if(start%2==0)
			start++;
		
		for(int i=start;i<=end;i+=2)
			sum+=i;
		
		return sum;
	}
}
