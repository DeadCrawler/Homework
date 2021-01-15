package condOper;

public class ConditionalOperator {

	
	public int EveNumb(int a, int b) {
		int sum = a + b;
		int mult = a * b;
		if (a % 2 == 0) {
				return mult;	
			} 
		else 
			{
				return sum;
			}
	}
	
	public String Cogito(int x, int y) {
		String result = "";
		for ( ; x > 0; ) {
			if(y > 0) {
				result = "����� ��������� � 1� ����� ���������";	
				break;}
			else if(y < 0) {
				result = "����� ��������� � 4� ����� ���������"; 	
				break;}
			else {
				result = "����� ��������� �� ��� +X";				
				break;}
		}
		
		for ( ; x < 0 ; ) {
			if (y > 0) {
				result = "����� ��������� � 2� ����� ���������";
				break;}
			else if (y < 0)	{
				result = "����� ��������� � 3� ����� ���������";
				break;}
			else {
				result = "����� ��������� �� ��� -X";
				break;}
		}
		
		for ( ; x == 0; ) {
			if (y > 0)	{
				result = "����� ��������� �� ��� +Y";	
				break;}
			else if (y < 0)	{
				result = "����� ��������� �� ��� -Y";
				break;}
			else	{
				result = "����� ��������� � ������ ������� ���������";
				break;}
		}
		return result;
	}
	
	public int SumPositive(int a, int b, int c )	{
		
		 int arr[] = {a, b, c};
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] > 0 )	{
				sum += arr[i];
						}
			else	{ 
				arr[i] = 0;		
			}
		}
		return sum;
	}
	
	public int Maximus(int a, int b, int c) {
		int result;
		int sum = a + b + c;
		int mult = a * b * c;
		if (mult> sum) {
			result = mult + 3;
		}
		else {
			result = sum + 3;
		}
		return result;
		
	}
	
	public char Mark(int a) {
		//char result;
		if (a < 1 || a > 100) {
			return 7;
		} else if (a > 0 && a < 20) {
			return 70;
		} else if (a < 40) {
			return 69;
		} else if (a < 60) {
			return 68;
		} else if (a < 75) {
			return 67;
		} else if (a < 90) {
			return 66;
		} else {
			return 65;
		}
	}
}
