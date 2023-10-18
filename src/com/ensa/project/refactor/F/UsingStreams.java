package com.ensa.project.refactor.F;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UsingStreams {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        List<String> prefixedNames = names.stream()
                .map(name -> "M." + name)
                .collect(Collectors.toList());

        System.out.println(prefixedNames); // ["M.Alice", "M.Bob", "M.Charlie"]

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenNumbers); // [2, 4, 6, 8, 10]

        List<String> words = Arrays.asList("Hello", "world", "this", "is", "an", "example");

        String sentence = String.join(" ", words);

        System.out.println(sentence); // "Hello world this is an example"

        List<String> namesList = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        String result = namesList.stream()
                .map(name -> "M." + name)
                .filter(name -> name.length() > 5)
                .collect(Collectors.joining(", "));

        System.out.println(result); // "M.Charlie, M.David"
    }
}
