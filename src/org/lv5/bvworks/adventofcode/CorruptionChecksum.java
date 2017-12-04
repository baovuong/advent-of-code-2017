package org.lv5.bvworks.adventofcode;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CorruptionChecksum {
    public static int part1(String puzzleInput) {
        List<SortedSet<Integer>> rows = new ArrayList<>();

        puzzleInput = puzzleInput.replace("\r", "");

        StringBuilder buffer = new StringBuilder();
        SortedSet<Integer> row = new TreeSet<>();

        for (int i=0; i<puzzleInput.length(); i++) {
            char c = puzzleInput.charAt(i);
            if (isNumber(c)) {
                buffer.append(c);
            } else if (buffer.length() > 0 && (c == ' ' || c == '\n')) {
                row.add(Integer.parseInt(buffer.toString()));
                buffer.setLength(0);
                if (c == '\n') {
                    rows.add(new TreeSet<>(row));
                    row.clear();
                }
            }
        }
        row.add(Integer.parseInt(buffer.toString()));
        rows.add(new TreeSet<>(row));

        return rows.stream()
                .mapToInt(r -> r.last() - r.first())
                .sum();
    }

    public static int part2(String puzzleInput) {
        List<SortedSet<Integer>> rows = new ArrayList<>();

        puzzleInput = puzzleInput.replace("\r", "");

        StringBuilder buffer = new StringBuilder();
        SortedSet<Integer> row = new TreeSet<>();

        for (int i=0; i<puzzleInput.length(); i++) {
            char c = puzzleInput.charAt(i);
            if (isNumber(c)) {
                buffer.append(c);
            } else if (buffer.length() > 0 && (c == ' ' || c == '\n')) {
                row.add(Integer.parseInt(buffer.toString()));
                buffer.setLength(0);
                if (c == '\n') {
                    rows.add(new TreeSet<>(row));
                    row.clear();
                }
            }
        }
        row.add(Integer.parseInt(buffer.toString()));
        rows.add(new TreeSet<>(row));

        return rows.stream()
                .map(r -> r.toArray(new Integer[r.size()]))
                .mapToInt(r -> {
                    // awful algorithm here
                    for (int i=0; i<r.length-1; i++) {
                        for (int j = i + 1; j < r.length; j++) {
                            if (r[j] % r[i] == 0)
                                return r[j] / r[i];
                        }
                    }
                    return 0;
                }).sum();
    }

    private static boolean isNumber(char c) {
        return (c >= '0') && (c <= '9');
    }
}
