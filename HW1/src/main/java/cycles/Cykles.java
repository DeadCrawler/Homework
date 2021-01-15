package cycles;

public class Cykles {

	public int Countless() {
		int sum = 0;
		for (int nums = 1; nums < 100; nums++) {
			if(nums % 2 == 0)	{
				sum += nums;	}
		}		return sum;		}
	
	public boolean Eassy(int a) {
		for(int num = 2; num < a; num ++) {
			if (a % num == 0) 	{
				return true;	}
		}	return false;		}
	
	public int Sqrt(int a) {
		int res = 0;
		int i;
		for (i = 1; i < a; i ++) {
			if(res < a) 		{
			res = i * i; 	}
			else if (res > a) {
				i--;
				break;
			}
		}return i - 1;
	}
	
	public int Factorial(int a) {
		int fact = 1;
		
		for (int i = 1; i < a + 1; i++) {
			fact *= i;
		}
		return fact;
	}
	
	public int SumOfNums(int a) {
		int arr[] = new int[20];
		int sum = 0;
		
		for (int index = 0; index < 20; index++) {
			if (a != 0) {
				int arrNum = a % 10;
				a = a / 10;
				arr[index] = arrNum;	}
			sum += arr[index];		
			}
		return sum;	
		}
	
	public String Sort(int num) {
		String sort = "";
		int chnum = num;
		int count;
		int check = 1;
		for(count = 0; check != 0; count++) {
			check = chnum / 10;	
			chnum = chnum / 10;
		} 
		
		int arr[] = new int[count];
		
		for (int index = 0; index < count; index++) {
			if (num != 0) {
				int arrNum = num % 10;
				num = num / 10;
				arr[index] = arrNum;	}	
			System.out.println(arr[index]);
			}
		for (int i = 0; i < arr.length; i++) {
			sort += String.valueOf(arr[i]);
		}
		return sort;
	}
}
