import java.util.*;
/**
 * Date 11/1/2020
 *
 * Given an undirected graph find cycle in this graph.
 *
 * Solution
 * This can be solved in many ways.
 * Below is the code to solve it using disjoint sets and DFS.
 *
 * Runtime and space complexity for both the techniques is O(v)
 * where v is total number of vertices in the graph.
 * 
 *
 * REMEMBER : for competition  purpose, it is not feasible to make a tree representation of disjoint set, 
 * the following way is better in that case
 */

public class CycleUndirectedGraph
{
    private int p[];
    public int find(int p[],int x)
    {
        if(p[x]==-1)
            return x;
        return find(p,p[x]);
    }
    public void union(int p[],int x,int y)
    {
        p[x]=y;
    }
    public boolean detectCycle(ArrayList<ArrayList<Integer>> list,int V)
    {
        // this is a nice way of removng the repetetive edges:
        p=new int[V];
        for(int i=0;i<V;i++)
        {
            p[i]=-1;
        }
        ArrayList<ArrayList<Integer>> list1=new ArrayList<>();
        for(int i=0;i<V;i++)
        {
            list1.add(i,new ArrayList<Integer>());
        }
        for(int i=0;i<V;i++)
        {
            for(int j:list.get(i))
            {
                if(list1.get(i).contains(j)!=true)
                {
                    list1.get(j).add(i);
                }
            }
        }
        list=list1;
        for(int i=0;i<V;i++)
        {
            for(int j:list.get(i))
            {
                int r1=find(p,j);
                int r2=find(p,i);
                if(r1==r2)
                    return true;
                union(p,r1,r2);
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int V=sc.nextInt();
        int E=sc.nextInt();
        ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<V;i++)
        {
            list.add(i,new ArrayList<Integer>());
        }
        for(int i=0;i<E;i++)
        {
            int u=sc.nextInt();
            int v=sc.nextInt();
            list.get(u).add(v);
            list.get(v).add(u);
        }
        CycleUndirectedGraph c=new CycleUndirectedGraph();
        if(c.detectCycle(list,V)==true)
            System.out.println("1");
        else
        System.out.println("0");

    }
}