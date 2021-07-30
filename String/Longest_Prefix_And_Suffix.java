package DSA450.String;

public class Longest_Prefix_And_Suffix 
{
	public static void find(String s,int n)
	{
//		int l,r,ans=0;
//		String ansString="";
//		
//		if(n<2)
//		{
//			System.out.println("Not Possible");
//			return;
//		}
//		
//		if(n%2==0)
//		{
//			int mid=n/2;
//			l=0;
//			r=mid;
//			while(l<mid && r<n)
//			{
//				if(s.charAt(l)==s.charAt(r))
//				{
//					ans++;
//					ansString+=s.charAt(l);
//					l++;
//					r++;
//				}
//				else
//				{
//					r++;
//				}
//			}
//		}
//		else
//		{
//			int mid=n/2;
//			l=0;
//			r=mid+1;
//			
//			while(l<mid && r<n)
//			{
//				if(s.charAt(l)==s.charAt(r))
//				{
//					ans++;
//					ansString+=s.charAt(l);
//					l++;
//					r++;
//				}
//				else
//				{
//					r++;
//				}
//			}
//		}
//		
//		System.out.println("Common Suffix and Prefix Length is: "+ans);
//		System.out.println("Common Suffix and Prefix is: "+ansString);
		
		
		// Using KMP Algorithm[Wrong solution on gfg for "blablabla"]
		
		
		int lps[]=new int[n];
		int len=0,i=1;
		lps[0]=0;
		
		while(i<n)
		{
			if(s.charAt(i)==s.charAt(len))
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
					lps[i]=0;
					i++;
				}
			}
		}
		
		int res=lps[n-1];
		
		System.out.println((res>n/2)?(n/2):res);
		
	}

	public static void main(String[] args)
	{
		String s="aba";
		int n=s.length();
		
		find(s,n);
	}

}
