package com.bptn.course_CodeChallenge;

import java.util.HashMap;

public class TwoSum {
	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		int[] result = twoSum(nums, target);

		// Print the result
		System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
	}

	public static int[] twoSum(int[] nums, int target) {

		// Create a HashMap to store the value and its corresponding index
		HashMap<Integer, Integer> map = new HashMap<>();

		// Iterate through the array
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i]; // Find the complement that adds up to the target

			// Check if the complement is already in the map
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i }; // Return the indices if found
			}

			// Store the number and its index in the map
			map.put(nums[i], i);
		}

		// If no solution is found, return an empty array or throw an exception
		throw new IllegalArgumentException("No two sum solution");
	}
}
