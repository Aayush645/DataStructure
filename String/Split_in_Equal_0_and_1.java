package DSA450.String;

public class Split_in_Equal_0_and_1 
{
	static int maxSubStr(String s,int n)
	{
		int count0=0,count1=0,cnt=0;
		
		if(s.length()%2!=0)
		{
			return -1;
		}
		
		for(int i=0;i<n;i++)
		{
			if(s.charAt(i)=='0')
			{
				count0++;
			}
			else if(s.charAt(i)=='1')
			{
				count1++;
			}
			
			if(count0==count1)
			{
				cnt++;
			}
		}
		
		if(cnt==0)
		{
			return -1;
		}
		
		return cnt;
	}

	public static void main(String[] args) 
	{
		String str = "000111";
	    int n = str.length();
	 
	    System.out.println(maxSubStr(str, n));

	}

}
