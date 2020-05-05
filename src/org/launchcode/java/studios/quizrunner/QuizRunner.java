package org.launchcode.java.studios.quizrunner;
import java.util.ArrayList;
import java.util.Arrays;


public class QuizRunner {
    public static void main(String[] args) {
        Quiz myQuiz = new Quiz(new ArrayList<>());
        TrueFalse newQuestion1 = new TrueFalse(1, "Puffins are the best animal in existence.", true);
        myQuiz.addQuestion(newQuestion1);
        ArrayList<String> possAns2 = new ArrayList<>(Arrays.asList("Lebron James", "Kyrie Irving", "Kawhi Leonard", "Joel Embiid", "Michael Jordan"));
        MultipleChoice newQuestion2 = new MultipleChoice(1, "Which NBA player has the best twitter game?", 4, possAns2);
        myQuiz.addQuestion(newQuestion2);
        ArrayList<String> possAns3 = new ArrayList<>(Arrays.asList("Deep Dish Pizza", "Lobster roll", "Cheesesteak", "Roast Pork Sandwich"));
        ArrayList<Integer> correctAns3 = new ArrayList<>(Arrays.asList(3, 4));
        Checkbox newQuestion3 = new Checkbox(2, "The best 'True Philadelphian' foods.", possAns3, correctAns3);
        myQuiz.addQuestion(newQuestion3);


        myQuiz.runQuiz();

        myQuiz.gradeQuiz();
    }

}
