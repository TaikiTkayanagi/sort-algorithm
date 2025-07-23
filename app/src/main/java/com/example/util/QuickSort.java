package com.example.util;

public class QuickSort {
    public static void sort(int[] array, int left, int right) {
        if (right <= left) {
            return;
        }

        int partitionIndex = partition(array, left, right);
        sort(array, left, partitionIndex);
        sort(array, partitionIndex + 1, right);
    }

    private static int partition(int[] array, int left, int right) {
        int pivotIndex = (left + right) / 2;
        int pivot = array[pivotIndex];

        while (right > left) {
            while (pivot > array[left]) {
                left++;
            }
            while (array[right] > pivot) {
                right--;
            }

            if (right > left) {
                swap(array, left, right);
                if (pivotIndex == left)
                    pivotIndex = right;
                else if (pivotIndex == right)
                    pivotIndex = left;
                left++;
                right--;
            }
        }
        return pivotIndex;
    }

    private static void swap(int[] array, int left, int right) {
        int tmp = array[left];
        array[left] = array[right];
        array[right] = tmp;
    }
}
