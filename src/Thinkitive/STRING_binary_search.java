package Thinkitive;

public class STRING_binary_search 
{
	static int binarySearch(int arr[], int l, int h, int num) 
	{
		if (h >= l) {
			int mid = (l + h) / 2;

			if (arr[mid] == num) 
			{
				return mid;
			}

			else if (arr[mid] < num)
			{
				return binarySearch(arr, mid + 1, h, num);
			}

			else
			{
			return binarySearch(arr, l, mid - 1, num);
			}
		}		
		return -1;
	}

	public static void main(String args[])
	{
		int arr[] = { 2, 3, 4, 10, 40 };
		int size = arr.length;
		int num = 10;
		int lindex=0;
		int hindex=size-1;
		int result = binarySearch(arr, lindex, hindex, num);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
	}
}