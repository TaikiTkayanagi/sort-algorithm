package com.example.util;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class QuickSortTest {
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

        QuickSort.sort(actual, left, right);

        assertArrayEquals(expected, actual);
    }

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

        QuickSort.sort(actual, left, right);

        assertArrayEquals(expected, actual);
    }

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

        QuickSort.sort(actual, left, right);

        assertArrayEquals(expected, actual);
    }
}
