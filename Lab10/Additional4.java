import java.util.Scanner;

class MarkOutOfBoundsException extends Exception {
    public MarkOutOfBoundsException(String message) {
        super(message);
    }
}

class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) throws MarkOutOfBoundsException {
        this.name = name;

        if (marks < 0 || marks > 100) {
            throw new MarkOutOfBoundsException("Marks must be between 0 and 100.");
        }

        this.marks = marks;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class Additional4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter marks: ");
        int marks = scanner.nextInt();

        try {
            Student student = new Student(name, marks);
            student.displayDetails();
        } catch (MarkOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
