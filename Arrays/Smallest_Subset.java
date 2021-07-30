package DSA450.Arrays;

public class Smallest_Subset 
{
	
	public static int smallestSubWithSum(int a[],int n,int sum)
	{
		int s=0,e=0;
		int count=n+1;
		int sumNow=0;
		
		while(e<n)
		{
			while(sumNow<=sum && e<n)
			{
				sumNow+=a[e];
				e++;
			}
			while(sumNow>sum && s<n)
			{
				count=Math.min(count, e-s);
				sumNow-=a[s];
				s++;
			}
		}
		return count;
		
	}

	public static void main(String[] args) 
	{
		int arr1[] = { 1, 4, 45, 6, 10, 19 };
        int x = 51;
        int n1 = arr1.length;
        int res1 = smallestSubWithSum(arr1, n1, x);
        if (res1 == n1 + 1)
            System.out.println("Not Possible");
        else
            System.out.println(res1);
        
        
        
        int arr2[] = { 1, 10, 5, 2, 7 };
        int n2 = arr2.length;
        x = 9;
        int res2 = smallestSubWithSum(arr2, n2, x);
        if (res2 == n2 + 1)
            System.out.println("Not Possible");
        else
            System.out.println(res2);
 
        
        
        int arr3[]= { 1, 11, 100, 1, 0, 200, 3, 2, 1, 250 };
        int n3 = arr3.length;
        x = 280;
        int res3 = smallestSubWithSum(arr3, n3, x);
        if (res3 == n3 + 1)
            System.out.println("Not Possible");
        else
            System.out.println(res3);

	}

}
