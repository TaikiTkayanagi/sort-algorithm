package com.example;

public class QuickSort implements SortAlgorithm {
    /**
     * QuickSortで並び替えを行う
     * 
     * @param array 並び替える配列
     * @param left  並び替えを行う左側のindex
     * @param right 並び替えを行う右側のindex
     */
    public void sort(int[] array, int left, int right) {
        if (right <= left) {
            return;
        }

        int index = partition(array, left, right);
        sort(array, left, index - 1);
        sort(array, index, right);
    }

    /**
     * 配列の真ん中の値で分割を行う
     * 
     * @param array 配列
     * @param left  並び替えを行う左側のindex
     * @param right 並び替えを行う右側のindex
     * @return 次の右側ソートの開始index
     */
    private static int partition(int[] array, int left, int right) {
        int pivot = array[(left + right) / 2];

        while (left <= right) {
            while (pivot > array[left]) {
                left++;
            }
            while (array[right] > pivot) {
                right--;
            }

            if (left <= right) {
                swap(array, left, right);
                left++;
                right--;
            }

        }
        return left;
    }

    /**
     * 値の交換を行う
     * 
     * @param array 交換を行う配列
     * @param left  並び替えを行う左側のindex
     * @param right 並び替えを行う右側のindex
     */
    private static void swap(int[] array, int left, int right) {
        int tmp = array[left];
        array[left] = array[right];
        array[right] = tmp;
    }
}
