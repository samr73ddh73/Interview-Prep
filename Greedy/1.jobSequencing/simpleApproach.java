/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Job
{
    int id,deadline,p;
    Job(int id,int deadline,int p)
    {
        this.id=id;
        this.deadline=deadline;
        this.p=p;
    }
    public String toString()
    {
        return("{ "+id+" "+deadline+" "+p+"},");
    }
}
class JobSort implements Comparator<Job>
{
    public int compare(Job j1,Job j2)
    {

        return j2.p-j1.p;
    }
}
class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		int maxd=-1;
		while(t-->0)
		{
		    List<Job> l=new ArrayList<Job>();
		    int n=sc.nextInt();
		    for(int i=0;i<n;i++)
    	    {
    	        int id=sc.nextInt();
    		    int deadline=sc.nextInt();
    		    maxd=Math.max(deadline,maxd);
    		    int p=sc.nextInt();
    		    l.add(new Job(id,deadline,p));
		    }
		
    		Collections.sort(l,new JobSort());
    		//System.out.println(l);
    		int arr[]=new int[maxd];
    		int profit=0,c=0;
    		for(Job ele:l)
    		{
    		    for(int i=ele.deadline-1;i>=0;i--)
    		    {
    		        if(arr[i]==0)
    		        {
    		            arr[i]=ele.id;
    		            profit+=ele.p;
    		            c++;
    		            break;
    		        }
    		    }
    		}
    		System.out.println(c+" "+profit);
		}	
	}
}