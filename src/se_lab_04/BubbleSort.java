package se_lab_04;
import java.util.Scanner;
import java.util.Arrays;
public class BubbleSort {

	public static void bsort(int arr[], int n)
	{
		if(n == 1)  // base condition.
		{
			return;
		}
		for(int i = 0; i < n - 1; i++)
		{
			if(arr[i] > arr[i + 1])
			{
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		
		bsort(arr, n - 1);
	}
	
	public static void printArray(int arr[])
	{
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = input.nextInt();
		
		int arr[] = new int[size]; // creating a dynamic array.
		
		System.out.println("\nEnter the elements of the array :");
		for(int i = 0; i < size; i++)
		{
			arr[i] = input.nextInt();
		}
		//a
		bsort(arr, arr.length);
		printArray(arr);
		//a
	}

}
