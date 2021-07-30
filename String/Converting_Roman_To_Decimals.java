package DSA450.String;

public class Converting_Roman_To_Decimals 
{
	public static void convert(String s,int n)
	{
		int ans=0;
		for(int i=0;i<n;i++)
		{
			if(s.charAt(i)=='X')
			{
				ans=ans+10;
			}
			else if(s.charAt(i)=='I')
			{
				ans=ans+1;
			}
			else if(s.charAt(i)=='V')
			{
				ans=ans+5;
			}
			else if(s.charAt(i)=='L')
			{
				ans=ans+50;
			}
			else if(s.charAt(i)=='C')
			{
				ans=ans+100;
			}
			else if(s.charAt(i)=='D')
			{
				ans=ans+500;
			}
			else if(s.charAt(i)=='M')
			{
				ans=ans+1000;
			}
		}
		
		System.out.println(ans);
	}

	public static void main(String[] args) 
	{
		String s="III";
		int n=s.length();
		
		convert(s,n);

	}

}
