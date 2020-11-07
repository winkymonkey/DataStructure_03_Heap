package com.example.datastructure.a_core;

import java.util.Arrays;

/**
 * ************************************************************************************
 * When we have an array of heap structure, it's very easy to say that first element is the minimum.
 * But we can't simply delete that element because if we do so, the resulting tree will no longer be a heap. 
 * 
 * TIME --- O(Logn)
 * SPACE -- O(1)
 * 
 * ************************************************************************************
 */

public class A02_deleteMaximum {
	
	public static void main(String[] args) {
		int A[] = { 17, 15, 13, 9, 6, 5, 10, 4, 8, 3, 1 };		//heap structure
		//index		0   1   2   3  4  5   6  7  8  9  10
		
		heapExtractMax(A);
	}
	
	
	private static int heapExtractMax(int A[]) {
		int max = A[0];
		A[0] = A[A.length-1];							//make last element as root
		A = Arrays.copyOf(A, A.length-1);				//decrement array size by 1
		max_heapify(A, 0);								//heapify the resulting array after extracting max
		
		System.out.println(Arrays.toString(A));
		System.out.println(max);
		return max;
	}
	
	
	private static void max_heapify(int A[], int i) {
		int n = A.length;
		
		int largest = i;
		int l = 2*i + 1;
		int r = 2*i + 2;

		if (l < n && A[l] > A[i])
			largest = l;

		if (r < n && A[r] > A[largest])
			largest = r;

		if (largest != i) {
			// swap A[i] and A[largest]			//if largest and root are not equal, swap them to send largest to root
			int temp = A[i];
			A[i] = A[largest];
			A[largest] = temp;

			max_heapify(A, largest);
		}
	}
}
