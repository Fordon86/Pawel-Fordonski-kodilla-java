package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public static void beautify(String aaa, String bbb, PoemDecorator poemBeautifier) {
        String result = poemBeautifier.decorate(aaa, bbb);
        System.out.println(result);
    }
}
