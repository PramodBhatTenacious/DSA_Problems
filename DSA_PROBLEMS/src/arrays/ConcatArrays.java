package arrays;

import java.util.*;

public class ConcatArrays {

	public static int[] getConcatenation(int[] nums) {

		int n = nums.length;
		int temp[] = new int[n * 2];

		for (int i = 0; i < temp.length; i++) {

			if (i > n || i == n) {

				temp[i] = nums[i - n];
			}
			if (i < n)
				temp[i] = nums[i];
		}
		/*
		 * for(int i=0; i<temp.length; i++) { System.out.print("  "+ temp[i]);
		 * System.out.println(" "); }
		 */
		return temp;
	}

	public static int[] shuffle(int[] nums, int n) {
		// [x1,x2,x3,x4,y1,y2,y3,y4]
		// Output-: [x1,y1,x2,y2,x3,y3,x4,y4]
		// brute force solution.
		int no_of_pairs = n;
		int result[] = new int[2 * n];
		for (int i = 0; i < nums.length / 2; i++) {
			// you are going liner iteration on nums
			// ur filling result as needed in the output.
			result[2 * i] = nums[i];
			
			// FILLING THE FIST HALF TO EVEN NUMBERED POSITIONS of entire result array

			result[2 * i + 1] = nums[n + i];// FILLING THE SECOND HALF TO ODD NUMBERD POSITIONS
			// odd numberd also means the next consecutive element you can use this logic
			// also.
		}
		System.out.println(" ");
		for(int i=0;i<result.length;i++)
		{
			System.out.println("Shuffeled array is -: " + result[i]);
		}
		return result;
	}

	public static void main(String[] args) {
		int len;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length OR number of Inputs " + "that you would like to store");
		len = sc.nextInt();
		
		int nums[] = new int[len];
		int res[] = new int[len * 2];
			int n = len/2;
		System.out.println("Enter the element of the array");
		for (int i = 0; i < len; i++) {
			nums[i] = sc.nextInt();
		}

		res = getConcatenation(nums);
		System.out.println("Concatinated Array is ");
		for (int i = 0; i < len * 2; i++) {
			
			System.out.print(" " + res[i]);
		}

		System.out.println("Suppose in case if the branch is not there in "
				+ "github and you create a new "
				+ "feature branch in gjit hub and you do not push the branch,"
				+ " but you use only the url to push where does the code go and sit??");

		
		res = shuffle(nums, len/2); 
		
		sc.close();

	}

}
