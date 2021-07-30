package DSA450.String;

import java.util.HashMap;
import java.util.Map;

public class SmallestWindowInAString_ThatContains_OtherString 
{

	public static int findSubString(String s1,String s2)
	{
		int n=s1.length();
		
		Map<Character,Integer> mp=new HashMap<>();
		
		for(int i=0;i<n;i++)
		{
			if(!mp.containsKey(s2.charAt(i)))
			{
				mp.put(s2.charAt(i),0);
			}
		}
		int distinct=mp.size();
		int ans=Integer.MAX_VALUE;
		mp.put(s1.charAt(0),1);
		int count=1;
		int i=0,j=1;
		
		while(i<=j && j<n)
		{
			if(count==distinct)
			{
				ans=Math.min(ans,j-i);
				//System.out.print(s.charAt(i)+" ");
				if(mp.get(s1.charAt(i))==1)
				{
					count--;	
				}
				mp.put(s1.charAt(i), mp.get(s1.charAt(i))-1);
				i++;
			}
			else if(count<distinct)
			{
				//System.out.println("ddff");
				if(mp.get(s1.charAt(j))==0)
				{
					count++;
				}
				mp.put(s1.charAt(j), mp.get(s1.charAt(j))+1);
				j++;
			}
		}
		while(count==distinct)
		{
			ans=Math.min(ans,j-i);
			
			if(mp.get(s1.charAt(i))==1)
			{
				count--;
			}
			mp.put(s1.charAt(i), mp.get(s1.charAt(i))-1);
			i++;
		}
		
		return ans;
	}

	public static void main(String[] args) 
	{
		String str1 = "timetopractice";
		String str2="toc";
        System.out.println("Smallest window containing all distinct"
                           + " characters is: " + findSubString(str1,str2));

	}


}
