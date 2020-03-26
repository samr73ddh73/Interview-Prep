import java.util.*;
class NumberFactorTopDown
{
    public static int factors(int n)
    {
        
        int dp[] = new int[n + 1];
		dp[0] = dp[1] = dp[2] = 1; // BaseCases
		dp[3] = 2; // BaseCases

		for (int i = 4; i <= n; i++)
			dp[i] = dp[i - 1] + dp[i - 3] + dp[i - 4];

		return dp[n];
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        System.out.println("bottom");
        System.out.println(factors(n));

    }
}