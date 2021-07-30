package DSA450.LinkedList;

import DSA450.LinkedList.Check_LL_is_CLL.node;

public class Sort_0_1_2_inLL 
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
	
	public static void isCircular(node head)
	{
		node temp=head;
		temp=head.next;
		
		while(temp!=null && temp!=head)
		{
			temp=temp.next;
		}
		
		if(temp==head)
		{
			System.out.println("It is Circular");
		}
		else
		{
			System.out.println("Not Circular");
		}
	}

	public static void sort(node head)
	{
		int count0=0,count1=0,count2=0;
		
		node temp=head;
		
		while(temp!=null)
		{
			if(temp.data==0)
			{
				count0++;
			}
			else if(temp.data==1)
			{
				count1++;
			}
			else
			{
				count2++;
			}
			temp=temp.next;
		}
		
		temp=head;
		
		while(temp!=null)
		{
			while(count0!=0)
			{
				temp.data=0;
				count0--;
				temp=temp.next;
			}
			while(count1!=0)
			{
				temp.data=1;
				count1--;
				temp=temp.next;
			}
			while(count2!=0)
			{
				temp.data=2;
				count2--;
				temp=temp.next;
			}
		}
		
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
		node head1=null;
		head1= add(head1,0);
        head1.next = add(head1,1);
        head1.next.next = add(head1,0);
        head1.next.next.next = add(head1,2);
        head1.next.next.next.next = add(head1,1);
        head1.next.next.next.next.next= add(head1,1);
        head1.next.next.next.next.next.next= add(head1,2);
        head1.next.next.next.next.next.next.next= add(head1,1);
        head1.next.next.next.next.next.next.next.next= add(head1,2);
        
        sort(head1);
        
        print(head1);

	}

}
