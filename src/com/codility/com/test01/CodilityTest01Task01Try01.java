package com.codility.com.test01;

import java.util.Set;
import java.util.TreeSet;

public class CodilityTest01Task01Try01 {

//	public static void main(String[] args) {
//
//	}
	

	/*
	 * Find the number of unique elements in an Array.
	 */
	public int distinct( int[] A ) {
		Set<Integer> s = new TreeSet<Integer>();  
		try{
			for(int i = 0; i < A.length; i++){
				s.add(A[i]);
			}
		} catch (UnsupportedOperationException e) {
			System.err.println("UnsupportedOperationException!!!");
			e.printStackTrace();
		} catch (ClassCastException e) {
			System.err.println("ClassCastException!!!");
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.err.println("NullPointerException!!!");
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			System.err.println("IllegalArgumentException!!!");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("ArrayIndexOutOfBoundsException!!");
			e.printStackTrace();
		}
		return s.size();
	  }

}
