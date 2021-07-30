package DSA450.Arrays;

public class stockBuySell_InfinityTimes {

	public static void main(String[] args) 
	{
		int arr[]= {10,22,5,75,65,80};
		int n=arr.length;
		int profit=0;
		for(int i=1;i<n;i++)
		{
			if(arr[i]>arr[i-1])
			{
				profit=profit+(arr[i]-arr[i-1]);
			}
		}
		
		System.out.println("Maximim profit after bying and selling for infinity times: "+profit);
	}

}
