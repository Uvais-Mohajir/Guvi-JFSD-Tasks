package Task4.Solution2;

public class Voter {
    private String voterId;
    private String name;
    private int age;
    // Parameterized Constructor
    public Voter(String voterId, String name, int age) throws InvalidVoterAgeException {
        if (age < 18) {
            throw new InvalidVoterAgeException("Invalid age for voter. Must be 18 or above.");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }
    // Display method
    public void display() {
        System.out.println("\nVoter is Eligible to Vote.\nVoter Details:");
        System.out.println("Voter ID : " + voterId);
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

// Custom Exception for Invalid Voter Age
class InvalidVoterAgeException extends Exception {
    public InvalidVoterAgeException(String message) {
        super(message);
    }
}
