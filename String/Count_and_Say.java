package DSA450.String;

public class Count_and_Say 
{
	public static String countandSay(int n)
	{
		if(n==1)
		{
			return "1";
		}
		if(n==2)
		{
			return "11";
		}
		
		String str="11";
		
		for(int i=3;i<=n;i++)
		{
			str+="$";
			int cnt=1;
			String temp="";
			
			
			for(int j=1;j<str.length();j++)
			{
				if(str.charAt(j)==str.charAt(j-1))
				{
					cnt++;
				}
				else
				{
					temp+=Integer.toString(cnt);
					temp+=str.charAt(j-1);
					
					cnt=1;
				}
			}
			str=temp;
		}
		return str;
	}

	public static void main(String[] args) 
	{
		int N = 4;
        System.out.println(countandSay(N));
	}

}
