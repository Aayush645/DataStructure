package DSA450.Arrays;
import java.util.*;
public class subArrayWithSum0 {

	public static void main(String[] args) 
	{
		int arr[]= {-2,2,1,3,4,2};
		int n=arr.length;
		Set<Integer> s=new HashSet<>();
		int sum=0;
		
		for(int i=0;i<n;i++)
		{
			s.add(sum);
			sum=sum+arr[i];
			if(s.contains(sum))
			{
				System.out.println("Present");
				return;
			}
		}
		System.out.println("Absent");

	}

}
