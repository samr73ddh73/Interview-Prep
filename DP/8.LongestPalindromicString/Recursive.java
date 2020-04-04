class Solution {
    public int isPalindrome(StringBuilder s)
    {
        int i=0,j=s.length()-1;
        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j))
                return 0;
            i++;
            j--;
        }
        return s.length();
    }
    public int LPSUtil(String s,int i,StringBuilder st)
    {
        if(i>=s.length()-1)
            return isPalindrome(st);
        st.append(s.charAt(i+1));
        int c1=LPSUtil(s,i+1,st);
        st.deleteCharAt(st.length()-1);
        int c2=LPSUtil(s,i+1,st);
        return Math.max(c1,c2);
    }
    public int longestPalindromeSubseq(String s) {
        StringBuilder st=new StringBuilder("");
        return LPSUtil(s,-1,st);
    }
}