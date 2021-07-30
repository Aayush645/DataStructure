package DSA450.LinkedList;

import DSA450.LinkedList.Intersection_Of_LL.node;

public class Intersection_Point_of_TwoLL 
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

	public static void print(node head)
	{
		node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
	public static void findIntersectionPoint(node head1,node head2,int n,int m)
	{
		int d;
		System.out.println("Intersection Point is: ");
		if(n>m)
		{
			d=n-m;
			find(d,head1,head2);
		}
		else
		{
			d=m-n;
			find(d,head2,head1);
		}
		
	}
	
	public static void find(int d,node head1,node head2)
	{
		node temp1=head1,temp2=head2;
		for(int i=0;i<d;i++)
		{
			temp1=temp1.next;
		}
		
		while(temp1!=null && temp2!=null)
		{
			if(temp1.data==temp2.data)
			{
				System.out.println(temp1.data);
				return;
			}
			temp1=temp1.next;
			temp2=temp2.next;
		}
		System.out.println("No intersection Point");
	}
	
	public static void main(String[] args) 
	{
		node head1=null,head2=null;
	    head1= add(head1,3);
        head1.next = add(head1,6);
        head1.next.next = add(head1,9);
        head1.next.next.next = add(head1,15);
        head1.next.next.next.next = add(head1,30);
 
        // creating second linked list
        head2 = add(head2,10);
        head2.next = add(head2,15);
        head2.next.next = add(head2,30);
        
        int n=0,m=0;
        
        node temp=head1;
        while(temp!=null)
        {
        	n++;
        	temp=temp.next;
        }
        
        temp=head2;
        while(temp!=null)
        {
        	m++;
        	temp=temp.next;
        }
        
       findIntersectionPoint(head1,head2,n,m);
	}

}
