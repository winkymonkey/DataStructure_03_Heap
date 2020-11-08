package com.example.datastructure.b_apply;

/**
 * *****************************************************************************
 * Median in a stream of integers (running integers)
 * *****************************************************************************
 * Median means ---
 *   if the input size is odd --- Median = middle element of sorted stream
 *   if the input size is even -- Median = average of two middle elements of sorted stream
 * 
 * Example:
 * A Stream of 5, 15, 1, 3
 * 		After reading 1st element of stream -- 5           -> median -- 5
 * 		After reading 2nd element of stream -- 5, 15       -> median -- 10
 * 		After reading 3rd element of stream -- 5, 15, 1    -> median -- 5
 * 		After reading 4th element of stream -- 5, 15, 1, 3 -> median -- 4
 * 
 * *****************************************************************************
 */

public class B02_findMedianFromStreamOfIntegers {
	/*
	 * --------------------
	 * ---INSERTION SORT---
	 * --------------------
	 * Already discussed in ARRAY section
	 * 
	 * 
	 * 
	 * 
	 * ----------------
	 * ---USING HEAP---
	 * ----------------
	 * Use 2 heaps
	 * 	- A MinHeap that contains the larger half of the elements, with the minimum element at the root
	 * 	- A MaxHeap that contains the smaller half of the elements, with the maximum element at the root
	 * 
	 * 
	 * For the first two incoming elements 
	 * 	- add smaller one to the MaxHeap
	 * 	- add bigger one to the MinHeap
	 * 
	 * 
	 * Then process stream data one by one,
	 * 	- if (incoming element < MaxHeap root) 
	 * 		add it to MaxHeap
	 * 	- else
	 * 		add it to MinHeap
	 * 
	 * 
	 * As soon as an element is added to any heap we have to balance the heap
	 * 	- if (Number of elements in MaxHeap - Number of elements in MinHeap) > 1
	 * 		remove root of MaxHeap and add it to MinHeap
	 *  
	 *  - else if (Number of elements in MinHeap - Number of elements in MaxHeap) > 1
	 * 		remove root of MinHeap and add it to MaxHeap
	 * 
	 * 	- else
	 * 		Nothing to do
	 * 
	 * 
	 * Then at any given time you can calculate median like this:
	 *  - If the heaps contain equal amount of elements
	 * 		median = (root of maxHeap + root of minHeap) / 2
	 *  - else
	 *  	median = root of the heap with more elements
	 * 
	 */
}
