import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many players?" +
                "");
        int playersNumber = scanner.nextInt();
        String [] playersName = new String[playersNumber];
        fillPlayersNameArray(playersNumber, playersName, scanner);
        System.out.println(playersName[2]);

    }

    public static void fillPlayersNameArray(int a, String[] playersName, Scanner scanner){

        for(int i = 0; i < a; i++){
            int playerNumber = i + 1;
            System.out.println("Player " + playerNumber + ": ");
            scanner.next();
            playersName[i] = scanner.nextLine();


        }
    }
}