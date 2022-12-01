import java.util.Random;
import java.util.Scanner;

public record JoKenPo(
    Player user,
    Player IA,
    int rounds 
) {
    public void toPlay() {
        System.out.println("******** WELCOME, " + user.getName() + " ********");

        for(int i = 1; i <= rounds; i++){        
            int userChoise = userChoise();
            if (userChoise < 1 || userChoise > 3) {
                System.out.println("\nINVALID NUMBER, CHOISE 1, 2 OR 3 !!! ");
                System.out.println("POINT TO " + IA.getName() + "\n");
                IA.incrementScore();
                continue;
            }
            int iaChoise = iaChoise();
            System.out.println("\n" + userChoise + " X " + iaChoise + "\n");

            int result = userChoise - iaChoise;
            winnerRound(result);
        }
        finalResult();
    }

    private int iaChoise() {
        Random random = new Random();
        return random.nextInt(3) + 1; // to start with number one
    }

    private int userChoise() {
        // to be able to print emojis use this command in the terminal: chcp 65001
        Scanner scan = new Scanner(System.in);
        System.out.println("1 - ROCK \u270A");
        System.out.println("2 - PAPER \uD83D\uDD90\uFE0F");
        System.out.println("3 - SCISSORS \u270C\uFE0F");

        System.out.print("Inform your choice: ");
        return scan.nextInt();
    }
    

    private void winnerRound(int result) {
        String winnerRound;
        if(result == -1 || result == 2) {
            IA().incrementScore();
            winnerRound = IA().getName();
        } else {
            user().incrementScore();
            winnerRound = user.getName();
        }
        String roundResult = (result == 0) ? "TIE GAME!\n-----------------------------\n" : winnerRound.toUpperCase() + " WINNER THIS ROUND!\n-----------------------------\n";
        System.out.println(roundResult);
    }

    private void finalResult() {
        System.out.println("*****************************");
        Integer finalScoreUser = user.getScore();
        Integer finalScoreIA = IA.getScore();
        System.out.println("SCORE = " + user.getName() + ": " + finalScoreUser + " X " + IA.getName() + ": " + finalScoreIA);

        if(finalScoreUser == finalScoreIA) {
            System.out.println("\n!!! TIE GAME !!!");
        } else {
            String finalWinner = (finalScoreIA > finalScoreUser) ? IA.getName() : user.getName();
            System.out.println(finalWinner.toUpperCase() + " WINNER \uD83C\uDF89");
            System.out.println("*****************************");
        }
    }
}
