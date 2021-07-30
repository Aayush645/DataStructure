package DSA450.LinkedList;

public class Segregate_Even_Odd_Nodes 
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
	
	public static void seperate()
	{
		node oddstart=null,evenstart=null,oddend=null,evenend=null;
		node current=head;
		
		while(current!=null)
		{
			int data=current.data;
			
			if(data%2==0)
			{
				if(evenstart==null)
				{
					evenstart=current;
					evenend=current;
				}
				else
				{
					evenend.next=current;
					evenend=evenend.next;
				}
			}
			else
			{
				if(oddstart==null)
				{
					oddstart=current;
					oddend=current;
				}
				else
				{
					oddend.next=current;
					oddend=oddend.next;
				}
			}
			current=current.next;
		}
		evenend.next=oddstart;
		oddend.next=null;
		head=evenstart;
	}
	
	public static void print()
	{
		System.out.println("Hi");
		node temp=head;
		
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}

	public static void main(String[] args)
	{
		add(17);
		add(15);
		add(8);
		add(12);
		add(10);
		add(5);
		add(4);
		
		seperate();
		
		print();

	}

}
