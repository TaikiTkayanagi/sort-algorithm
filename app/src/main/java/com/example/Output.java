package com.example;

import java.util.Arrays;

public class Output {
    private final int[] array;

    public Output(int[] array) {
        this.array = array;
    }

    /**
     * 標準出力を行う
     */
    public void show() {
        Arrays.stream(array).forEach(v -> System.out.print(v + " "));
        System.err.println();
    }
}
