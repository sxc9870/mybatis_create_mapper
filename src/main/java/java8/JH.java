package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Foo {
    String name;
    List<Bar> bars = new ArrayList<>();

    Foo(String name) {
        this.name = name;
    }
}

class Bar {
    String name;

    Bar(String name) {
        this.name = name;
    }
}

class MyThread extends Thread{
	
	@Override
	public void run() {
		super.run();
		System.out.println("1");
	}
}

public class JH {
    static List<Person> persons = Arrays.asList(new Person("Max", 18), new Person("Peter", 23),
            new Person("Pamela", 23), new Person("David", 12));

    public static void main(String[] args) {
    	Thread s=new Thread(new MyThread());
    	s.start(); 
    	
    	 
        List<Foo> foos2 = IntStream.range(0, 100).mapToObj(i -> (new Foo(i + "A"))).collect(Collectors.toList());

        // persons
        // .stream()
        // .reduce((p1, p2) ->{ System.out.println(p1.name+"|"+p2.name);
        // return p1.age > p2.age ? p1 : p2;})
        // .ifPresent(System.out::println); // Pamela
        //
        //
        //

        Person result = persons.stream().reduce(new Person("", 0), (p1, p2) -> {
            p1.age += p2.age;
            p1.name += p2.name;
            return p1;
        });

        System.out.format("name=%s; age=%s", result.name, result.age);

        Integer ageSum = persons.stream().reduce(0, (sum, p) -> sum += p.age, (sum1, sum2) -> sum1 + sum2);

        System.out.println(ageSum); // 76
        Integer ageSum2 = persons.stream().reduce(0, (sum, p) -> {
            System.out.format("accumulator: sum=%s; person=%s\n", sum, p);
            return sum += p.age;
        }, (sum1, sum2) -> {
            System.out.format("combiner: sum1=%s; sum2=%s\n", sum1, sum2);
            return sum1 + sum2;
        });

        // List<Foo> foos3 = IntStream.range(0, 4).mapToObj(i -> (new Foo(i +
        // "B"))).collect(Collectors.toList());

        // foos2.forEach(p -> System.out.println(p.name));
        // foos2.stream().flatMap(f -> foos3.stream()).forEach(b ->
        // System.out.println(b.name));
    }

    private static void map() {

        List<Foo> foos = new ArrayList<>();

        // create foos
        IntStream.range(1, 4).forEach(i -> foos.add(new Foo("Foo" + i)));

        // create bars
        foos.forEach(f -> IntStream.range(1, 4).forEach(i -> f.bars.add(new Bar("Bar" + i + " <- " + f.name))));
        foos.stream().forEach(b -> System.out.println(b.name));

        // 每个foo有3个bar
        foos.stream().flatMap(f -> f.bars.stream()).forEach(b -> System.out.println(b.name));

        // 等价
        // IntStream.range(1, 4) 循环123
        // .mapToObj(i -> new Foo("Foo" + i))每个循环加入一个对象
        // .peek(f -> IntStream.range(1, 4).mapToObj(i -> new Bar("Bar" + i +
        // "<" + f.name)).forEach(f.bars::add))
        // 每个foo对象加入3个 bars
        // flatMap类似于交际
        IntStream.range(1, 4).mapToObj(i -> new Foo("Foo" + i))
                .peek(f -> IntStream.range(1, 4).mapToObj(i -> new Bar("Bar" + i + "<" + f.name)).forEach(f.bars::add))
                .flatMap(f -> f.bars.stream()).forEach(b -> System.out.println(b.name));

        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.putIfAbsent(i, "val" + i);
        }
        map.forEach((id, val) -> System.out.println(val));

        // map.computeIfPresent(3, (num, val) -> val + num); //如果存在 则 KEY+VALUE
        // map.get(3); // val33
        //
        // map.containsKey(9); // true
        // map.computeIfPresent(9, (num, val) -> null);//如果存在则return null? 自动移除
        // map.containsKey(9); // false
        //
        // map.computeIfAbsent(23, num -> "val" + num);//不存在则put?
        // map.containsKey(23); // true
        //
        // map.computeIfAbsent(24, num -> "bam");//不存(or null)在则PUT ,否则不处理
        // System.out.println(map.get(24));
        // ; // val33

        // list();

        Collector<Person, StringJoiner, String> personNameCollector = Collector.of(() -> new StringJoiner(" | "), // supplier
                (j, p) -> j.add(p.name.toUpperCase()), // accumulator
                (j1, j2) -> j1.merge(j2), // combiner
                StringJoiner::toString); // finisher

        String names = persons.stream().collect(personNameCollector);

        System.out.println(names); // MAX | PETER | PAMELA | DAVID
        Map<Integer, List<Person>> personsByAge = persons.stream().collect(Collectors.groupingBy(p -> p.age));

        personsByAge.forEach((age, p) -> System.out.format("age %s: %s\n", age, p));
        Double averageAge = persons.stream().collect(Collectors.averagingInt(p -> p.age));

        System.out.println(averageAge); // 19.0

        IntSummaryStatistics ageSummary = persons.stream().collect(Collectors.summarizingInt(p -> p.age));

        System.out.println(ageSummary);

        String phrase = persons.stream().filter(p -> p.age >= 18).map(p -> p.name)
                .collect(Collectors.joining(" and ", "In Germany ", " are of legal age."));

        System.out.println(phrase);
        map.remove(3, "val3");// 移除key和value相同的
        System.out.println(map.get(13)); // val33

        map.remove(3, "val33");
        map.get(3); // null

        map.getOrDefault(42, "not found"); // not found
        System.out.println(map.get(9));// val9val9
        map.merge(9, "val9", (value, newValue) -> value.concat(newValue));
        System.out.println(map.get(9));
        ; // val9val9

        map.merge(9, "concat", (value, newValue) -> value.concat(newValue));
        map.get(9); // val9concat
    }

    private static void list() {
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd1");
        List<String> stringCollection2 = new ArrayList<>();
        stringCollection2.add("ddd2");
        stringCollection.stream().forEach(System.out::println);
        stringCollection.addAll(stringCollection2);

        stringCollection.stream().forEach(System.out::println);

        IntStream.range(0, stringCollection.size() - 1).forEach(System.out::println);
        Stream.of("a1", "a2", "a3").map(s -> s.substring(1)).mapToInt(Integer::parseInt).max()
                .ifPresent(System.out::println); // 3
        IntStream.range(1, 4).mapToObj(i -> "a" + i).forEach(System.out::println);
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");
        // 筛选
        // stringCollection.stream().filter((s) ->
        // s.startsWith("a")).forEach(System.out::println);
        // 排序 不改变原来的
        // stringCollection.stream().sorted().filter((s) ->
        // s.startsWith("a")).forEach(System.out::println);
        // map是一种操作,让镜像的list所有变大写
        stringCollection.stream().map(String::toUpperCase).sorted((a, b) -> b.compareTo(a))
                .forEach(System.out::println);
        boolean anyStartsWithA = stringCollection.stream().anyMatch((s) -> s.startsWith("a"));

        boolean allStartsWithA = stringCollection.stream().allMatch((s) -> s.startsWith("a"));

        boolean noneStartsWithZ = stringCollection.stream().noneMatch((s) -> s.startsWith("z"));
        long startsWithB = stringCollection.stream().filter((s) -> s.startsWith("b")).count();

        System.out.println(startsWithB); // 3

        Optional<String> reduced = stringCollection.parallelStream().sorted().reduce((s1, s2) -> s1 + "#" + s2);

        reduced.ifPresent(System.out::println);

        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList.stream().filter(s -> s.startsWith("c")).map(String::toUpperCase).sorted().forEach(System.out::println);

    }

}
