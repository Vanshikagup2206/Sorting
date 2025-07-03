package Sorting;

import java.util.Arrays;

class Solution {
    public int[] mergeSort(int[] nums) {
        if(nums.length <= 1)
            return nums;

        int mid = nums.length/2;
        int[] left = Arrays.copyOfRange(nums,0,mid);
        int[] right = Arrays.copyOfRange(nums,mid,nums.length);

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left,right);
    }
    public int[] merge(int[] left, int[] right){
        int i = 0, j = 0, k = 0;
        int[] result = new int[left.length + right.length];
        while(i < left.length && j < right.length){
            if(left[i] <= right[j])
                result[k++] = left[i++];
            else
                result[k++] = right[j++];
        }

        while(i < left.length)
            result[k++] = left[i++];

        while(j < right.length)
            result[k++] = right[j++];

        return result;
    }
    public static void main(String args[]){
        int[] nums = {7,4,1,5,3};
        Solution sol = new Solution();
        int[] result = sol.mergeSort(nums);
        System.out.println(Arrays.toString(result));
    }
}