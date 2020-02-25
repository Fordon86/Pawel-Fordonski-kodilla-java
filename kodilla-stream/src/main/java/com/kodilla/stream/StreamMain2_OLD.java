package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

import static com.sun.tools.javac.util.StringUtils.toLowerCase;
import static com.sun.tools.javac.util.StringUtils.toUpperCase;

public class StreamMain2_OLD {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println("Poem beautifier");
        PoemBeautifier.beautify("lalala", "cccc", ((aaa, bbb) -> toUpperCase(aaa + bbb) ));
        PoemBeautifier.beautify("lalala", "cccc",((aaa, bbb) -> "ABC" + aaa + bbb + "ABC"));
        PoemBeautifier.beautify("lalala", "cccc",((aaa, bbb) -> aaa + " : ) "  + bbb));
        PoemBeautifier.beautify("NEW", "tekst", ((aaa, bbb) -> "@ " +  toLowerCase(aaa) + "  " + toUpperCase(bbb) + " @." ));

        //STREAM
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

    }
}