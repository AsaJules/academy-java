package com.bptn.course_31_challenge_implement_merge_sort;

import java.util.Arrays;

class Main {

	public static void main(String args[]) {
		int[] arr = { 12, 11, 13, 5, 6, 7 };

		System.out.print("Printing original array: ");
		System.out.println(Arrays.toString(arr));

		// sort array
		mergeSort(arr, 0, arr.length - 1);

		System.out.print("Printing sorted array: ");
		System.out.println(Arrays.toString(arr));

		// Test with other cases
		testWithArray(new int[] {});
		testWithArray(new int[] { 0 });
		testWithArray(new int[] { 0, -1 });
		testWithArray(new int[] { 22, 22, 33, 1, 33, 4, 5 });

	}

	static void testWithArray(int[] arr) {
		System.out.println("Original array: " + Arrays.toString(arr));
		mergeSort(arr, 0, arr.length - 1);
		System.out.println("Sorted array: " + Arrays.toString(arr));
	}

	// Merges two subarrays of arr[].
	// First subarray is arr[l..m]
	// Second subarray is arr[m+1..r]
	static void merge(int arr[], int l, int m, int r) {
		// Find sizes of two subarrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		// Create temporary arrays
		int L[] = new int[n1];
		int R[] = new int[n2];

		// Copy data to temp arrays
		for (int i = 0; i < n1; i++)
			L[i] = arr[l + i];
		for (int i = 0; i < n2; i++)
			R[i] = arr[m + 1 + i];

		// Merge the temp arrays

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarray
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		// Copy remaining elements of L[] if any
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		// Copy remaining elements of R[] if any
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}

	}

	// Main function that sorts arr[l..r] using
	// merge()
	static void mergeSort(int arr[], int l, int r) {
		// Add code here
		if (l < r) {
			// Find the middle point
			int m = l + (r - l) / 2;

			// Sort first and second halves
			mergeSort(arr, l, m);
			mergeSort(arr, m + 1, r);

			// Merge the sorted halves
			merge(arr, l, m, r);
		}
	}
}
