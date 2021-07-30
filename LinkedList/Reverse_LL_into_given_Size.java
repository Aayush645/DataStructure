package DSA450.LinkedList;
import java.util.*;
public class Reverse_LL_into_given_Size 
{
	
	static class node
	{
		int data;
		node next;
		
		node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	
	
	public static node add(node head,int data)
	{
		node temp=new node(data);
		if(head==null)
		{
			head=temp;
			return head;
		}
		node ptr=head;
		while(ptr.next!=null)
		{
			ptr=ptr.next;
		}
		ptr.next=temp;
		return head;
	}
	
	public static node reverse(node head,int k)
	{
		node current=head;
		Stack<node> st=new Stack<>();
		node prev=null;
		while(current!=null)
		{
			int count=0;
			while(current!=null && count<k)
			{
				st.push(current);
				current=current.next;
				count++;
			}
			
			while(!st.empty())
			{
				if(prev==null)
				{
					prev=st.peek();
					head=prev;
					st.pop();
				}
				else
				{
					prev.next=st.peek();
					prev=prev.next;
					
					st.pop();
				}
			}
		}
		prev.next=null;
		return head;
	}
	
	public static void print(node head)
	{
		node temp=head;
		
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}

	public static void main(String[] args)
	{
		node head=null;
		head=add(head,1);
		head=add(head,2);
		head=add(head,3);
		head=add(head,4);
		head=add(head,5);
		head=add(head,6);
		
		int k=2;
		
		head=reverse(head,k);
		print(head);

	}

}
