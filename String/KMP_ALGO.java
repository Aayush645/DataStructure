package DSA450.String;

public class KMP_ALGO 
{
	
	public static void findAllIndex(String s,String p)
	{
		//_-----MY APPROACH USING SUBSTRING_----------------------------------
		
//		int n=s.length();
//		int m=p.length();
//		
//		for(int i=0;i<=n-m;i++)
//		{
//			String temp=s.substring(i,i+m);
//			if(temp.equals(p))
//			{
//				System.out.print(i+" ");
//			}
//		}
// ----------------------------------------------------------------------------------------		
		// Using KMP ALGo
		
		int i=0,j=0;
		int lps[]=new int[p.length()];
		
		formLps(lps,p);
		while(i<s.length())
		{
			if(s.charAt(i)==p.charAt(j))
			{
				i++;
				j++;
			}
			
			if(j==p.length())
			{
				System.out.println("Index found at: "+(i-j));
				j=lps[j-1];
			}
			else if(i<s.length() && s.charAt(i)!=p.charAt(j))
			{
				if(j!=0)
				{
					j=lps[j-1];
				}
				else
				{
					i++;
				}
			}
		}
		
		
		
	}
	
	public static void formLps(int lps[],String p)
	{
		lps[0]=0;
		int len=0;
		int i=1;
		while(i<p.length())
		{
			if(p.charAt(i)==p.charAt(len))
			{
				len++;
				lps[i]=len;
				i++;
			}
			else
			{
				if(len!=0)
				{
					len=lps[len-1];
				}
				else
				{
					lps[i]=len;
					i++;
				}
			}
		}
	}

	public static void main(String[] args)
	{
		String s="AABAACAADAABAABA";
		String p="AABA";
		findAllIndex(s,p);
	

	}

}

