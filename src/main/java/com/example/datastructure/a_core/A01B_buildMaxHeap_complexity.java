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
	 * Time taken by max_heapify at any height = 2 comparisons at that level * height of the tree
	 * 											= 2 * Logn
	 * 											= O(Logn)
	 * 											= O(h)
	 * 
	 * Work done at height 'h' => (time taken by max_heapify at height 'h') * (number of nodes at height 'h')
	 * 							= O(h) * Ceil(n / 2^h+1)
	 * 
	 * 
	 * The height 'h' can range from 0 to n
	 * 
	 * Total work done => SUMMATION OF 	O(h) * Ceil(n / 2^h+1)		//where h ranges from 0 to Logn
	 * 					= SUMMATION OF 	ch * Ceil(n / 2^h+1)		//where h ranges from 0 to Logn
	 * 					= cn/2 * SUMMATION OF Ceil(h / 2^h)			//where h ranges from 0 to Logn
	 * 					= O(n)
	 * 
	 * 
	 * ----------------
	 * SPACE COMPLEXITY
	 * ----------------
	 * Call stack size of Logn
	 * 
	 */
}
