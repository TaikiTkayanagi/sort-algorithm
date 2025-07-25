package com.example;

public class MergeSort implements SortAlgorithm {
    private static final int LEFT_INDEX = 0;
    private static final int MIN_ARRAY_SIZE = 1;

    /**
     * MergeSprtで並び替えを行う
     * 
     * @param array 並び替える配列
     * @param left  並び替行う左側のindex
     * @param right 並び替えを行う右側のindex
     */
    public void sort(int[] array, int left, int right) {
        if (array.length <= MIN_ARRAY_SIZE) {
            return;
        }
        int mid = (left + right) / 2;
        int[] leftArray = new int[mid + 1];
        for (int i = left; i <= mid; i++) {
            leftArray[i] = array[i];
        }
        int[] rightArray = new int[array.length - leftArray.length];
        for (int i = mid + 1; i <= right; i++) {
            rightArray[i - (mid + 1)] = array[i];
        }

        sort(leftArray, LEFT_INDEX, leftArray.length - 1);
        sort(rightArray, LEFT_INDEX, rightArray.length - 1);
        merge(array, leftArray, rightArray);
    }

    /**
     * 右配列と左配列のマージ行う
     * 
     * @param array      配列
     * @param leftArray  右配列
     * @param rightArray 左配列
     */
    private void merge(int[] array, int[] leftArray, int[] rightArray) {
        int arrayIndex = 0;
        int leftArrayIndex = 0;
        int rightArrayIndex = 0;
        while (leftArrayIndex < leftArray.length && rightArrayIndex < rightArray.length) {
            if (leftArray[leftArrayIndex] > rightArray[rightArrayIndex]) {
                array[arrayIndex++] = rightArray[rightArrayIndex++];
            } else {
                array[arrayIndex++] = leftArray[leftArrayIndex++];
            }
        }
        while (leftArrayIndex < leftArray.length) {
            array[arrayIndex++] = leftArray[leftArrayIndex++];
        }
        while (rightArrayIndex < rightArray.length) {
            array[arrayIndex++] = rightArray[rightArrayIndex++];
        }
    }
}
