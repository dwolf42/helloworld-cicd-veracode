package de.ktc;
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println(sayHello("World"));
    }

    public static String sayHello(String wordToSay) {
        return "Hello, " + wordToSay + "!";
    }

}