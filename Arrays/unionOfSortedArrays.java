package DSA450.Arrays;
import java.util.*;
public class unionOfSortedArrays {

	public static void main(String[] args) 
	{
		int a1[]= {1, 1, 4, 5, 7};
		int a2[]= {2, 3, 5, 6};
		
		int n=a1.length,i=0,j=0,k=0;
		int m=a2.length;
		
		ArrayList<Integer> al=new ArrayList<>();
		while(i<n && j<m)
		{
			if(a1[i]==a2[j])
			{
				if(!al.contains(a1[i]))
				{
					al.add(a1[i]);
				}
				k++;
				i++;
				j++;
			}
			else if(a1[i]<a2[j])
			{
				if(!al.contains(a1[i]))
				{
					al.add(a1[i]);
					
				}
				k++;
				i++;
			}
			else
			{
				if(!al.contains(a2[j]))
				{
					al.add(a2[j]);
					
				}
				k++;
				j++;
			}
		}
		
		while(i<n)
		{
			if(!al.contains(a1[i]))
			{
				al.add(a1[i]);
				
			}
			k++;
			i++;
		}
		while(j<m)
		{
			if(!al.contains(a2[j]))
			{
				al.add(a2[j]);
				
			}
			k++;
			j++;
		}
		System.out.println("Union of Two arrays:");
		System.out.println(al);

	}

}
