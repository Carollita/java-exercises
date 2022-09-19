package br.com.letscode.java;

public class StringManipulation {
    public static void main(String[] args) throws Exception {
        String name = "Carolina";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.length());

        String anotherName = "carolina";
        System.out.println(name.equalsIgnoreCase(anotherName)); //true
        System.out.println(name.equals(anotherName)); //false
    }
}