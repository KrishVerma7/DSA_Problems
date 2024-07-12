//Q.2. Sort arrays having elements only 0,1 and 2
//Problem Description
//Given an array A[] consisting of only 0s, 1s, and 2s. The task is to sort the array, i.e., put all 0s first, then all 1s and all 2s in last.

//LEETCODE 75 - SORT COLORS

import java.util.Scanner;

public class July_09_Problem_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] nums = new int[size];

        System.out.println("Enter the elements of array only 0,1 and 2");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("original array : ");
        for (int i = 0; i < size; i++) {
            System.out.print(nums[i] + " ");
        }
        sortColors(nums);
        System.out.println("\nSorted array : ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void sortColors(int[] nums) {
        int left = 0, mid = 0, right = nums.length - 1;
        int temp;
        for (int i = 0; i < nums.length; i++) {
            if (nums[mid] == 0) {
                temp = nums[left];
                nums[left] = nums[mid];
                nums[mid] = temp;
                left++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else if (nums[mid] == 2) {
                temp = nums[mid];
                nums[mid] = nums[right];
                nums[right] = temp;
                right--;
            }
        }
    }
}

