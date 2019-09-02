package day1;

public class SumOfNumbers {
	
	public boolean validateNumber(int number)
	{
		boolean validationflag=true;
		if(number<0)
			validationflag=false;
		
		return validationflag;
	}

	public int sumOfEvenNumbers(int start, int end)
	{
		
		if(!validateNumber(start) && !validateNumber(end))
			return 0;
		
		int evenSum=0;
		if(start%2==1)
			start++;
		
		for(int i=start;i<=end;i+=2)
			evenSum+=i;
		
		return evenSum;
		
		/* To get sum in constant time
		if(start%2==0)
		{
			int sumOfPreviousEven=(start/2)-1;
			sumOfPreviousEven=sumOfPreviousEven*(sumOfPreviousEven+1);
			return (end/2)*(end/2+1)-sumOfPreviousEven;
		}
		else
		{
			int sumOfPreviousEven=(start/2);
			sumOfPreviousEven=sumOfPreviousEven*(sumOfPreviousEven+1);
			return (end/2)*(end/2+1)-sumOfPreviousEven;
		}
		
		*/
	}
	
	public int sumOfOddNumbers(int start, int end)
	{
		
		if(!validateNumber(start) && !validateNumber(end))
			return 0;
		
		int oddSum=0;
		if(start%2==0)
			start++;
		
		for(int i=start;i<=end;i+=2)
			oddSum+=i;
		
		return oddSum;
		
		/*
		if(end%2==0)
		{
			int sumOfPreviousOdd=(start/2);
			sumOfPreviousOdd=sumOfPreviousOdd*(sumOfPreviousOdd);
			return (end/2)*(end/2)-sumOfPreviousOdd;
		}
		else
		{
			int sumOfPreviousOdd=(start/2);
			sumOfPreviousOdd=sumOfPreviousOdd*(sumOfPreviousOdd);
			return ((end/2)+1)*((end/2)+1)-sumOfPreviousOdd;
		}
		
		*/
	}
}
