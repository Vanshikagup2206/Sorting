package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public int[] selectionSort(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int minIndex = i;
            for(int j = i+1; j < nums.length; j++){
                if(nums[j] < nums[minIndex]){
                    minIndex = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
        return nums;
    }
    public static void main(String args[]){
        int[] nums = {8,4,5,2,1};
        SelectionSort sol = new SelectionSort();
        int[] result = sol.selectionSort(nums);
        System.out.println(Arrays.toString(result));
    }
}