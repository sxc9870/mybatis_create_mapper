package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import java8.Lambda.Person;

class Something {
    String startsWith(String s) {
        return String.valueOf(s.charAt(0));
    }
}

interface PersonFactory<P extends Person> {
    P create(String firstName, String lastName);
}

public class Lambda {
    @FunctionalInterface // 函数式接口
    interface Converter<F, T> {
        T convert(F from);
    }

    public static class Person {
        public String firstName;
        public String lastName;
        public int age;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        Person() {
        }

        Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        Person(String firstName, int age) {
            this.firstName = firstName;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        PersonFactory<Person> personFactory = Person::new;// 等价
                                                          // 用new的方法传到下面的那个工厂类
        PersonFactory<Person> personFactory2 = new PersonFactory<Person>() {
            @Override
            public Person create(String firstName, String lastName) {
                return new Person(firstName, lastName);
            }
        };

        Person person = personFactory.create("Peter", "Parker");

    }

    private static void lambdaFunction() {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });
        Collections.sort(names, (String a, String b) -> {
            return b.compareTo(a);
        });
        Collections.sort(names, (String a, String b) -> b.compareTo(a));
        Collections.sort(names, (a, b) -> b.compareTo(a));
    }

    private static Integer functionInterface() {
        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);// 等价
        Converter<String, Integer> converter2 = new Converter<String, Integer>() {
            @Override
            public Integer convert(String from) {
                return Integer.valueOf(from);
            }
        };// 等价
        Converter<String, Integer> converter3 = Integer::valueOf;// 等价
        Integer converted = converter3.convert("123");
        System.out.println(converted); // 123
        Something something = new Something();
        Converter<String, String> converter4 = something::startsWith;// 等价
        Converter<String, String> converter5 = new Converter<String, String>() {
            @Override
            public String convert(String from) {
                return something.startsWith(from);
            }
        };

        String converted2 = converter4.convert("Java");
        System.out.println(converted2); // "J"
        return converted;
    }
}
