package DSA450.String;
import java.util.*;
public class Smallest_Window_Contains_ALL_Characters 
{
	
	public static int findSubString(String s)
	{
		int n=s.length();
		if(n==1 || n==0)
		{
			return n;
		}
		
		Map<Character,Integer> mp=new HashMap<>();
		
		for(int i=0;i<n;i++)
		{
			if(!mp.containsKey(s.charAt(i)))
			{
				mp.put(s.charAt(i),0);
			}
		}
		int distinct=mp.size();
		int ans=Integer.MAX_VALUE;
		mp.put(s.charAt(0),1);
		int count=1;
		int i=0,j=1;
		
		while(i<=j && j<n)
		{
			if(count==distinct)
			{
				ans=Math.min(ans,j-i);
				//System.out.print(s.charAt(i)+" ");
				if(mp.get(s.charAt(i))==1)
				{
					count--;	
				}
				mp.put(s.charAt(i), mp.get(s.charAt(i))-1);
				i++;
			}
			else if(count<distinct)
			{
				//System.out.println("ddff");
				if(mp.get(s.charAt(j))==0)
				{
					count++;
				}
				mp.put(s.charAt(j), mp.get(s.charAt(j))+1);
				j++;
			}
		}
		while(count==distinct)
		{
			ans=Math.min(ans,j-i);
			
			if(mp.get(s.charAt(i))==1)
			{
				count--;
			}
			mp.put(s.charAt(i), mp.get(s.charAt(i))-1);
			i++;
		}
		
		return ans;
	}

	public static void main(String[] args) 
	{
		String str = "aabcbcdbca";
        System.out.println("Smallest window containing all distinct"
                           + " characters is: " + findSubString(str));

	}

}
