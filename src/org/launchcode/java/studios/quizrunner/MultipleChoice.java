package org.launchcode.java.studios.quizrunner;
import java.util.ArrayList;
import java.util.Scanner;

public class MultipleChoice extends Question {

    private ArrayList<String> possibleAnswers;
    private int correctAnswer;

    public MultipleChoice(int pointValue, String text, int correctAnswer, ArrayList<String> possibleAnswers) {
        super(pointValue, text);
        this.correctAnswer = correctAnswer;
        this.possibleAnswers = possibleAnswers;
        setPointValue(1);
    }

    @Override
    public void displayAnswers() {
        for (int i = 0; i < possibleAnswers.size(); i++) {
            System.out.println(possibleAnswers.get(i));
        }
    }

    public boolean isCorrectAnswer(int possibleAnswer) {
        if (possibleAnswer == correctAnswer) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getAnswers() {
        Scanner userAnswer = new Scanner(System.in);
        System.out.println(
                "Enter the number of the option you think accurate. To select the first option, enter 1 and so on.");
        String userFinalAnswer = userAnswer.nextLine();
        int result = Integer.parseInt(userFinalAnswer);
        if (isCorrectAnswer(result)) {
            return 1;
        } else {
            return 0;
        }
    }

}
