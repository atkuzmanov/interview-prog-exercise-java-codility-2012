package com.codility.com.test01;

public class CodilityTest01Task02Try01 {

	/**
	 * Dominator of an Array - WORKING!
	 */
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
	 * Find the Dominator of an Array - WORKING!
	 */
	public static int dominator(int[] A){
	    int current_candidate = A[0], counter = 0, i;
	    for (i = 0; i < A.length; ++i) {
	        if (current_candidate == A[i]) {
	            ++counter;
	            //printf("candidate: %i, counter: %i\n",current_candidate,counter);
	        } else if (counter == 0) {
	            current_candidate = A[i];
	            ++counter;
	            //printf("candidate: %i, counter: %i\n",current_candidate,counter);
	        } else {
	            --counter;
	            //printf("candidate: %i, counter: %i\n",current_candidate,counter);
	        }
	    }
	    return counter;
	}
}
