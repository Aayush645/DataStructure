package DSA450.String;

public class Isomorphic_Strings 
{
	public static void isIsomorphic(String a,String b,int n,int m)
	{
		int charA[]=new int[26];
		int charB[]=new int[26];
		
		for(int i=0;i<n;i++)
		{
			int temp1=a.charAt(i)-'a';
			int temp2=b.charAt(i)-'a';
			
			charA[temp1]++;
			charB[temp2]++;
			
			if(charA[temp1]!=charB[temp2])
			{
				System.out.println("Not Isomorphic");
				return;
			}
			
		}
		System.out.println("They are Isomorphic");
	}

	public static void main(String[] args) 
	{
		String a="aab";
		String b="xxy";
		
		int n=a.length();
		int m=b.length();
		
		isIsomorphic(a,b,n,m);

	}

}
