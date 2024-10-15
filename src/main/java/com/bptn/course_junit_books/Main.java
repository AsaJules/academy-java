package com.bptn.course_junit_books;

import java.util.Arrays;

public class Main {

//	// Do not modify this code. Please update the other files in the tabs above.
//	public static void main(String[] args) {
//		Textbook tb = new Textbook("Computer Science", 14.99, 9);
//		Textbook tb2 = new Textbook("Basketweaving", 19.99, 2);
//
//		System.out.println("Title: " + tb.getTitle());
//		System.out.println("Edition: " + tb.getEdition());
//		System.out.println("Book Info: " + tb.getBookInfo());
//		System.out.println("Can substitute for tb2: " + tb.canSubstituteFor(tb2));
//
//		System.out.println("\nTitle: " + tb2.getTitle());
//		System.out.println("Edition: " + tb2.getEdition());
//		System.out.println("Book Info: " + tb2.getBookInfo());
//		System.out.println("Can substitute for tb: " + tb2.canSubstituteFor(tb));
//	}
//}

	public void Start() {

		int[] array = { 3, 6, 1, 4, 2, 9, 7, 8, 5, 0 };
		int key = 1;

		Arrays.sort(array);

		// sort array
		int result = binarySearch(array, key);

		// Print values in array after sort
		System.out.println(result);

	}

	int binarySearch(int arr[], int key) {
		// put your code here.
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2; // Avoids overflow

			// Check if the key is present at mid
			if (arr[mid] == key) {
				return mid;
			}
			// If key is greater, ignore the left half
			if (arr[mid] < key) {
				low = mid + 1;
			}
			// If key is smaller, ignore the right half
			else {
				high = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.Start();
	}
}
