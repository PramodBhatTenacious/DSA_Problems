package arrays;

import java.util.*;

public class ConcatArrays {

	/*
	 * public static int[] getConcatenation(int[] nums) {
	 * 
	 * int n = nums.length; int temp[] = new int[n * 2];
	 * 
	 * for (int i = 0; i < temp.length; i++) {
	 * 
	 * if (i > n || i == n) {
	 * 
	 * temp[i] = nums[i - n]; } if (i < n) temp[i] = nums[i]; }
	 * 
	 * for(int i=0; i<temp.length; i++) { System.out.print("  "+ temp[i]);
	 * System.out.println(" "); }
	 * 
	 * return temp; }
	 * 
	 * public static int[] shuffle(int[] nums, int n) { // [x1,x2,x3,x4,y1,y2,y3,y4]
	 * // Output-: [x1,y1,x2,y2,x3,y3,x4,y4] // brute force solution. int
	 * no_of_pairs = n; int result[] = new int[2 * n]; for (int i = 0; i <
	 * nums.length / 2; i++) { // you are going liner iteration on nums // ur
	 * filling result as needed in the output. result[2 * i] = nums[i];
	 * 
	 * // FILLING THE FIST HALF TO EVEN NUMBERED POSITIONS of entire result array
	 * 
	 * result[2 * i + 1] = nums[n + i];// FILLING THE SECOND HALF TO ODD NUMBERD
	 * POSITIONS // odd numberd also means the next consecutive element you can use
	 * this logic // also. } System.out.println(" "); for (int i = 0; i <
	 * result.length; i++) { System.out.println("Shuffeled array is -: " +
	 * result[i]); } return result; }
	 * 
	 * public static int maxWidthOfVerticalArea() { // They are simply confusing by
	 * telling you that it is vertical area // READ THE INSIGHTS DOWN BELOW TO
	 * UNDERSTAND THE ENTIRE PROBLEM.
	 * 
	 * // INSIGHTS-: to find the highest width size horizontally that is x // x axis
	 * Scanner scc = new Scanner(System.in); int lenn_rows; int lenn_cols;
	 * System.out.println("Enter the no of rows and coloumns"); lenn_rows =
	 * scc.nextInt(); lenn_cols = scc.nextInt(); int points[][] = new
	 * int[lenn_rows][lenn_cols];
	 * 
	 * System.out.println("Enter the elements of points matrix"); for (int i = 0; i
	 * < points.length; i++) { for (int j = 0; j < lenn_cols; j++) {
	 * 
	 * points[i][j] = scc.nextInt();
	 * 
	 * } } System.out.println("Displaying the  points matrix"); for (int i = 0; i <
	 * points.length; i++) { for (int j = 0; j < lenn_cols; j++) {
	 * 
	 * System.out.print(" " + points[i][j]); } } int arr[] = new int[points.length];
	 * 
	 * for (int i = 0; i < points.length; i++) { arr[i] = points[i][0];
	 * 
	 * } Arrays.sort(arr); int res = 0; for (int i = 1; i < arr.length; i++) { res =
	 * Math.max(res, arr[i] - arr[i - 1]);
	 * 
	 * } scc.close(); return res;
	 * 
	 * }
	 */

	 public static int maximumWealth() {
	        // returnig the largest sum of a row in a matrix
		 Scanner sc = new Scanner(System.in);
		
		 System.out.println("Enter the size of the colo and row");
		 int row = sc.nextInt();
		 int cols = sc.nextInt();
		 int[][] accounts = new int[row][cols];
		 System.out.println("Enter the elements inside the matrix");
		 for(int i=0;i<row; i++){
	            for(int j=0; j< cols; j++){
	                 
	                 accounts[i][j] = sc.nextInt();
	            }
	           
	        }
		
	        int max=0;
	        int sum=0;
	        int col = accounts[0].length;

	        for(int i=0;i<accounts.length; i++){
	            for(int j=0; j< col; j++){
	                 
	                sum= sum + accounts[i][j];
	            }
	            max = Math.max(sum, max);
	            sum=0;
	        }
	        System.out.println("RESULT-: "+ max);
	        return max;
	    }
	
	public static List<Integer> findindexofletter()
	{
		// FULL STRING INPUT BY SCANNER CLASS
		Scanner sc = new Scanner(System.in);
		int len;
		List<Integer> result = new ArrayList<>();
		System.out.println("Enter the length of the string array");
		System.out.println(" ");
		len = sc.nextInt();
		String strarr[] = new String[len];
		System.out.println("Enter the words inside and array");
		for (int i = 0; i < len; i++) {

			strarr[i] = sc.next();

		}

		System.out.println("Enter the character that you wish to check");
		String input = sc.next();
		char ch = input.charAt(0);

		for (int i = 0; i < len; i++) {
			if (strarr[i].indexOf(ch) != -1) {// meaning the req character is present
				result.add(i);
			}
		}
		System.out.println("Displaying the final result-: ");
		//for(int i=0;i< result.length; i++) {
			System.out.println(" " +result );
		//}
		sc.close();
		return result;

		
	}

	public static void main(String[] args) {
		int res;
		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.println("Enter the length OR number of Inputs " +
		 * "that you would like to store"); len = sc.nextInt(); int nums[] = new
		 * int[len]; int res[] = new int[len * 2]; int n = len / 2;
		 * System.out.println("Enter the element of the array"); for (int i = 0; i <
		 * len; i++) { nums[i] = sc.nextInt(); } res = getConcatenation(nums);
		 * System.out.println("Concatinated Array is "); for (int i = 0; i < len * 2;
		 * i++) { System.out.print(" " + res[i]); } res = shuffle(nums, len / 2);
		 */
		/*
		 * res = maxWidthOfVerticalArea(); System.out.println(" ");
		 * System.out.println("The RESULT for max width is " + res);
		 */
		
		//findindexofletter();
		maximumWealth();
		
		sc.close();

	}

}
