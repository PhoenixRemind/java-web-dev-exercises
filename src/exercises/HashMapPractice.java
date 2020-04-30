package exercises;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String studentName;

        System.out.println("Enter your students (or ENTER to finish)");

        do {
            System.out.print("Student: ");
            studentName = input.nextLine();

            if(!studentName.equals("")) {
                System.out.print("ID: ");
                Integer iD = input.nextInt();
                students.put(iD, studentName);

                input.nextLine();
            }
        }while(!studentName.equals(""));

        System.out.println("Class Roster: ");
        for(Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getValue() + "'s ID " + student.getKey());
        }
        System.out.println("Number of students in the class: " + students.size());
    }
}
