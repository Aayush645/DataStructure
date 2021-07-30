package DSA450.LinkedList;

import DSA450.LinkedList.Mulitply_Two_LL.node;

public class Delete_nodes_having_greater_value_on_rightSide 
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
	
	public static node add(node head, int data)
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
	
	public static void remove(node head)
	{
		node current=head;
		node maxValue=head;
		node toRemove=null;
		
		while(current!=null && current.next!=null)
		{
			if(current.data>current.next.data)
			{
				toRemove=current.next;
				current.next=toRemove.next;
				
				if(current.next.data>maxValue.data)
				{
					maxValue.data=current.next.data;
				}
			}
			else
			{
				current=current.next;
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
	
	static void reverseList(node head)
    {
        node current = head;
        node prev = null;
        node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

	public static void main(String[] args) 
	{
		node head1=null;
		
		head1=add(head1,12);
		head1.next=add(head1,15);
		head1.next.next=add(head1,10);
		head1.next.next.next=add(head1,11);
		head1.next.next.next.next=add(head1,5);
		head1.next.next.next.next.next=add(head1,6);
		head1.next.next.next.next.next.next=add(head1,2);
		head1.next.next.next.next.next.next.next=add(head1,3);
		
		reverseList(head1);
		
		remove(head1);
		
		reverseList(head1);
		
		print(head1);

	}

}
