import java.util.Scanner;

public class MultipleChoiceQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] questions = {
            "What is the longest that an elephant has ever lived? (That we know of)",
            "Which animal do not make any sound?",
            "How many rings are on the Olympic flag?",
            "How many holes are on a standard bowling ball?",
            "How much cost of one Kilo Red Sandel Wood ?"
         };
        
        String[] options = {
            "A) 17yr   B) 49yr   C) 86yr   D) 105yr",
            "A) Elephant    B) Giraffe    C) Horse  D) Cow",
            "A) None     B) 3     C) 5   D) 7",
            "A) 5   B) 3   C) 4   D) 1",
            "A) 12000 B) 17000 C) 150000 D) 10000"
        };
        
        char[] answers = {'C', 'B', 'C', 'B','A'};
        
        int score = 0;
        
        System.out.println("Welcome to the Multiple-Choice Quiz!");
        
        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nQuestion " + (i + 1) + ":");
            System.out.println(questions[i]);
            System.out.println(options[i]);
            
            System.out.print("Your answer: ");
            char userAnswer = Character.toUpperCase(scanner.next().charAt(0));
            
            if (userAnswer == answers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is " + answers[i] + "\n");
            }
        }
        
        System.out.println("Quiz completed!");
        System.out.println("Your score: " + score + " out of " + questions.length);
        
        scanner.close();
    }
}
