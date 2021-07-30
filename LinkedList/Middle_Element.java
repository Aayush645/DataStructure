package DSA450.LinkedList;

import DSA450.LinkedList.Intersection_Point_of_TwoLL.node;

public class Middle_Element
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
			return temp;
		}
		
		node ptr=head;
		while(ptr.next!=null)
		{
			ptr=ptr.next;
		}
		ptr.next=temp;
		return temp;
	}
	
	public static void findMiddle(node head1)
	{
		node slow=head1;
		node fast=head1;
		
		while(fast!=null && fast.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
		}
		
		System.out.println("Middle Element is: "+slow.data);
	}

	public static void main(String[] args) 
	{
		node head1=null;
		head1= add(head1,3);
        head1.next = add(head1,6);
        head1.next.next = add(head1,9);
        head1.next.next.next = add(head1,15);
        head1.next.next.next.next = add(head1,30);
        
        findMiddle(head1);
	}

}
