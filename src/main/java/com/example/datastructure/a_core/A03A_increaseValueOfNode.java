package com.example.datastructure.a_core;

import java.util.Arrays;

/**
 * ************************************************************************************
 * When we increase value of a Node, there can be a chance that this node's value becomes higher than its parent.
 * If so, we need to exchange child with parent and keep on continuing it until the child's value is lesser than parent. 
 * ************************************************************************************
 */

public class A03A_increaseValueOfNode {
	
	public static void main(String[] args) {
		int A[] = { 17, 15, 13, 9, 6, 5, 10, 4, 8, 3, 1 };		//max-heap structure
		//index		0   1   2   3  4  5   6  7  8  9  10
		
		increaseKey(A, 7, 12);
		System.out.println(Arrays.toString(A));
	}
	
	
	private static void increaseKey(int A[], int i, int value) {
		A[i] = value;
		
		while (i>0 && A[(i-1)/2] < A[i]) {		//if parent is less than child
			//swap A[(i-1)/2] and A[i]			//swap parent and child
			int temp = A[(i-1)/2];
			A[(i-1)/2] = A[i];
			A[i] = temp;
			
			i = (i-1)/2;						//go to parent
		}
	}
	
}
