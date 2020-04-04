import java.util.*;
class Main
{
    public static boolean isSafe(String str,String ans,int i)
    {
        Character c=str.charAt(i);
        if((ans+c).contains("AB"))
            return false;
        return true;
    }
    public static void permute(String str,String ans)
    {
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            if(isSafe(str,ans,i))
            {
                String res=str.substring(0,i)+str.substring(i+1);
                Character c=str.charAt(i);
                permute(res,ans+c);
            }
        }
    }
    public static void main (String[] args) {
    /* code */
    permute("ABC","");
}
}