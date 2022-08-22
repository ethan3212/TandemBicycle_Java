package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TandemBicycleTest {
    @Test
    public void testCase1() {
        int[] redShirtSpeeds = new int[] {5, 5, 3, 9, 2};
        int[] blueShirtSpeeds = new int[] {3, 6, 7, 2, 1};
        boolean fastest = true;
        int expected = 32;
        var actual = Main.tandemBicycle(redShirtSpeeds, blueShirtSpeeds, fastest);
        assertEquals(expected, actual);
    }

    @Test
    public void testCase2() {
        int[] redShirtSpeeds = new int[] {5, 5, 3, 9, 2};
        int[] blueShirtSpeeds = new int[] {3, 6, 7, 2, 1};
        boolean fastest = false;
        int expected = 25;
        var actual = Main.tandemBicycle(redShirtSpeeds, blueShirtSpeeds, fastest);
        assertEquals(expected, actual);
    }

    @Test
    public void testCase3() {
        int[] redShirtSpeeds = new int[] {1, 2, 1, 9, 12, 3};
        int[] blueShirtSpeeds = new int[] {3, 3, 4, 6, 1, 2};
        boolean fastest = false;
        int expected = 30;
        var actual = Main.tandemBicycle(redShirtSpeeds, blueShirtSpeeds, fastest);
        assertEquals(expected, actual);
    }

    @Test
    public void testCase4() {
        int[] redShirtSpeeds = new int[] {1, 2, 1, 9, 12, 3};
        int[] blueShirtSpeeds = new int[] {3, 3, 4, 6, 1, 2};
        boolean fastest = true;
        int expected = 37;
        var actual = Main.tandemBicycle(redShirtSpeeds, blueShirtSpeeds, fastest);
        assertEquals(expected, actual);
    }

    @Test
    public void testCase5() {
        int[] redShirtSpeeds = new int[] {1, 2, 1, 9, 12, 3, 1, 54, 21, 231, 32, 1};
        int[] blueShirtSpeeds = new int[] {3, 3, 4, 6, 1, 2, 5, 6, 34, 256, 123, 32};
        boolean fastest = true;
        int expected = 816;
        var actual = Main.tandemBicycle(redShirtSpeeds, blueShirtSpeeds, fastest);
        assertEquals(expected, actual);
    }

    @Test
    public void testCase6() {
        int[] redShirtSpeeds = new int[] {1, 2, 1, 9, 12, 3, 1, 54, 21, 231, 32, 1};
        int[] blueShirtSpeeds = new int[] {3, 3, 4, 6, 1, 2, 5, 6, 34, 256, 123, 32};
        boolean fastest = false;
        int expected = 484;
        var actual = Main.tandemBicycle(redShirtSpeeds, blueShirtSpeeds, fastest);
        assertEquals(expected, actual);
    }

    @Test
    public void testCase7() {
        int[] redShirtSpeeds = new int[] {1};
        int[] blueShirtSpeeds = new int[] {5};
        boolean fastest = true;
        int expected = 5;
        var actual = Main.tandemBicycle(redShirtSpeeds, blueShirtSpeeds, fastest);
        assertEquals(expected, actual);
    }

    @Test
    public void testCase8() {
        int[] redShirtSpeeds = new int[] {1};
        int[] blueShirtSpeeds = new int[] {5};
        boolean fastest = false;
        int expected = 5;
        var actual = Main.tandemBicycle(redShirtSpeeds, blueShirtSpeeds, fastest);
        assertEquals(expected, actual);
    }

    @Test
    public void testCase9() {
        int[] redShirtSpeeds = new int[] {1, 1, 1, 1};
        int[] blueShirtSpeeds = new int[] {1, 1, 1, 1};
        boolean fastest = true;
        int expected = 4;
        var actual = Main.tandemBicycle(redShirtSpeeds, blueShirtSpeeds, fastest);
        assertEquals(expected, actual);
    }

    @Test
    public void testCase10() {
        int[] redShirtSpeeds = new int[] {1, 1, 1, 1};
        int[] blueShirtSpeeds = new int[] {1, 1, 1, 1};
        boolean fastest = false;
        int expected = 4;
        var actual = Main.tandemBicycle(redShirtSpeeds, blueShirtSpeeds, fastest);
        assertEquals(expected, actual);
    }

    @Test
    public void testCase11() {
        int[] redShirtSpeeds = new int[] {1, 1, 1, 1, 2, 2, 2, 2, 9, 11};
        int[] blueShirtSpeeds = new int[] {1, 1, 1, 1, 3, 3, 3, 3, 5, 7};
        boolean fastest = true;
        int expected = 48;
        var actual = Main.tandemBicycle(redShirtSpeeds, blueShirtSpeeds, fastest);
        assertEquals(expected, actual);
    }

    @Test
    public void testCase12() {
        int[] redShirtSpeeds = new int[] {1, 1, 1, 1, 2, 2, 2, 2, 9, 11};
        int[] blueShirtSpeeds = new int[] {1, 1, 1, 1, 3, 3, 3, 3, 5, 7};
        boolean fastest = false;
        int expected = 36;
        var actual = Main.tandemBicycle(redShirtSpeeds, blueShirtSpeeds, fastest);
        assertEquals(expected, actual);
    }

    @Test
    public void testCase13() {
        int[] redShirtSpeeds = new int[] {9, 8, 2, 2, 3, 5, 6};
        int[] blueShirtSpeeds = new int[] {3, 4, 4, 1, 1, 8, 9};
        boolean fastest = true;
        int expected = 49;
        var actual = Main.tandemBicycle(redShirtSpeeds, blueShirtSpeeds, fastest);
        assertEquals(expected, actual);
    }

    @Test
    public void testCase14() {
        int[] redShirtSpeeds = new int[] {9, 8, 2, 2, 3, 5, 6};
        int[] blueShirtSpeeds = new int[] {3, 4, 4, 1, 1, 8, 9};
        boolean fastest = false;
        int expected = 35;
        var actual = Main.tandemBicycle(redShirtSpeeds, blueShirtSpeeds, fastest);
        assertEquals(expected, actual);
    }

    @Test
    public void testCase15() {
        int[] redShirtSpeeds = new int[] {5, 4, 3, 2, 1};
        int[] blueShirtSpeeds = new int[] {1, 2, 3, 4, 5};
        boolean fastest = false;
        int expected = 15;
        var actual = Main.tandemBicycle(redShirtSpeeds, blueShirtSpeeds, fastest);
        assertEquals(expected, actual);
    }

    @Test
    public void testCase16() {
        int[] redShirtSpeeds = new int[] {5, 4, 3, 2, 1};
        int[] blueShirtSpeeds = new int[] {1, 2, 3, 4, 5};
        boolean fastest = true;
        int expected = 21;
        var actual = Main.tandemBicycle(redShirtSpeeds, blueShirtSpeeds, fastest);
        assertEquals(expected, actual);
    }

    @Test
    public void testCase17() {
        int[] redShirtSpeeds = new int[] {};
        int[] blueShirtSpeeds = new int[] {};
        boolean fastest = true;
        int expected = 0;
        var actual = Main.tandemBicycle(redShirtSpeeds, blueShirtSpeeds, fastest);
        assertEquals(expected, actual);
    }
}