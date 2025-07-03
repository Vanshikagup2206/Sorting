package Sorting;

import java.util.Arrays;

public class RecursiveBubbleSort {
    public int[] bubbleSort(int[] nums) {
        return sort(nums, nums.length);
    }
    public int[] sort(int[] nums, int n){
        if(n == 1)
            return nums;

        for(int i = 0; i < n-1; i++){
            if(nums[i] > nums[i+1]){
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
            }
        }

        return sort(nums, n-1);
    }
    public static void main(String args[]){
        int[] nums = {7,4,1,5,3};
        RecursiveBubbleSort sol = new RecursiveBubbleSort();
        int[] result = sol.bubbleSort(nums);
        System.out.println(Arrays.toString(result));
    }
}
