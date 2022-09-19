package br.com.letscode.java;

public class Functions {
    public static void main(String[] args) throws Exception {
        String name = "Carolina";
        greeting(name);

        int result = sum(2, 3);
        System.out.println(result);
    }

    public static void greeting (String parameterName) {
        System.out.println("Hello, " + parameterName);
    }

    public static int sum (int a, int b) {
        return a + b;
    }
}