package Task4.Solution1;

public class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        this.rollNo = rollNo;
        this.course = course;

        // Validate Age
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age not within range (15–21).");
        }
        this.age = age;

        // Validate Name (only alphabets & spaces allowed) using REGEX
        if (!"[a-zA-Z ]+".matches(name)) {
            throw new NameNotValidException("Name not valid. Only alphabets allowed.");
        }
        this.name = name;
    }

    // Display student details
    public void display() {
        System.out.println("\nStudent Details:");
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("Course  : " + course);
    }
}
// User-defined Exception for invalid age
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

// User-defined Exception for invalid name
class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}
