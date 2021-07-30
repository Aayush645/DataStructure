package DSA450.String;

public class Rotation {

	public static void main(String[] args) 
	{
		String a="AACD";
		String b="ACDA";
		
		a=a+a;
		
		if(a.contains(b))
		{
			System.out.println("Yes It is Rotation");
		}
		else
		{
			System.out.println("No is it not BLNT");
		}

	}

}
