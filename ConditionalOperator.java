package xD;

public class ConditionalOperator {

	public static void main(String[] args) {
		
		System.out.println(EveNumb(5,6));
		System.out.println(Cogito(-3, 4));
		System.out.println(Cogito(3, 0));
		System.out.println(Cogito(0, 0));
		System.out.println(SumPositive(3, -12, 0));
		System.out.println(Maximus(5, -3, 4));
		System.out.println("TI LOX");

	}
	
	public static int EveNumb(int a, int b) {
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
	
	public static String Cogito(int x, int y) {
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
	
	public static int SumPositive(int a, int b, int c )	{
		
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
	
	public static int Maximus(int a, int b, int c) {
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
	
}
