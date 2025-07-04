package Sorting;

import java.util.Arrays;

public class RecursiveInsertionSort {
    public int[] insertionSort(int[] nums) {
        return insertion(nums, 1, nums.length);
    }
    public int[] insertion(int[] nums, int i, int n){
        if (i >= n) return nums;
        int key = nums[i];
        int j = i-1;
        while(j >= 0 && nums[j] > key){
            nums[j+1] = nums[j];
            j--;
        }
        nums[j+1] = key;
        return insertion(nums, i+1, n);
    }
    public static void main(String args[]){
        int[] nums = {8,4,5,2,1};
        RecursiveInsertionSort sol = new RecursiveInsertionSort();
        int[] result = sol.insertionSort(nums);
        System.out.println(Arrays.toString(result));
    }
}