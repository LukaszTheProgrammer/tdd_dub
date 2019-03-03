package pl.sda.czwa;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NameAggregator {

    public static Map<Character, List<String>> aggregate(List<String> names) {
        /*Map<Character, List<String>> result = new HashMap<>();
        for (String name : names) {
            char startingLetter = name.charAt(0);
            if (result.containsKey(startingLetter)) {
                List<String> subNames = result.get(startingLetter);
                subNames.add(name);
            } else {
                List<String> subNames = new ArrayList<>();
                subNames.add(name);
                result.put(startingLetter, subNames);
            }
        }*/

        Function<String, String> function = a -> a + "suffix";
        Function<String, String> function2 = NameAggregator::f;
        Function<Integer, Boolean> function3 = NameAggregator::isEven;

        return names.stream()
            .collect(Collectors.groupingBy(NameAggregator::getFirstLetterOf));
//        return result;
    }

    public static Character getFirstLetterOf(String s){
        return s.charAt(0);
    }

    public static Boolean isEven(Integer i){
        return i % 2 == 0;
    }

    //String -> String
    public static String f (String s){
        return s + "suffix";
    }
    //String -> int
    public int f2(String s){
        return s.length();
    }
}
