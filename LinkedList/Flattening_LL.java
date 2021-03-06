package DSA450.LinkedList;
import java.util.*;
public class Flattening_LL 
{
	Node head; 
    class Node
    {
        int data;
        Node right, down;
        Node(int data)
        {
            this.data = data;
            right = null;
            down = null;
        }
    }

    Node flatten(Node root)
    {
        if (root == null || root.right == null)
            return root;
 
        root.right = flatten(root.right);
        root = merge(root, root.right);
 
        return root;
    }
    
    Node merge(Node a,Node b)
    {
    	if(a==null)
    	{
    		return b;
    	}
    	
    	if(b==null)
    	{
    		return a;
    	}
    	
    	Node result;
    	
    	if(a.data<b.data)
    	{
    		result=a;
    		result.down=merge(a.down,b);
    	}
    	else
    	{
    		result=b;
    		result.down=merge(a,b.down);
    	}
    	result.right=null;
    	return result;
    }
 
    /* Utility function to insert a node at beginning of the
       linked list */
    Node push(Node head_ref, int data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(data);
 
        /* 3. Make next of new Node as head */
        new_node.down = head_ref;
 
        /* 4. Move the head to point to new Node */
        head_ref = new_node;
 
        /*5. return to link it back */
        return head_ref;
    }
 
    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.down;
        }
        System.out.println();
    }
 
    /* Driver program to test above functions */
    public static void main(String args[])
    {
        Flattening_LL L = new Flattening_LL();
 
        L.head = L.push(L.head, 30);
        L.head = L.push(L.head, 8);
        L.head = L.push(L.head, 7);
        L.head = L.push(L.head, 5);
 
        L.head.right = L.push(L.head.right, 20);
        L.head.right = L.push(L.head.right, 10);
 
        L.head.right.right = L.push(L.head.right.right, 50);
        L.head.right.right = L.push(L.head.right.right, 22);
        L.head.right.right = L.push(L.head.right.right, 19);
 
        L.head.right.right.right = L.push(L.head.right.right.right, 45);
        L.head.right.right.right = L.push(L.head.right.right.right, 40);
        L.head.right.right.right = L.push(L.head.right.right.right, 35);
        L.head.right.right.right = L.push(L.head.right.right.right, 20);
 
        // flatten the list
        L.head = L.flatten(L.head);
 
        L.printList();
    }
} 


