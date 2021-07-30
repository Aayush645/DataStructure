package DSA450.LinkedList;

public class Pairs_With_Given_Sum_InDLL 
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

	public static void findPairs(int sum)
	{
		int flag=0;
		
		node temp=head,ptr=tail;
		
		while(temp!=ptr && ptr.next!=temp)
		{
			if((temp.data+ptr.data)==sum)
			{
				System.out.print("["+temp.data+" , "+ptr.data+"]"+" ");
				flag=1;
				temp=temp.next;
				ptr=ptr.prev;
			}
			else if((temp.data+ptr.data)<sum)
			{
				temp=temp.next;
			}
			else
			{
				ptr=ptr.prev;
			}
		}
		if(flag==0)
		{
			System.out.println("No pairs are there");
		}
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
		
		int sum=7;
		
		findPairs(sum);
		
	}

}
