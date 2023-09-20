package functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


public class FunctionExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        Function<Integer,Integer> dobro = numero -> numero * 2;

        List<Integer> numerosDobrados = numeros.stream().map(dobro).toList();
        numerosDobrados.forEach(System.out::println);
    }
}
