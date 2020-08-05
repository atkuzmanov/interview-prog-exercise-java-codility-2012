package com.codility.com.test01;

public class CodilityTest01Task02Try04 {

	
	/*
	 * Test Cases
	 * [3, 4, 3, 2, 3, -1, 3, 3]
	 * [5,5,5,3,3,1,1,3,3,3,1,3,3]
	 * [1,2,1,2,3,1,3,3,1,2,1,1]
	 * [1,2,1,2,1,3,4,5]
	 * [5, 4, 5, 4, 5, 4, 5, 4, 5]
	 */
	
	/*
	 * Find the Dominator of an Array. Working or not, not sure how.
	 */
	public static int dominator(int[] A){
        int dom;
      dom = A[0]; // initially assume dominator is first element
       int domFirstIndex = 0; // dominator first index location
      int count = 1;
      int n = A.length;

      for(int i=1; i< n; i ++ )
      {
          if( A[i] != dom )
          {
              count --;
              if( count == 0 || count <0 )
              {
                  dom = A[i] ;
                  count = 0 ;
                  domFirstIndex = i; 
              }
          }
          else
          {
              count ++;
          }
      }


      if( count > 0 && (domFirstIndex <= n/2))
      {
          //System.out.println("\n dominator is " + dom);
          return -1;
      }
      else
      {
          //System.out.println("\n there is no dominator \n");
          return domFirstIndex ;
      }
	}
	
}
