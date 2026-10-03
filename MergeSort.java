package Sorting;

import java.util.Arrays;

class Solution {

    public int[] sortArray(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
        return arr;
    }

    void mergeSort(int[] arr, int left, int right) {

        if (left < right) {

            int mid = left + (right - left) / 2;

            // Sort left half
            mergeSort(arr, left, mid);

            // Sort right half
            mergeSort(arr, mid + 1, right);

            // Merge both sorted halves
            merge(arr, left, mid, right);
        }
    }

    void merge(int[] arr, int left, int mid, int right) {

        int i = left;
        int j = mid + 1;

        int[] temp = new int[right - left + 1];
        int k = 0;

        // Compare both halves
        while (i <= mid && j <= right) {

            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }

            k++;
        }

        // Remaining elements from left half
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        // Remaining elements from right half
        while (j <= right) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // Copy merged result back to original array
        for (int x = 0; x < temp.length; x++) {
            arr[left + x] = temp[x];
        }
    }
    public static void main(String args[]){
        int[] nums = {7,4,1,5,3};
        Solution sol = new Solution();
        int[] result = sol.sortArray(nums);
        System.out.println(Arrays.toString(result));
    }
}
