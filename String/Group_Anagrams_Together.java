package DSA450.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Group_Anagrams_Together 
{
	public static void printAnagramsTogether(String arr[],int n)
	{
		HashMap<String, List<String> > mp=new HashMap<>();
		
		for(int i=0;i<n;i++)
		{
			String word=arr[i];
			char temp[]=word.toCharArray();
			Arrays.sort(temp);
			String fword=new String(temp);
			
			if(!mp.containsKey(fword))
			{
				mp.put(fword,new ArrayList<>());
			}
			mp.get(fword).add(word);
		}
		
		for(String s:mp.keySet())
		{
			List<String> l=mp.get(s);
			if(l.size()>1)
			{
				System.out.println(l);
			}
		}
	}

	public static void main(String[] args)
	{
		 String wordArr[] = { "cat", "dog", "tac", "god", "act" };
	     int size = wordArr.length;
	     printAnagramsTogether(wordArr, size);
	}

}
