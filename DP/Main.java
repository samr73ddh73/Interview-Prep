/*package whatever //do not write package name here */

import java.util.*;


class Main {

	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        String str="abcdefghijklmnopqrstuvwxyz";
        int max=4*n-3;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<(max-(4*i+1))/2;j++)
                System.out.print("-");
            for(int j=0;j<i+2;j++)
            {
                System.out.print(str.charAt(n+1-j)+"-");   
            }
            for(int j=i;j<i+2;j++)
            {
                System.out.print(str.charAt(n+1-j)+"-");   
            }
            for(int j=0;j<(max-(4*i+1))/2-1;j++)
                System.out.print("-");
        }
	}
}