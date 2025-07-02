import java.util.*;

class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return name + "(" + age + ")";
    }
}

public class CustomSortImplementation {
    public static void main(String[] args) {
        Person[] people = {
            new Person("Abhinav", 21),
            new Person("Vishal", 20),
            new Person("Rahul", 24),
            new Person("Abhishek", 19)
        };

        // Arrays.sort(people, (a, b) -> a.age - b.age);
        // Arrays.sort(people, (a, b) -> a.name.length() - b.name.length());
        Arrays.sort(people, (a, b) -> a.name.compareTo(b.name));

        System.out.println(Arrays.toString(people));
    }
}
