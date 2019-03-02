package pl.sda.czwa;

import java.util.Arrays;
import java.util.List;

public class VowelChecker {

    private static List<Character> vowels = Arrays.asList('a', 'e', 'o', 'y', 'i', 'u');

    public static boolean isVowel(char c) {
        return vowels.contains(c);
    }
}
