package se_lab_04;
import java.util.Scanner;
import java.util.Arrays;
public class NewSort {
	// Insertion sort recursive.
	
	public static void insertionSort(int arr[], int n)
	{
		if(n == 1)  // base condition.
		{
			return;
		}
		
		insertionSort(arr, n - 1);
		int last = arr[n - 1];
		int j = n - 2;
		
		while(j >= 0 && arr[j] > last)
		{
			arr[j + 1] = arr[j];
			j--;
		}
		arr[j + 1] = last;
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
		
		insertionSort(arr, arr.length);
		printArray(arr);
		//aaa
	}

}
