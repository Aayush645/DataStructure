package DSA450.Arrays;

public class stockBuySell1Time {

	public static void main(String[] args) 
	{
		int arr[]= {5,2,6,1,4};
		int n=arr.length;
		
		int min_so_far=Integer.MAX_VALUE;
		int max_profit=0;
		
		for(int i=0;i<n;i++)
		{
			min_so_far=(min_so_far>arr[i])?arr[i]:min_so_far;
			max_profit=Math.max(max_profit,arr[i]-min_so_far);
		}
		
		System.out.println("Maximum Profit will be: "+max_profit);

	}

}
