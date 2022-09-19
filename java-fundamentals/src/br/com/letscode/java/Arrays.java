package br.com.letscode.java;

public class Arrays {
    public static void main(String[] args) throws Exception {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        System.out.println("----- Array Numbers -----");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        String[] letters = new String[5];
        letters[0] = "A";
        letters[1] = "B";
        letters[2] = "C";
        letters[3] = "D";
        letters[4] = "E";

        System.out.println("----- Array Letters -----");
        for (int j = 0; j < letters.length; j++) {
            System.out.println(letters[j]);
        }

        String[] words = {"Banana", "Rice", "Computer", "Music", "Hotel"};

        System.out.println("----- Array Words -----");
        for (int k = 0; k < words.length; k++) {
            System.out.println(words[k]);
        }
    }
}