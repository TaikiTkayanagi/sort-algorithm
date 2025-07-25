package com.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class InputCsv {
    private final Path path;

    public InputCsv(Path path) {
        this.path = path;
    }

    /**
     * Input.csvファイルを読み込む
     * 
     * @return int配列
     * @throws IOException
     */
    public int[] read() throws IOException {
        final int ONE_LINE = 0;
        final String CSV_SEPARATOR = ",";
        String[] numbers = Files.readAllLines(path).get(ONE_LINE).split(CSV_SEPARATOR);
        return Arrays.stream(numbers).mapToInt(Integer::parseInt).toArray();
    }
}
