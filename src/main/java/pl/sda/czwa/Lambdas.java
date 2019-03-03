package pl.sda.czwa;

import java.util.function.Function;

public class Lambdas {

    public static void main(String[] args) {
        //1. Zdefiniuj funkcję "A" która przyjmuje dowolny argument
        // i zwraca dowolny argument
        //Następnie zdefiniuj funckcje "B" o danej sygnaturze:
        // Function<I,O> -> O
        // Wywołaj funkcję "A" w funkcji "B"

        Integer r = run(Lambdas::lengthOfString);
        System.out.println(r);
    }

    private static Integer lengthOfString(String str){
        return str.length();
    }

    private static Integer run(Function<String, Integer> f){
        return f.apply("Napis");
    }
}
