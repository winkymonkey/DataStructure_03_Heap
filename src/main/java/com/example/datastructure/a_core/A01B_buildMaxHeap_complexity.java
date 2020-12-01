package com.example.datastructure.a_core;


public class A01B_buildMaxHeap_complexity {
	/*
	 * TIME --- O(n)
	 * SPACE -- O(Logn) 		call stack
	 * 
	 * 
	 * ---------------
	 * TIME COMPLEXITY
	 * ---------------
	 * Time taken by max_heapify for a node at height 'h' 
	 * = (2 comparisons at that height) * height of the tree
	 * = 2 * h
	 * = O(h)
	 * 
	 * 
	 * Work done at height 'h' 
	 * = (time taken by max_heapify at height 'h') * (number of nodes at height 'h')
	 * = O(h) * Ceil(n / 2^h+1)
	 * 
	 * 
	 * The height 'h' can range from 0 to n
	 * 
	 * 
	 * 
	 * So total work done 
	 *                                   n
	 * = SUMMATION OF 	O(h) * CEIL(-----------)			//where h ranges from 0 to Logn
	 *                                 2^h+1
	 * 
	 *                                 n
	 * = SUMMATION OF 	ch * CEIL(-----------)				//where h ranges from 0 to Logn
	 *                               2^h+1 
	 * 
	 *    cn                           h
	 * = ---- * SUMMATION OF CEIL(-----------)				//where h ranges from 0 to Logn
	 *    2                           2^h
	 * 
	 *                              h
	 * ~ n * SUMMATION OF CEIL(-----------)					//where h ranges from 0 to Logn
	 *                             2^h
	 * 
	 *                              h
	 * ~ n * SUMMATION OF CEIL(-----------)					//where h ranges from 0 to INF
	 *                             2^h
	 * 
	 * 
	 * 
	 * **************
	 * We all know that,
	 *                         1
	 * SUMMATION OF x^n = ----------			//where n ranges from 0 to INF
	 *                        1-x
	 * 
	 * Differentiating both sides,
	 *                              1
	 * SUMMATION OF n * x^n-1 = ----------		//where n ranges from 0 to INF
	 *                           (1-x)^2
	 * 
	 *                            x
	 * SUMMATION OF n * x^n = ----------		//where n ranges from 0 to INF
	 *                         (1-x)^2
	 * 
	 * 
	 * 
	 * **************
	 * Putting this result in original equation, we get
	 *           1/2
	 * n * -----------------
	 *        (1 - 1/2)^2
	 * 
	 * = O(n)
	 * 
	 */
}
