package DSA450.String;

public class Customers_that_dont_getComputers 
{
	public static void find(String s,int comp)
	{
		int n=s.length();
		int seen[]=new int[26];
		int ans=0;
		int occupied=0;
		
		for(int i=0;i<n;i++)
		{
			int temp=s.charAt(i)-'A';
			if(seen[temp]==0)
			{
				seen[temp]=1;
				
				if(occupied<comp)
				{
					occupied++;
					seen[temp]=2;
				}
				else
				{
					ans++;
				}
			}
			else
			{
				if(seen[temp]==2)
				{
					occupied--;
					seen[temp]=0;
				}
			}
		}
		System.out.println("Person with no computer is: "+ans);
	}

	public static void main(String[] args) 
	{
		String s="GACCBDDBAGEE";
		int comp=3;
		
		find(s,comp);

	}

}
