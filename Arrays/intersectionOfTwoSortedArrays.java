package DSA450.Arrays;

import java.util.ArrayList;

public class intersectionOfTwoSortedArrays 
{

	public static void main(String[] args) 
	{
				int a1[]= {1, 2, 3, 5, 7};
				int a2[]= {2, 2, 5, 6};
				
				int n=a1.length,i=0,j=0;
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
						i++;
						j++;
					}
					else if(a1[i]<a2[j])
					{
						i++;
					}
					else
					{
						j++;
					}
				}
				
			
				System.out.println("Intersection of Two arrays:");
				System.out.println(al);

			}

}

