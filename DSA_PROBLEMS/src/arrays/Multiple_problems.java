package arrays;


import java.util.Arrays;
import java.util.Scanner;

public class Multiple_problems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the length of the array
        System.out.print("Enter the length of the array: ");
        int n = scanner.nextInt();
        
        // Input the array elements
        int[] nums = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        // Input the target value
        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();
        
        // Call the countPairs method and print the result
        System.out.println("Number of pairs: " + countPairs(nums, target));
        
        scanner.close();
    }

    public static int countPairs(int[] nums, int target) {
        Arrays.sort(nums);
        int count = 0;
        int n = nums.length;
        int left = 0, right = n - 1;
        while (left < right) {
            if (nums[left] + nums[right] < target) {
                count += right - left;
                left++;
            } else {
                right--;
            }
        }
        return count;
    }
}
