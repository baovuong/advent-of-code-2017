package org.lv5.bvworks.adventofcode;

public class InverseCaptcha {
    public static int part1(String puzzleInput) {
        int sum = 0;
        for (int i=0; i<puzzleInput.length(); i++) {
            if (puzzleInput.charAt(i) == puzzleInput.charAt((i + 1) % puzzleInput.length())) {
                sum += puzzleInput.charAt(i) - '0';
            }
        }
        return sum;
    }

    public static int part2(String puzzleInput) {
        int sum = 0;
        for (int i=0; i<puzzleInput.length(); i++) {
            if (puzzleInput.charAt(i) == puzzleInput.charAt((i + puzzleInput.length() / 2) % puzzleInput.length())) {
                sum += puzzleInput.charAt(i) - '0';
            }
        }
        return sum;
    }
}
