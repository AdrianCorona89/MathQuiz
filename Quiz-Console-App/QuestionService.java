import java.util.Scanner;

public class QuestionService {

    private final int NUMBER = 5;

    Question[] questions = new Question[NUMBER];
    String[] responses = new String[NUMBER];

    public QuestionService() {
        for (int i = 0; i < questions.length; ++i) {
            int random = (int) (Math.random() * 10); 
            if (i % 2 == 0) {
                questions[i] = new Question("What is " + (i+3) + " + " + random, (i+3) + random, random, 5, 7, (i+3) + random);
            }
            else if (i % 3 == 0) {
                questions[i] = new Question("What is " + (i*2) + " - " + random, i, random, (i*2) - random, 7, (i*2) - random);
            } else {
                questions[i] = new Question("What is " + (i*3) + " * " + random, i, random, 5, (i*3) * random, (i*3) * random);
            }
        }        
    }


    public void playQuiz() {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        for (Question q : questions) {
            // Printing each question with the possible answers
            System.out.println("Question number: " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println("Answers:\n" + q.getOpt1() + "\n" + q.getOpt2() + "\n" + q.getOpt3() + "\n" + q.getOpt4());

            // Taking input from the user
            responses[i++] = scanner.nextLine();
        }
        scanner.close();

        for (String a : responses) {
            System.out.println(a);
        }

    }

    public void printScore() {
        // Score starts with 0
        int score = 0;
        int i = 0;
        for (Question q : questions) {
            // Every time the actual answer matches the user answer, scores is incremented
            if (Integer.parseInt(responses[i++]) == q.getAnswer()) {
                ++score;
            }
        }

        // Display the results
        System.out.println("You have " + score + (score==1 ? " answer " : " answers ") + "correct!");
        System.out.println((score > 2 ? "Congratulations, you passed!" : "Sorry, you didn't pass!"));
    }   
}
