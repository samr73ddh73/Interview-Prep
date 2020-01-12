import java.util.*;
public class CycleUndirectedDfs
{
    
    public boolean detectCycle(ArrayList<ArrayList<Integer>> list,int src,int parent,boolean vis[])
    {
        vis[src]=true;
        for(int i:list.get(src))
        {
            if(vis[i]==true && parent!=i)
                return true;
            if(vis[i]!=true)
                return detectCycle(list,i,src,vis);
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
        boolean vis[]=new boolean[V];
        for(int i=0;i<V;i++)
            vis[i]=true;
        CycleUndirectedDfs c=new CycleUndirectedDfs();
        if(c.detectCycle(list,0,-1,vis)==true)
            System.out.println("1");
        else
        System.out.println("0");

    }
}