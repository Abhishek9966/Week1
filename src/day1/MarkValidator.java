package day1;

public class MarkValidator {
	
	public boolean isPass(int marks)
	{
		return (marks>=40)?true:false;
	}
	
	public boolean validateMarks(int marks)
	{
		return (marks>=1 && marks<=100)?true:false;
	}
	
	public String markGrade(int marks)
	{
		if(validateMarks(marks))
		{
		if(!isPass(marks))
			return "Fail";
		else if(marks>90)
			return "Grade A";
		else if(marks>75)
			return "Grade B";
		else if(marks>60)
			return "Grade C";
		
		return "Grade D";
		}
		
		return "Invalid Marks";
	}
	
	public String markGradeBySwitch(int marks)
	{
		String ans;
		
		if(validateMarks(marks))
		{
			if(!isPass(marks))
				return "Fail";
			
			switch(marks/10)
			{
				case 10:
				case 9:	if(marks>90)
						{
							ans="Grade A";
							break;
						}
				case 8: 
				case 7: if(marks>75)
						{
							ans="Grade B";
							break;
						}
				case 6: if(marks>60)
						{
							ans="Grade C";
							break;
						}
				default:
					ans="Grade D";
					break;
			}
			return ans;
		}
		return "Invalid Marks";
	}
	
}
