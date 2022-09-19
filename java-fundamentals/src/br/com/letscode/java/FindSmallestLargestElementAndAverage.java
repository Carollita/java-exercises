package br.com.letscode.java;

public class FindSmallestLargestElementAndAverage {
    public static void main(String[] args) throws Exception {
        int[] numbers = {9, 11, 6, 14, 20};
        int smallestNumber = numbers[0];
        int LargestNumber = numbers[0];
        int average = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallestNumber) {
                smallestNumber = numbers[i];
            }

            if (numbers[i] > LargestNumber) {
                LargestNumber = numbers[i];
            }

            average += numbers[i];
            //average = average + numbers[i];
        }
        System.out.println("Smallest Number: " + smallestNumber);
        System.out.println("Largest Number: " + LargestNumber);
        System.out.println("Average: " + average / numbers.length);
    }
}