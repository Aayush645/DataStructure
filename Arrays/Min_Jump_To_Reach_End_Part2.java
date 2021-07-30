package DSA450.Arrays;

public class Min_Jump_To_Reach_End_Part2 
{
	
	public static int minJumps(int arr[])
	{
		if(arr[0]==0)
		{
			return -1;
		}
		
		if(arr.length==0 || arr.length==1)
		{
			return -1;
		}
		
		int maxReach=arr[0];
		int steps=arr[0];
		int jump=1;
		
		for(int i=1;i<arr.length;i++)
		{
			if(i==arr.length-1)
			{
				return jump;
			}
			
			maxReach=Math.max(maxReach, i+arr[i]);
			steps--;
			
			if(steps==0)
			{
				jump++;
				
				steps=maxReach-i;
			}
		}
		return -1;
	}

	public static void main(String[] args)
	{
		 int arr[] = new int[] { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
		 System.out.println("Min Jumps are: "+minJumps(arr));
	}

}
