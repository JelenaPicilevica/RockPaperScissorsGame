import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

        String readiness = scan.nextLine();

        if (readiness.equals("yes")) {
            System.out.println("\nGreat");
            System.out.println("rock – paper – scissors, shoot!");
            String choice = scan.nextLine();
            String computerChoice = computerChoice();
            String result = result(choice,computerChoice);
            printResult(choice, computerChoice, result);
        } else {
            System.out.println("Darn, some other time...!");
        }

        scan.close();
    }


    public static String computerChoice() {
        double random = Math.random() * 3;
        int integer = (int)random;            // 0 - 2

        switch (integer){
            case 0: return "rock";
            case 1: return "paper";
            case 2: return "scissors";
            default: return " ";           //impossible
        }
    }


    public static String result(String yourChoice, String computerChoice) {
        String result = "";

        if ((yourChoice.equals("rock") && computerChoice.equals("scissors")) || (yourChoice.equals("paper") &&
                computerChoice.equals("rock")) || (yourChoice.equals("scissors") && computerChoice.equals("paper"))){
            result = "You win!";
        }else if ((computerChoice.equals("rock") && yourChoice.equals("scissors")) || (computerChoice.equals("paper") &&
                yourChoice.equals("rock")) || (computerChoice.equals("scissors") && yourChoice.equals("paper"))){
            result = "You lose!";
        }else if (yourChoice.equals(computerChoice)) {
            result = "It's a tie";
        }else{
            System.out.println("INVALID CHOICE");
            System.exit(0);
        }
            return result;
    }


    public static void printResult (String yourChoice, String computerChoice, String result){
        System.out.println("You chose: " + yourChoice);
        System.out.println("The computer chose: " + computerChoice);
        System.out.println(result);
    }

}
