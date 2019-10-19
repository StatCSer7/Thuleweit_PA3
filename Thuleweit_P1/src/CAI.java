import java.security.SecureRandom;
import java.util.Scanner;

public class CAI {

    /* Get difficulty level for problems */
    public static int difficultyLevel(Scanner scnr) {
        System.out.println("Enter a difficulty level from 1 to 4.");
        System.out.println("1 is the easiest. 4 is the hardest.");
        return scnr.nextInt();
    }

    /* Get types of problems */
    public static int problemSet(Scanner scnr) {
        System.out.println("Enter 1 for addition problems.");
        System.out.println("Enter 2 for subtraction problems.");
        System.out.println("Enter 3 for multiplication problems.");
        System.out.println("Enter 4 for division problems.");
        System.out.println("Enter 5 for a mixture of problems.");
        return scnr.nextInt();
    }

    /* Decide what problems to do */
    public static void sendToProblems(int difficulty, int problems) {
        int correct = 0;

        /* Uses problems to determine what problem set to use */
        for (int i = 1; i <= 10; i++) {
            if (problems == 1) {
               correct += additionLevels(difficulty);
            }
            else if (problems == 2) {
               correct += subtractionLevels(difficulty);
            }
            else if (problems == 3) {
               correct += multiplicationLevels(difficulty);
            }
            else if (problems == 4) {
               correct += divisionLevels(difficulty);
            }
            else {
                correct += mixtureLevels(difficulty);
            }
        }

        /* Determines if student did well enough to proceed */
        if (correct > 7) {
            System.out.println("Congratulations, you are ready to go to the next level!");
        }
        else {
            System.out.println("Please ask your teacher for extra help.");
        }
    }

    /* Addition problems */
    public static int additionLevels(int difficulty) {
        Scanner scnr = new Scanner (System.in);
        SecureRandom rand = new SecureRandom();
        int value1;
        int value2;
        int answer;
        int userAnswer;

        /* Uses difficulty to determine how many digits the numbers should have */
        if (difficulty == 1) {
            value1 = rand.nextInt(9) + 1;
            value2 = rand.nextInt(9) + 1;
        }
        else if (difficulty == 2) {
            value1 = rand.nextInt(90) + 10;
            value2 = rand.nextInt(90) + 10;
        }
        else if (difficulty == 3) {
            value1 = rand.nextInt(900) + 100;
            value2 = rand.nextInt(900) + 100;
        }
        else {
            value1 = rand.nextInt(9000) + 1000;
            value2 = rand.nextInt(9000) + 1000;
        }
        answer = value1 + value2;

        System.out.println("How much is " + value1 + " plus " + value2 + "?");
        userAnswer = scnr.nextInt();

        if (answer == userAnswer) {
            correctResponse();
            return 1;
        }

        incorrectResponse();
        return 0;
    }

    /* Subtraction problems */
    public static int subtractionLevels(int difficulty) {
        Scanner scnr = new Scanner (System.in);
        SecureRandom rand = new SecureRandom();
        int value1;
        int value2;
        int answer;
        int userAnswer;

        /* Uses difficulty to determine how many digits the numbers should have */
        if (difficulty == 1) {
            value1 = rand.nextInt(9) + 1;
            value2 = rand.nextInt(9) + 1;
        }
        else if (difficulty == 2) {
            value1 = rand.nextInt(90) + 10;
            value2 = rand.nextInt(90) + 10;
        }
        else if (difficulty == 3) {
            value1 = rand.nextInt(900) + 100;
            value2 = rand.nextInt(900) + 100;
        }
        else {
            value1 = rand.nextInt(9000) + 1000;
            value2 = rand.nextInt(9000) + 1000;
        }
        answer = value1 - value2;

        System.out.println("How much is " + value1 + " minus " + value2 + "?");
        userAnswer = scnr.nextInt();

        if (answer == userAnswer) {
            correctResponse();
            return 1;
        }

        incorrectResponse();
        return 0;
    }

    /* Multiplication problems */
    public static int multiplicationLevels(int difficulty) {
        Scanner scnr = new Scanner (System.in);
        SecureRandom rand = new SecureRandom();
        int value1;
        int value2;
        int answer;
        int userAnswer;

        /* Uses difficulty to determine how many digits the numbers should have */
        if (difficulty == 1) {
            value1 = rand.nextInt(9) + 1;
            value2 = rand.nextInt(9) + 1;
        }
        else if (difficulty == 2) {
            value1 = rand.nextInt(90) + 10;
            value2 = rand.nextInt(90) + 10;
        }
        else if (difficulty == 3) {
            value1 = rand.nextInt(900) + 100;
            value2 = rand.nextInt(900) + 100;
        }
        else {
            value1 = rand.nextInt(9000) + 1000;
            value2 = rand.nextInt(9000) + 1000;
        }
        answer = value1 * value2;

        System.out.println("How much is " + value1 + " times " + value2 + "?");
        userAnswer = scnr.nextInt();

        if (answer == userAnswer) {
            correctResponse();
            return 1;
        }

        incorrectResponse();
        return 0;
    }

    /* Division problems */
    public static int divisionLevels(int difficulty) {
        Scanner scnr = new Scanner (System.in);
        SecureRandom rand = new SecureRandom();
        double value1;
        double value2;
        double answer;
        double userAnswer;

        /* Uses difficulty to determine how many digits the numbers should have */
        if (difficulty == 1) {
            value1 = 1.0 * rand.nextInt(9) + 1;
            value2 = 1.0 * rand.nextInt(9) + 1;
        }
        else if (difficulty == 2) {
            value1 = 1.0 * rand.nextInt(90) + 10;
            value2 = 1.0 * rand.nextInt(90) + 10;
        }
        else if (difficulty == 3) {
            value1 = 1.0 * rand.nextInt(900) + 100;
            value2 = 1.0 * rand.nextInt(900) + 100;
        }
        else {
            value1 = 1.0 * rand.nextInt(9000) + 1000;
            value2 = 1.0 * rand.nextInt(9000) + 1000;
        }
        answer = value1 / value2;

        System.out.println("How much is " + value1 + " divided by " + value2 + "?");
        userAnswer = scnr.nextDouble();

        if ((Math.abs(answer - userAnswer)) <= .0001) {
            correctResponse();
            return 1;
        }

        incorrectResponse();
        return 0;
    }

    /* Mix of all types of problems */
    public static int mixtureLevels(int difficulty) {
        SecureRandom rand = new SecureRandom();
        int problem = rand.nextInt(4) + 1;
        int correct;

        /* Takes a random number to determine which problem to ask */
        if (problem == 1) {
            correct = additionLevels(difficulty);
        }
        else if (problem == 2) {
            correct = subtractionLevels(difficulty);
        }
        else if (problem == 3) {
            correct = multiplicationLevels(difficulty);
        }
        else {
            correct = divisionLevels(difficulty);
        }

        return correct;
    }

    /* Produces response to correct answer */
    public static void correctResponse() {
        SecureRandom rand = new SecureRandom();
        int choice = rand.nextInt(5);

        switch (choice) {
            case 1:
                System.out.println("Correct. Great job!");
                break;
            case 2:
                System.out.println("Very good!");
                break;

            case 3:
                System.out.println("Amazing job!");
                break;

            case 4:
                System.out.println("Well done!");
                break;
        }
    }

    /* Produces response to incorrect answer */
    public static void incorrectResponse() {
        SecureRandom rand = new SecureRandom();
        int choice = rand.nextInt(5);

        switch (choice) {
            case 1:
                System.out.println("Incorrect.");
                break;
            case 2:
                System.out.println("Your answer was wrong.");
                break;

            case 3:
                System.out.println("You should look at that problem later.");
                break;

            case 4:
                System.out.println("Wrong.");
                break;
        }
    }

    /* Resets program and allows user to run program again */
    public static void goAgain() {
        Scanner scnr = new Scanner(System.in);
        char option;
        int difficulty;
        int problems;

        System.out.println("Would you like to continue?");
        System.out.println("Enter q to quit. Enter any other key to continue.");
        option = scnr.next().charAt(0);

        if (option != 'q') {
            difficulty = difficultyLevel(scnr);
            problems = problemSet(scnr);
            sendToProblems(difficulty, problems);
        }
        else {
            return;
        }

        goAgain();
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int difficulty = difficultyLevel(scnr);
        int problems = problemSet(scnr);
        sendToProblems(difficulty, problems);
        goAgain();
    }
}