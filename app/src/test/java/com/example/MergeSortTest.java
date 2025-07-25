package com.example;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import java.util.Random;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MergeSortTest {
    /**
     * 2つの値の並び替えのテスト
     */
    @ParameterizedTest
    @CsvSource({
            "1, 2",
            "2, 1"
    })
    public void sort12(int a, int b) {
        int[] actual = { a, b };
        int left = 0;
        int right = actual.length - 1;
        int[] expected = { 1, 2 };

        new MergeSort().sort(actual, left, right);

        assertArrayEquals(expected, actual);
    }

    /**
     * 3つの値の並び替えのテスト
     */
    @ParameterizedTest
    @CsvSource({
            "1, 2, 3",
            "1, 3, 2",
            "2, 1, 3",
            "2, 3, 1",
            "3, 1, 2",
            "3, 2, 1",
    })
    public void sort123(int a, int b, int c) {
        int[] actual = { a, b, c };
        int left = 0;
        int right = actual.length - 1;
        int[] expected = { 1, 2, 3 };

        new MergeSort().sort(actual, left, right);

        assertArrayEquals(expected, actual);
    }

    /**
     * 4つの値の並び替えのテスト
     */
    @ParameterizedTest
    @CsvSource({
            "1, 2, 3, 4",
            "1, 2, 4, 3",
            "1, 3, 2, 4",
            "1, 3, 4, 2",
            "1, 4, 2, 3",
            "1, 4, 3, 2",
            "2, 1, 3, 4",
            "2, 1, 4, 3",
            "2, 3, 1, 4",
            "2, 3, 4, 1",
            "2, 4, 1, 3",
            "2, 4, 3, 1",
            "3, 1, 2, 4",
            "3, 1, 4, 2",
            "3, 2, 1, 4",
            "3, 2, 4, 1",
            "3, 4, 1, 2",
            "3, 4, 2, 1",
            "4, 1, 2, 3",
            "4, 1, 3, 2",
            "4, 2, 1, 3",
            "4, 2, 3, 1",
            "4, 3, 1, 2",
            "4, 3, 2, 1"
    })
    public void sort1234(int a, int b, int c, int d) {
        int[] actual = { a, b, c, d };
        int left = 0;
        int right = actual.length - 1;
        int[] expected = { 1, 2, 3, 4 };

        new MergeSort().sort(actual, left, right);

        assertArrayEquals(expected, actual);
    }

    /**
     * ランダムの値のソートのテスト
     */
    @Test
    public void sortRandom() {
        int size = 50;
        int[] original = generateRandomArray(size);
        int[] expected = Arrays.copyOf(original, original.length);
        Arrays.sort(expected); // Java標準の正しいソート

        int[] actual = Arrays.copyOf(original, original.length);
        new MergeSort().sort(actual, 0, actual.length - 1);

        assertArrayEquals(expected, actual);
    }

    private int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = random.nextInt(10000) - 5000; // -5000〜4999の乱数
        }
        return result;
    }
}
