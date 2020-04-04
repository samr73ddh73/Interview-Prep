//https://practice.geeksforgeeks.org/problems/zigzag-tree-traversal/1
//Initial Template for Java

import java.util.*;
import java.util.HashMap;
import java.io.*;
//Use of two stacks:
class GFG
{
	void zigZagTraversal(Node root)
	{
	    int left=1,size=0;
	    
	    Stack<Node> st1=new Stack<>();
	    Stack<Node> st2=new Stack<>();
	    st1.push(root);
	    while(!st1.isEmpty()|| !st2.isEmpty())
	    {
	       if(left==1)
	       {
	           size=st1.size();
	           
	           while(size-->0)
	           {
	               Node x=st1.pop();
	               if(x!=null)
    	           {
    	               System.out.print(x.data+" ");
    	               st2.push(x.left);
    	               st2.push(x.right);
	               }
	           }
	           //System.out.println();
	           left=0;
	       }
	       else
	       {
	           size=st2.size();
	           
	           while(size-->0)
	           {
	               Node x=st2.pop();
	               if(x!=null)
	               {
	                   System.out.print(x.data+" ");
    	               st1.push(x.right);
    	               st1.push(x.left);
	               }
	           }
	           left=1;
	       }
	        
	    }
	}
}