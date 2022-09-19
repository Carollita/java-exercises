package br.com.letscode.java;

public class BooleanOperators {
    public static void main(String[] args) throws Exception {
        boolean weekend = true;
        boolean sunnyDay = true;
        boolean goToTheBeach = weekend && sunnyDay;
        System.out.println(goToTheBeach);

        String message = weekend ? "It's weekend!" : "it's not the weekend";
        System.out.println(message);
    }
}

// && = and
// || = or