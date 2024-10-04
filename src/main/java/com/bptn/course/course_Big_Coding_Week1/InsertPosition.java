package com.bptn.course.course_Big_Coding_Week1;

public class InsertPosition {

	public static int searchInsert(int[] nums, int target) {
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			if (nums[i] >= target) {
				return i;
			}
		}
		return n;
	}
		// Add the content of your method starting here
		public static void main(String[] args) {
			InsertPosition solution = new InsertPosition();
			
			//Example 1
			int[] nums1 = {1, 3, 5, 6};
			int target1 = 5;
			System.out.println("Output for Example 1: " + solution.searchInsert(nums1, target1));
			
			//Example 2
			int[] nums2 = {1, 3, 5, 6};
			int target2 = 2;
			System.out.println("Output for Example 2: " + solution.searchInsert(nums2, target2));
			
			//Example 3
			int[] nums3 = {1, 3, 5, 6};
			int target3 = 7;
			System.out.println("Output for Example 3: " + solution.searchInsert(nums3, target3));
		

	}

}
