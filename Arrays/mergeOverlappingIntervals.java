package DSA450.Arrays;
import java.util.*;

class interval
{
	public int start;
	public int end;
	
	interval(int start,int end)
	{
		this.start=start;
		this.end=end;
	}
	
}

public class mergeOverlappingIntervals 
{
	
	public static void mergeIntervals(interval arr[])
	{
		Stack<interval> st=new Stack<>();
		
		if(arr.length==0)
			return;
		
		Arrays.sort(arr,new Comparator<interval>(){
            public int compare(interval i1,interval i2)
            {
                return i1.start-i2.start;
            }
        });
		
		st.push(arr[0]);
		
		for(int i=1;i<arr.length;i++)
		{
			interval top=st.peek();
			
			if(top.end<arr[i].start)
			{
				st.push(arr[i]);
			}
			
			else if(top.end<arr[i].end)
			{
				top.end=arr[i].end;
				st.pop();
				st.push(top);
			}
		}
		
		while(!st.isEmpty())
		{
			System.out.println("["+st.peek().start+","+st.peek().end+"]");
			st.pop();
		}
		
		
	}
	
	public static void main(String args[])
	{
		interval arr[]= new interval[4];
		
		arr[0]=new interval(6,8);
		arr[1]=new interval(1,9);
        arr[2]=new interval(8,13);
        arr[3]=new interval(14,17);
        mergeIntervals(arr);
        
	}

}
