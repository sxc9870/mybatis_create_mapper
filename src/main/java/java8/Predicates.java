package java8;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class Predicates {

    public static void main(String[] args) {
        Predicate<String> predicate = (s) -> s.length() > 0;

        predicate.test("foo"); // true
        predicate.negate().test("foo"); // false

        Predicate<Boolean> nonNull = Objects::nonNull;
        Predicate<Boolean> isNull = Objects::isNull;

        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNotEmpty = isEmpty.negate();
        
        
        Function<String, Integer> toInteger = Integer::valueOf;
        System.out.println(  toInteger.apply("1234"));
        
        
        Function<String, String> backToString = toInteger.andThen(String::valueOf);

        System.out.println(backToString.apply("123")); // "123"
        
        Optional<String> optional = Optional.of("bam");

        optional.isPresent(); // true
        optional.get(); // "bam"
        optional.orElse("fallback"); // "bam"

        optional.ifPresent((s) -> System.out.println(s.charAt(0))); // "b"
    }

}
