package DSA450.Arrays;

public class Three_Way_Partitioning {

	public static void doPartition(int arr[],int n,int a,int b)
	{
		int s=0;
		int e=n-1;
		int temp;
		
		for(int i=0;i<e;)
		{
			if(arr[i]<a)
			{
				temp=arr[s];
				arr[s]=arr[i];
				arr[i]=temp;
				
				i++;
				s++;
			}
			else if(arr[i]>b)
			{
				temp=arr[e];
				arr[e]=arr[i];
				arr[i]=temp;
				e--;
			}
			else
			{
				i++;
			}
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) 
	{
		int arr[]={1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};
		int n=arr.length;
		int a=10,b=20;
		
		doPartition(arr,n,a,b);

	}

}
