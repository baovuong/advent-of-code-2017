package org.lv5.bvworks.adventofcode;

import org.junit.Test;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.*;

public class InverseCaptchaTest {

    @Test
    public void part11() throws Exception {
        assertEquals(3, InverseCaptcha.part1(("1122")));
    }

    @Test
    public void part12() throws Exception {
        assertEquals(4, InverseCaptcha.part1(("1111")));
    }

    @Test
    public void part13() throws Exception {
        assertEquals(0, InverseCaptcha.part1("1234"));
    }

    @Test
    public void part14() throws Exception {
        assertEquals(9, InverseCaptcha.part1("91212129"));
    }

    @Test
    public void acceptancePart1() throws Exception {
        URI uri = getClass().getClassLoader().getResource("org/lv5/bvworks/adventofcode/input1.txt").toURI();
        String fileString = new String(Files.readAllBytes(Paths.get(uri)), StandardCharsets.UTF_8);
        System.out.println(InverseCaptcha.part1(fileString));
    }

    @Test
    public void part21() {
        assertEquals(6, InverseCaptcha.part2("1212"));
    }

    @Test
    public void part22() {
        assertEquals(0, InverseCaptcha.part2("1221"));
    }

    @Test
    public void part23() {
        assertEquals(4, InverseCaptcha.part2("123425"));
    }

    @Test
    public void part24() {
        assertEquals(12, InverseCaptcha.part2("123123"));
    }

    @Test
    public void part25() {
        assertEquals(4, InverseCaptcha.part2("12131415"));
    }

    @Test
    public void acceptancePart2() throws Exception {
        URI uri = getClass().getClassLoader().getResource("org/lv5/bvworks/adventofcode/input1.txt").toURI();
        String fileString = new String(Files.readAllBytes(Paths.get(uri)), StandardCharsets.UTF_8);
        System.out.println(InverseCaptcha.part2(fileString));
    }
}