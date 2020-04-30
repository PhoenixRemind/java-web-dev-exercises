package exercises;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String newAliceText = "";
        String aliceText = "Alice was beginning to get very tired of sitting by her sister on the bank, and of " +
                "having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' thought " +
                "Alice 'without pictures or conversation?'";

        System.out.println("Please enter a term to search for in the text: ");
        String userSearch = input.nextLine();

        System.out.println("Is your term in the text: " + aliceText.toLowerCase().contains(userSearch.toLowerCase()));
        System.out.println("The index of your term is: " + aliceText.indexOf(userSearch));
        System.out.println("The length of your term is: " + userSearch.length());

        if (aliceText.contains(userSearch)) {
            String tempWord = userSearch + " ";
            newAliceText = aliceText.replaceAll(tempWord, "");
            tempWord = " " + userSearch;
            newAliceText = aliceText.replaceAll(tempWord, "");
        }
        System.out.println(newAliceText);
        input.close();
    }
}
