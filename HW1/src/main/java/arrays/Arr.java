package arrays;

import java.util.Arrays;


public class Arr {

	public int minimalArrayChar(int[] arr) {
		int i = 0;
		int min = arr[i];
		for (; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			} else continue;
		}
		return min;
	}

	public int maximalArrayChar(int[] arr) {
		int i = 0;
		int max = arr[i];
		for (; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			} else continue;
		}
		return max;
	}

	public int idMinimalArrayChar(int[] arr) {
		int minChar = 0;
		int i = 0;
		int min = arr[i];
		for (; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
				minChar = i;
			} else continue;
		}
		return minChar;
	}

	public int idMaximalArrayChar(int[] arr) {
		int maxChar = 0;
		int i = 0;
		int max = arr[i];
		for (; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				maxChar = i;
			} else continue;
		}
		return maxChar;
	}

	public int countOfOdd(int[] arr) {
		int sum = 0;
		for (int i = 1; i < arr.length; i += 2) {
			sum += arr[i];
		}
		return sum;
	}

	public String yarrA(int[] arr) {
		int count = 1;
		int xD = 0;
		for (int i = 0; i < arr.length / 2; i++) {
			xD = arr[i];
			arr[i] = arr[arr.length - count];
			arr[arr.length - count] = xD;
			count++;
		}
		String str = Arrays.toString(arr);
		return str;
	}

	public int countOfNumOfOdd(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				count++;
			} else continue;
		}
		return count;
	}

	public String ayrAr(int[] arr) {
		int count = arr.length / 2;
		int xD ;
		for (int i = 0; i < arr.length / 2; i++) {
			xD = arr[i];
			arr[i] = arr[(arr.length - 1) - count];
			arr[(arr.length - 1) - Math.abs(count)] = xD;
			count--;
		}
		String str = Arrays.toString(arr);
		return str;
	}

	public String arrBubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int box = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = box;
				}
			}
		}
		String str = Arrays.toString(arr);
		return str;
	}

	public String arrSelectionSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			/////1st part
			int min = (int) (Math.pow(2, 15) - 1);
			for (int j = i; j < arr.length; j++) {
				if (min > arr[j]) {
					min = arr[j];
					arr[j] = arr[i];
					arr[i] = min;
				}
			}
		}
		String str = Arrays.toString(arr);
		return str;
	}
}
