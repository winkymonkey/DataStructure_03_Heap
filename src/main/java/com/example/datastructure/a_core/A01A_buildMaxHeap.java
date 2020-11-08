package com.example.datastructure.a_core;

import java.util.Arrays;

/**
 * ************************************************************************************
 * A given array may not have all its elements in Heap structure.
 * To convert an array to Max Heap we need some algorithm where 'max_heapify()' is the heart of it.
 * 
 * ************************************************************************************
 */

public class A01A_buildMaxHeap {

	public static void main(String[] args) {
		int A[] = { 1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17 };
		//index		0  1  2  3  4  5   6   7  8  9   10
		
		buildMaxHeap(A);
	}
	
	
	private static void buildMaxHeap(int A[]) {
		int n = A.length;
		for (int i = (n/2)-1; i >= 0; i--) { 			// non-leaves are from 0 to Floor(n/2)-1
			max_heapify(A, i); 							// leaves are from Floor(n/2) to n
		}
		System.out.println(Arrays.toString(A));
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
