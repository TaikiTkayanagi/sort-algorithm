package com.example;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;

public class Main {
    private static final int SORT_ALGORITHM = 0;
    private static final String QUUICK_SORT = "q";
    private static final String INPUT_PATH = "/input.csv";
    private static final int LEFT_INDEX = 0;

    public static void main(String[] args) throws IOException, URISyntaxException {
        var input = new InputCsv(Path.of(Main.class.getResource(INPUT_PATH).toURI()));
        int[] array = input.read();
        SortAlgorithm sortAlgorithm;
        if (args[SORT_ALGORITHM].equals(QUUICK_SORT)) {
            sortAlgorithm = new QuickSort();
        } else {
            sortAlgorithm = new MergeSort();
        }
        sortAlgorithm.sort(array, LEFT_INDEX, array.length - 1);
        new Output(array).show();
    }
}