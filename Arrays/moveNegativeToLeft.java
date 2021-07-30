package DSA450.Arrays;

public class moveNegativeToLeft {

	public static void main(String[] args) 
	{
		int arr[]= { -12, 11, -13, -5,
                6, -7, 5, -3, 11 };
		int n=arr.length;
		int i=0,j=n-1;
		
		while(i<=j)
		{
			if(arr[i]<0)
				i++;
			else if(arr[i]>=0 && arr[j]<0)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
			else if(arr[i]>=0 && arr[j]>=0)
			{
				j--;
			}
			
		}
		
		for(int l=0;l<n;l++)
		{
			System.out.print(arr[l]+ " ");
		}
		
	}

}
