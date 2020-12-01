package com.example.datastructure.a_core;

import java.util.Arrays;

/**
 * ************************************************************************************
 * When we have an Max-Heap, it's very easy to say that first element is the maximum.
 * But we can't simply delete that element because if we do so, the resulting tree will no longer be a heap.
 * ************************************************************************************
 */

public class A02A_deleteMaximum {
	
	public static void main(String[] args) {
		int A[] = { 17, 15, 13, 9, 6, 5, 10, 4, 8, 3, 1 };		//max-heap structure
		//index		0   1   2   3  4  5   6  7  8  9  10
		
		deleteMax(A, A.length);
		System.out.println(Arrays.toString(A));
	}
	
	
	private static void deleteMax(int A[], int n) {
		A[0] = A[n-1];										//set last element as root
		n = n-1;											//decrease size of heap by 1
		max_heapify(A, n, 0);								//heapify the root		
	}
	
	
	private static void max_heapify(int A[], int n, int i) {
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

			max_heapify(A, n, largest);
		}
	}
}
