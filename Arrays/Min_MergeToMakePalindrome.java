package DSA450.Arrays;

public class Min_MergeToMakePalindrome 
{
	public static void main(String args[])
	{
		int arr[]= {11, 14, 15, 99};
		int n=arr.length;
		int ans=0;
		int i=0,j=n-1;
		
		while(i<j)
		{
			if(arr[i]==arr[j])
			{
				i++;
				j--;
			}
			else if(arr[i]<arr[j])
			{
				i++;
				arr[i]=arr[i]+arr[i-1];
				ans++;
			}
			else
			{
				j--;
				arr[j]=arr[j]+arr[j+1];
				ans++;
			}
		}
		
		System.out.println("Merge Required: "+ans);
	}

}
