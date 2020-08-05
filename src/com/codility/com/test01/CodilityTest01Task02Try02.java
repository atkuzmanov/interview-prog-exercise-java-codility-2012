package com.codility.com.test01;

public class CodilityTest01Task02Try02 {

//	public static void main(String[] args) {
//
//	}
	
	/*
	 * Test Cases
	 * [3, 4, 3, 2, 3, -1, 3, 3]
	 * [5,5,5,3,3,1,1,3,3,3,1,3,3]
	 * [1,2,1,2,3,1,3,3,1,2,1,1]
	 * [1,2,1,2,1,3,4,5]
	 * [5, 4, 5, 4, 5, 4, 5, 4, 5]
	 */
	
	/*
	 * Find the Dominator of an Array. Not complete.
	 */
	public static int dominator(int[] A)
	{
		int result = -1, count = 0, temp = 0;
	    int length = A.length,verified = 0;
	
	    for (int i = 0; i < length; i++)
	    {
	    	verified = 0;
	    	if (count == 0) {
	    	temp = A[i];
	    	result = i;
	    	count++;
	    	verified = 1;
	    }
	    	if (verified == 0){
	    		if (A[i] == temp){
	    			count++;
	    		} else {
	    			count--;
	    		}
	    	}
	    }

	    if (count > 0) {
	    	int countOfInst = 0;
	    	for (int i = 0; i < length; i++){
	    		if (A[result] == A[i]) {
	    			countOfInst++;
	    		}
	    		if (countOfInst > length / 2)
	    			return A[result]; // Return the dominator
	    	}
	    }
	    return -1;
	}
}
