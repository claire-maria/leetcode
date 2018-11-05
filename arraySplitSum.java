package facebook_Practice;

import java.io.*;

public class arraySplitSum {
	static int findSplit(int[] n, int len) {
		int leftSum = 0;
		int rightSum = 0;
		for(int i = 0 ; i < len -1 ; i++) {
			for(int j = len - 1; j >= 0 ; j--) {
				leftSum = leftSum + n[i];
				rightSum = rightSum + n[j];
				if(leftSum == rightSum) {
					//System.out.println(i + 1);
					return i + 1;
					
				}
			}
		}
		return -1;
		
	}
	public static void printArrays(int[] n, int len) {
		int splitPoint = findSplit(n,len);
		if(splitPoint == -1 || splitPoint == len) {
			System.out.println("Not possible");
		}
		for(int i = 0 ; i < len ; i++) {
			if(i == splitPoint) {
				System.out.println();
			}
			System.out.print(n[i]);
			
		}
	}

	public static void main(String[] args) {

		int n[] = { 4, 1, 2, 3 };
		int len = n.length;
		printArrays(n, len);
		

	}
}
