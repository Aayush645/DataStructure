package DSA450.LinkedList;

public class Palindrome 
{
	static class node
	{
		char data;
		node next;
		node(char data)
		{
			this.data=data;
			next=null;
		}
	}
	static node head=null,second_half=null;
	public static void add(char data)
	{
		node temp=new node(data);
		
		if(head==null)
		{
			head=temp;
			return;
		}
		node ptr=head;
		while(ptr.next!=null)
		{
			ptr=ptr.next;
		}
		ptr.next=temp;
	}
	
	public static void isPalindrome()
	{
		node slow=head;
		node fast=head;
		node midpoint = null,prev_of_slow=null;
		
		while(fast!=null && fast.next!=null)
		{
			fast=fast.next.next;
			prev_of_slow=slow;
			slow=slow.next;
		}
		
		if(fast!=null)  //Means odd numbers of elements in LL
		{
			midpoint=slow;
			slow=slow.next;
		}
		prev_of_slow.next=null;
		second_half=slow;
		
		reverse();
		
		if(compare())
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
		reverse();
		
		if(midpoint!=null)
		{
			prev_of_slow.next=midpoint;
			midpoint.next=second_half;
		}
		else
		{
			prev_of_slow=second_half;
		}
	}

	public static void reverse()
	{
		node current=second_half,prev=null;
		node current_next;
		while(current!=null)
		{
			current_next=current.next;
			current.next=prev;
			prev=current;
			current=current_next;
		}
		second_half=prev;
	}
	
	public static boolean compare()
	{
		node temp1=head;
		node temp2=second_half;
		
		while(temp1!=null && temp2!=null)
		{
			if(temp1.data!=temp2.data)
			{
				return false;
			}
			temp1=temp1.next;
			temp2=temp2.next;
		}
		return true;
	}
	
	public static void main(String[] args) 
	{
		add('a');
		add('b');
		add('c');
		add('c');
		add('b');
		add('a');
		
		isPalindrome();

	}

}
