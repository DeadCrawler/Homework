package Arrays;

import java.util.Scanner;

public class Arr {
	
	public static void main(String[] args) {
		System.out.println(minArr(31-142523));
	}

	public static int minArr(int num) {
		
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
			}
		
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i]; }
		}

		return min;
	}
}
