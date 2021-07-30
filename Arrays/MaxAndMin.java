package DSA450.Arrays;

public class MaxAndMin {

	public static void main(String[] args) 
	{
		int arr[];
		arr=new int[5];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=i+1;
		}
		int max,min;
		max=min=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			max=(max<arr[i])?arr[i]:max;
			min=(min>arr[i])?arr[i]:min;
		}
		
		System.out.println("Max is: "+max);
		System.out.println("Min is: "+min);
	}

}
