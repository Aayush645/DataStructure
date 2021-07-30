package DSA450.LinkedList;

import DSA450.LinkedList.Pairs_With_Given_Sum_InDLL.node;

public class Triplet_With_GivenSum_In_DLL 
{
	static class node
	{
		int data;
		node next;
		node prev;
		
		node(int data)
		{
			this.data=data;
			next=null;
			prev=null;
		}
	}
	static node head=null,tail=null;
	public static void addNode(int data)
	{
		node temp=new node(data);
		if(head==null)
		{
			head=temp;
			tail=temp;
			return;
		}
		node ptr=head;
		while(ptr.next!=null)
		{
			ptr=ptr.next;
		}
		ptr.next=temp;
		temp.prev=ptr;
		tail=temp;
	}
	
	public static void findTriplet(int sum)
	{
		node temp;
		int count=0;
		for(temp=head;temp!=null;temp=temp.next)
		{
			node l=temp.next;
			node r=tail;
			
			while(l!=r && r.next!=l)
			{
				if((temp.data+l.data+r.data)==sum)
				{
					System.out.println("["+temp.data+" , "+l.data+" , "+r.data+"]");
					count++;
					l=l.next;
					r=r.prev;
				}
				else if((temp.data+l.data+r.data)<sum)
				{
					l=l.next;
				}
				else
				{
					r=r.prev;
				}
			}
		}
		System.out.println("Number of Triplets: "+count);
	}

	public static void main(String[] args) 
	{
		addNode(1);
		addNode(2);
		addNode(4);
		addNode(5);
		addNode(6);
		addNode(8);
		addNode(9);
		
		int sum=17;
		
		findTriplet(sum);

	}

}
