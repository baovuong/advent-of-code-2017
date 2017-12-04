package org.lv5.bvworks.adventofcode;

import org.junit.Test;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.*;

public class CorruptionChecksumTest {
    @Test
    public void part1() throws Exception {
        assertEquals(18, CorruptionChecksum.part1("5 1 9 5\n7 5 3\n2 4 6 8"));
    }

    @Test
    public void acceptancePart1() throws Exception {
        URI uri = getClass().getClassLoader().getResource("org/lv5/bvworks/adventofcode/input2.txt").toURI();
        String fileString = new String(Files.readAllBytes(Paths.get(uri)), StandardCharsets.UTF_8);
        System.out.println(CorruptionChecksum.part1(fileString));
    }

    @Test
    public void part2() throws Exception {
        assertEquals(9, CorruptionChecksum.part2("5 9 2 8\n9 4 7 3\n3 8 6 5"));
    }

    @Test
    public void acceptancePart2() throws Exception {
        URI uri = getClass().getClassLoader().getResource("org/lv5/bvworks/adventofcode/input2.txt").toURI();
        String fileString = new String(Files.readAllBytes(Paths.get(uri)), StandardCharsets.UTF_8);
        System.out.println(CorruptionChecksum.part2(fileString));
    }
}