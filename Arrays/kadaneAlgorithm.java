package DSA450.Arrays;

public class kadaneAlgorithm {

	public static void solve(int a[],int n)
	{
		int max_so_far=0,max=0;
		for(int i=0;i<n;i++)
		{
			max_so_far=max_so_far+a[i];
			
			if(max_so_far>max)
			{
				max=max_so_far;
			}
			
			else if(max_so_far<0) {
				max_so_far=0;
			}
		}
		
		System.out.println("Maximun sum is: "+max);
		
	}
	
	public static void main(String[] args) 
	{
		int arr[]= {-2, -3, 4, -1, -2, 1, 5, -3};
		int n=arr.length;
		solve(arr,n);

	}

}
