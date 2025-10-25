public class BinarySearch {

	public static void main(String[] args) {
		
		int[] arr = {-1,0,5,12,34,54,65,75,88,90};
		int target = 88;
		int ans = binarySearch(arr, target);
		
		System.out.println( ans == -1
							? "Target not found!!!" 
							: "Target found at index = " + ans + ".");

	}
	
	public static int binarySearch(int[] arr, int target)
	{
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end)
		{
			int mid = start + (end - start) / 2;

			if (target == arr[mid]) 
			{
				return mid;
			} 
			else if(target < arr[mid])
			{
				end = mid - 1;
			}
			else
			{
				start = mid + 1;
			}
		}
		
		return -1;
	}

}
