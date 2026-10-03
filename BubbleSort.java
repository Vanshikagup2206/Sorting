package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public int[] bubbleSort(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = 0; j < nums.length - 1 - i; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }
    public static void main(String args[]){
        int[] nums = {8,4,5,2,1};
        BubbleSort sol = new BubbleSort();
        int[] result = sol.bubbleSort(nums);
        System.out.println(Arrays.toString(result));
    }
}
