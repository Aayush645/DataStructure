package DSA450.Arrays;

public class reverseArray 
{

	public static void main(String[] args) 
	{
		int arr[]=new int[5];
		for(int i=0;i<5;i++)
		{
			arr[i]=i+1;
		}
		System.out.println("Arrays Contains:");
		for(int a:arr)
		{
			System.out.print(a);
		}
		
		System.out.println("\nReverse of an Array: ");
		for(int i=4;i>=0;i--)
		{
			System.out.print(arr[i]);
		}

	}

}
