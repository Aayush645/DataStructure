package DSA450.LinkedList;

public class Mulitply_Two_LL 
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

	public static long multiply(node head1,node head2)
	{
		long N = 1000000007;
        long num1 = 0, num2 = 0;
        
        while(head1!=null)
        {
        	num1=((num1*10)+head1.data)%N;
        	head1=head1.next;
        }
        
        while(head2!=null)
        {
        	num2=((num2*10)+head2.data)%N;
        	head2=head2.next;
        }
        
        return ((num1%N)*(num2%N))%N;
	}
	
	public static void main(String[] args) 
	{
		node head1=null,head2=null;
		
		head1=add(head1,9);
		head1.next=add(head1,4);
		head1.next.next=add(head1,6);
		
		head2=add(head2,8);
		head2.next=add(head2,4);
		
		System.out.println(multiply(head1,head2));
		
		

	}

}
