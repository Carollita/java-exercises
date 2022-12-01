import java.util.Scanner;

public class App {

    public static JoKenPo startGame() {
        System.out.println("******** Jo-Ken-Po ********\n");
        Scanner scan = new Scanner(System.in);
        System.out.print("Name: ");
        String playerName = scan.next().toUpperCase();

        Player user = new Player(playerName);
        Player IA = new Player("IA");

        System.out.println(playerName + ", choise the number of rounds: ");
        int numberRounds = scan.nextInt();

        return new JoKenPo(user, IA, numberRounds);
    }

    public static void main(String[] args) throws Exception {
        JoKenPo joKenPo = startGame();
        joKenPo.toPlay();
    }
}
