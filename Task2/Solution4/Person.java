package Task2.Solution4;

public class Person {
    public String name;
    public int age;

    Person (String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void printPerson() {
        System.out.println("NAME: " + name);
        System.out.println("AGE: " + age);
    }
}