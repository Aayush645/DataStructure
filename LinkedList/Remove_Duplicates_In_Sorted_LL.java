package DSA450.LinkedList;

public class Remove_Duplicates_In_Sorted_LL 
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
	
	static node head=null;
	
	public static void add(int data)
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

	public static void print()
	{
		node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
	
	public static void remove()
	{
		node current=head;
		node ptr=current.next;
		
		while(ptr!=null)  // Because Ptr is always ahead of current so it reaches null first
		{
			if(current.data!=ptr.data)
			{
				current=current.next;
				ptr=ptr.next;
			}
			else    // if they are same then only ptr will move, current will be at same pos
			{
				ptr=ptr.next;
				current.next=ptr;
			}
		}
	}
	
	public static void main(String[] args) 
	{
		add(11);
		add(11);
		add(11);
		add(13);
		add(13);
		add(20);
		System.out.println("Before removing Duplicates: ");
		print();
		
		remove();
		
		System.out.println("\nAfter removing Duplicates: ");
		print();

	}

}
