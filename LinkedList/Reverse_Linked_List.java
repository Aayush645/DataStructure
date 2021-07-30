package DSA450.LinkedList;

public class Reverse_Linked_List 
{
	
	static class node
	{
		int data;
		node next;
	
	}
	
	node head=null;
	
	public void insert(int data)
	{
		node temp=new node();
		temp.data=data;
		temp.next=null;
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
	
	public void print()
	{
		node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
	
	public void reverse()
	{
		node prev=null,next=null;
		node current=head;
		while(current!=null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
	}
	

	public static void main(String[] args) 
	{
		Reverse_Linked_List obj=new Reverse_Linked_List();
		for(int i=0;i<5;i++)
		{
			obj.insert(i);
		}
		System.out.println("Before Reversing:");
		obj.print();
		
		obj.reverse();
		
		System.out.println("\nAfter Reversing");
		obj.print();
		
	}

}
