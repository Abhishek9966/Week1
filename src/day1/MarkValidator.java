package day1;

public class MarkValidator {
	
	public boolean isPass(int marks)
	{
		if(marks>=40)
			return true;
		else
			return false;
	}
	
	public String markGrade(int marks)
	{
		if(marks>90)
			return "Grade A";
		else if(marks>75)
			return "Grade B";
		else if(marks>60)
			return "Grade C";
		
		return "Grade D";
	}
	
	public String markGrad(int marks)
	{
		String ans;
		switch(marks)
		{
			case 100:
			case 99:
			case 98:
			case 97:
			case 96:
			case 95:
			case 94:
			case 93:
			case 92:
			case 91:
				ans="Grade A";
				break;
			
			case 90: case 89: case 88: case 87: case 86: case 85: case 84: case 83: case 82: case 81: case 80:
			case 79: case 78: case 77: case 76:
				ans="Grade B";
				break;
			
			case 75: case 74: case 73: case 72: case 71: case 70: case 69: case 68: case 67: case 66: case 65:
			case 64: case 63: case 62: case 61:
				ans="Grade C";
				break;
			
			default:
				ans="Grade D";
				break;
		}
		return ans;
	}
	
}
