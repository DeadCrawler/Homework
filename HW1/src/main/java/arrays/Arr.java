package arrays;

import java.util.Arrays;


public class Arr {
	
	public static void main(String[] args) {
		int arr[] = {9,8,7,6,5,4,3,2,1};
		System.out.println(arrSelectionSort(arr));

	}

	public static int minimalArrayChar(int[] arr){
		int i = 0;
		int min = arr[i];
		for (; i < arr.length; i++){
			if (min > arr[i]){
				min = arr[i];
			}else continue;
		}
		return min;
	}

	public static int maximalArrayChar(int[] arr){
		int i = 0;
		int max = arr[i];
		for (; i < arr.length; i++){
			if (max < arr[i]){
				max = arr[i];
			}else continue;
		}
		return max;
	}

	public static int idMinimalArrayChar(int[] arr){
		int count = 0;
		int i = 0;
		int min = arr[i];
		for (; i < arr.length; i++){
			if (min > arr[i]){
				min = arr[i];
				count++;
			}else continue;
		}
		return count;
	}

	public static int idMaximalArrayChar(int[] arr){
		int count = 0;
		int i = 0;
		int max = arr[i];
		for (; i < arr.length; i++){
			if (max < arr[i]){
				max = arr[i];
				count++;
			}else continue;
		}
		return count;
	}

	public static int countOfOdd(int[] arr){
		int count = 0;
		for (int i = 0; i < arr.length; i++){
			if (arr[i]%2==0){
				count += arr[i];
			}else continue;
		}
		return count;
	}

	public static String yarrA(int[] arr){
		int count = 1;
		int xD = 0;
		for (int i = 0; i < arr.length / 2; i++){
			xD = arr[i];
			arr[i] = arr[arr.length - count];
			arr[arr.length - count] = xD;
			count++;
		}
		String str = Arrays.toString(arr);
		return str;
	}

	public static int countOfNumOfOdd(int[] arr){
		int count = 0;
		for (int i = 0; i < arr.length; i++){
			if (arr[i]%2==0){
				count ++;
			}else continue;
		}
		return count;
	}

	public static String ayrAr(int[] arr){
		int count = (arr.length-1) / 2;
		int xD = 0;
		for (int i = 0; i < arr.length / 2; i++){
			xD = arr[i];
			arr[i] = arr[(arr.length - 1) - count];
			arr[(arr.length - 1) - Math.abs(count)] = xD;
			count--;
		}
		String str = Arrays.toString(arr);
		return str;
	}

	public static String arrBubbleSort(int[] arr){
		for (int i = 0; i < arr.length; i++){
			for( int j = 0; j < arr.length - 1; j++){
				if(arr[j] > arr[j+1]){
					int box  = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = box;
				}
			}
		}
		String str = Arrays.toString(arr);
		return str;
	}

	public static String arrSelectionSort(int[] arr){

		for(int i = 0; i<arr.length; i++){
			/////1st part
			int min = (int) (Math.pow(2, 15) - 1);
			for (int j = i; j < arr.length; j++){
				if(min > arr[j]){
					min = arr[j];
					arr[j] = arr[i];
					arr[i] = min;
				}
			}
		}
		String str = Arrays.toString(arr);
		return str;
	}

	public static String arrInsertSort(int[] arr){

		return null;
	}
}
