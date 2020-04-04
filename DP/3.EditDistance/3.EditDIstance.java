class Main
{
    public static int editDistance(String s1,String s2,int n,int m,int i,int j)
    {
        if(j>=s2.length() && i<s1.length())
            return n-1-i;
        if(i<0 || i>=n || j<0 || j>=m)
            return 0;
        if(s1.charAt(i)==s2.charAt(j))
            return editDistance(s1,s2,n,m,i+1,j+1);
        int c1=1+editDistance(s1,s2,n,m,i,j+1);
        int c2=1+editDistance(s1,s2,n,m,i+1,j);
        int c3=1+editDistance(s1,s2,n,m,i+1,j+1);
        return c1>(c2>c3?c3:c2)?(c2>c3?c3:c2):c1;
        
    }
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=Integer.parseInt(sc.nextLine());
		while(t-->0)
		{
		    int n=Integer.parseInt(sc.next());
		    int m=Integer.parseInt(sc.next());
		    String s1=sc.next();
		    String s2=sc.next();
		    System.out.println(editDistance(s1,s2,n,m,0,0));
		}
    }
}