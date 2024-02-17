package binaryInteger.Add;

import java.util.Iterator;

public class Solution {
	
	public static void main(String[] args) {
		int[] a = {1,1,1,1};
		int[] b = {1,1,1,1};
		int[] c = addTwoBinaryInteger(a, b, a.length);
		for (int i : c) {
			System.out.println(i);
		}
	}
	
	private static int[] addTwoBinaryInteger(int[] a, int[] b, int len) {
		int[] c = new int[len+1];
		int carry = 0;
		int sum = 0;
		for(int i = len; i > 0; i--) {
			sum = a[i-1] + b[i-1] + carry;
			if(sum < 2) {
				c[i] = sum;
				carry = 0;
			} else { 
				if(sum == 2) {
					c[i] = 0;
				} else {
					c[i] = 1;
				}
				carry = 1;
			}
		}
		if(carry == 1) {
			c[0] = 1;
		}
		return c;
	}

}
