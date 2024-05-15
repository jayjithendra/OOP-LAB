import java.util.Scanner;
public class StudentNumberFormat {
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name:");
        String name = sc.next();
        System.out.print("Enter Roll Number: ");
        int rollNumber = 0;
        try {
            rollNumber = Integer.parseInt(sc.next());
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input for Roll Number. Enter a numeric value.");
            return;
        }
        int[] marks = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter Marks in Subject " + (i + 1) + ": ");
            try {
                marks[i] = Integer.parseInt(sc.next());
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input for Marks. Enter a numeric value.");
                return;
            }
        }
        int totalMarks = marks[0]+marks[1]+marks[2];
        double percent = (double) totalMarks / 3;
        char grade;
        if(percent >=90){
            grade = 'A';
        }
        else if(percent>=80){
            grade = 'B';
        }
        else if(percent>=70){
            grade = 'C';
        }
        else if(percent>=60){
            grade = 'D';
        }
        else{
            grade = 'F';
        }
        System.out.println("Student Data:");
        System.out.println("Name:"+name);
        System.out.println("Roll Number:"+rollNumber);
        System.out.println("Marks of subject 1:"+marks[0]);
        System.out.println("Marks of subject 2:"+marks[1]);
        System.out.println("Marks of subject 3:"+marks[2]);
        System.out.println("Total Marks:"+totalMarks);
        System.out.println("Grade:"+grade);
    }
}
