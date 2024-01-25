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

	public static void main(String[] args) {
		int len;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length OR number of Inputs " + "that you would like to store");
		len = sc.nextInt();
		
		
		int nums[] = new int[len];
		int res[] = new int[len*2];
		
		for (int i = 0; i < len; i++) {
			nums[i] = sc.nextInt();
		}

		res=getConcatenation(nums);
		for(int i=0; i<len*2; i++) {
			System.out.println("  "+ res[i]);
		}
		System.out.println("Suppose in case if the branch is not there in "
				+ "github and you create a new "
				+ "feature branch in gjit hub and you do not push the branch,"
				+ " but you use only the url to push where does the code go and sit??");
		sc.close();

	}

}
