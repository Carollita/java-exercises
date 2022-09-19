package br.com.letscode.java;

public class MultiplicationTable {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i <= 10; i++) {
            System.out.println("-------- TABUADA DO " + i + " --------");
            for (int j = 1; j <= 10; j++) {
                System.out.println(j + " x " + i + " = " + (j * i));
            }
        }
    }
}