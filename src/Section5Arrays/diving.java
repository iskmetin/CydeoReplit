package Section5Arrays;

import java.util.Scanner;

public class diving {
    public static void main(String[] args) {
        //DO NOT TOUCH THE FOLLOWING LINES
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        //WRITE YOUR CODE HERE
        for (int i = 0; i < 7; i++) {
            System.out.println("Enter score for judge " + (i + 1) + ":");
            score[i] = input.nextFloat();
        }
        float total = 0;
        for (int i = 0; i < 7; i++) {
            if (score[i] == minBul(score) || score[i] == maxBul(score)) {
                continue;
            }
            total += score[i];
        }
        System.out.println("Enter the difficulty rating:");
        float difRating = input.nextFloat();
        System.out.println("Final Score: " + String.format("%.2f", total * 0.6 * difRating));


    }

    public static float maxBul(float[] arr) {
        float max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static float minBul(float[] arr) {
        float min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}

