import java.util.*;

class House_Thieft {

    
	public int maxMoney(int i,int[] HouseNetWorth,int n) {
        if(i>=n)
            return 0;
        int c1=0;
        if(i<n)
            c1=HouseNetWorth[i]+maxMoney(i+2, HouseNetWorth, n);
        return Integer.max(c1,maxMoney(i+1, HouseNetWorth, n));
        
	}

    
	

	
	public static void main(String[] args) {
		House_Thieft ht = new House_Thieft();
		int[] HouseNetWorth = {6, 7, 1, 30, 8, 2, 4};
		System.out.println(ht.maxMoney(0,HouseNetWorth,HouseNetWorth.length));
		HouseNetWorth = new int[] {20, 5, 1, 13, 6, 11, 40};
        System.out.println(ht.maxMoney(0,HouseNetWorth,HouseNetWorth.length));
        int c1=2,c2=5,c3=4;
        System.out.println(c1>(c2>c3?c2:c3)?c1:(c2>c3?c2:c3));
	}
}
