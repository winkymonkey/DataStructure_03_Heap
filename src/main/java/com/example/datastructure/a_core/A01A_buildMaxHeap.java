package com.example.datastructure.a_core;

import java.util.Arrays;

/**
 * ************************************************************************************
 * A given array may not have all its elements in Heap structure.
 * To convert an array to Max Heap we need some algorithm where 'max_heapify()' is the heart of it.
 * ************************************************************************************
 */

public class A01A_buildMaxHeap {

	public static void main(String[] args) {
		int A[] = { 1, 6, 9, 8, 7, 10, 3, 12, 4, 14 };
		//index		0  1  2  3  4  5   6  7   8  9
		
		/*
		 *        VALUE                 INDEX
		 *          1                     0
		 *       /     \               /     \
		 *      6       9             1       2
		 *    /   \    / \          /   \    / \
		 *   8     7  10  3        3     4  5   6
		 *  / \   /               / \   /
		 * 12  4 14              7   8 9
		 * 
		 */
		
		System.out.println(Arrays.toString(A));
		buildMaxHeap(A);
	}
	
	
	private static void buildMaxHeap(int A[]) {
		int n = A.length;
		for (int i = (n/2)-1; i >= 0; i--) { 			// non-leaves are from 0 to Floor(length/2)-1
			max_heapify(A, n, i); 						// leaves are from Floor(length/2) to length-1
			System.out.println(Arrays.toString(A));
		}
	}
	
	
	private static void max_heapify(int A[], int heapsize, int i) {
		int largest = i;
		int l = 2*i + 1;
		int r = 2*i + 2;

		if (l < heapsize && A[l] > A[i])		//if l exists and l element > root element
			largest = l;

		if (r < heapsize && A[r] > A[largest])	//if r exists and r element > largest element
			largest = r;

		if (largest != i) {
			// swap A[i] and A[largest]			//if largest and root are not equal, swap them to send largest to root
			int temp = A[i];
			A[i] = A[largest];
			A[largest] = temp;

			max_heapify(A, heapsize, largest);
		}
	}
	
	
	/*
	 * --------
	 * EXAMPLE:
	 * --------
	 * INPUT
	 *          1
	 *       /     \
	 *      6       9
	 *    /   \    / \
	 *   8     7  10  3
	 *  / \   /
	 * 12  4 14
	 * 
	 * HEAPIFY FOR 7 --- so swap 7 with 14
	 * 
	 * 
	 *          1
	 *       /     \
	 *      6       9
	 *    /   \    / \
	 *   8    14  10  3
	 *  / \   /
	 * 12  4 7
	 * 
	 * HEAPIFY FOR 8 --- so swap 8 with 12
	 * 
	 * 
	 *          1
	 *       /     \
	 *      6       9
	 *    /   \    / \
	 *   12   14  10  3
	 *  / \   /
	 * 8   4 7
	 * 
	 * HEAPIFY FOR 9 --- so swap 9 with 10
	 * 
	 * 
	 *          1
	 *       /     \
	 *      6      10
	 *    /   \    / \
	 *   12   14  9   3
	 *  / \   /
	 * 8   4 7
	 * 
	 * HEAPIFY FOR 6 --- so swap 6 with 14 --- then swap 6 with 7
	 * 
	 * 
	 *          1
	 *       /     \
	 *     14      10
	 *    /   \    / \
	 *   12   6   9   3
	 *  / \   /
	 * 8   4 7
	 * 
	 *          1
	 *       /     \
	 *     14      10
	 *    /   \    / \
	 *   12   7   9   3
	 *  / \   /
	 * 8   4 6
	 * 
	 * HEAPIFY FOR 1 --- so swap 1 with 14 --- then swap 1 with 12 --- then swap 1 with 8
	 * 
	 * 
	 *         14
	 *       /     \
	 *      1      10
	 *    /   \    / \
	 *   12   7   9   3
	 *  / \   /
	 * 8   4 6
	 * 
	 *         14
	 *       /     \
	 *     12      10
	 *    /   \    / \
	 *   1    7   9   3
	 *  / \   /
	 * 8   4 6
	 * 
	 *         14
	 *       /     \
	 *     12      10
	 *    /   \    / \
	 *   8    7   9   3
	 *  / \   /
	 * 1   4 6
	 * 
	 */
}
