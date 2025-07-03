package Sorting;

import java.util.Arrays;
public class InsertionSort {
    public int[] insertionSort(int[] nums) {
        for(int i = 1; i < nums.length; i++){
            int key = nums[i];
            int j = i-1;
            while(j >= 0 && nums[j] > key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
        return nums;
    }
    public static void main(String args[]){
        int[] nums = {8,4,5,2,1};
        InsertionSort sol = new InsertionSort();
        int[] result = sol.insertionSort(nums);
        System.out.println(Arrays.toString(result));
    }
}