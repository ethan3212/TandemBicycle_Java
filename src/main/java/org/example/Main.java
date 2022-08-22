package org.example;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] redShirtSpeeds = {5, 5, 3, 9, 2};
        int[] blueShirtSpeeds = {3, 6, 7, 2, 1};
        boolean fastest = true;
        System.out.println(tandemBicycle(redShirtSpeeds, blueShirtSpeeds, fastest));
    }

    // O(nLog(n)) time | O(1) space
    public static int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
        Arrays.sort(redShirtSpeeds);        // O(nLog(n)) time
        Arrays.sort(blueShirtSpeeds);       // O(mLog(m)) time
        if(fastest) {
            reverseOrder(redShirtSpeeds);       // O(n) time | O(1) space
        }
        int totalSpeed = 0;
        for(int i = 0; i < redShirtSpeeds.length; i++) {        // O(n) time
            totalSpeed += (Math.max(redShirtSpeeds[i], blueShirtSpeeds[i]));
        }
        return totalSpeed;
    }

    // O(n) time | O(1) space
    public static void reverseOrder(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while(left <= right) {      // O(n) time
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}