package com.codility.com.test01;

import java.util.Arrays;

public class CodilityTest01Task03Try01 {


//	public static void main(String[] args) {
//
//	}
	
	/*
	 * Find Median of an Array of Integers. WORKING!
	 */
	public static int findMedian(int[] A){
	    int length=A.length;
	    int[] sort = new int[length];
	    System.arraycopy(A, 0, sort, 0, sort.length);
	    Arrays.sort(sort);
	    if (length % 2 == 1) {
	        return (sort[(sort.length / 2) - 1] + sort[sort.length / 2]) / 2;
	    } else {
	        return sort[sort.length / 2];
	    }
	}

}
