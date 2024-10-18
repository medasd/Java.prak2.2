import java.util.HashSet;
import java.util.Scanner;

public class zd2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> usedWords = new HashSet<>();
        String lastWord = "";
        int playerTurn = 1;
        boolean isFirstTurn = true;
        boolean gameOver = false;

        System.out.println("start game.");

        while (!gameOver) {
            System.out.println("Ход игрока " + playerTurn + ": ");
            String word = scanner.nextLine().trim().toLowerCase();

            if (usedWords.contains(word)) {
                System.out.println("это слово уже было использовано игрок " + playerTurn + " проиграл.");
                gameOver = true;
                continue;
            }

            if (!isFirstTurn && word.charAt(0) != lastWord.charAt(lastWord.length() - 1)) {
                System.out.println("slovo должно начинаться с буквы '" + lastWord.charAt(lastWord.length() - 1) + "'. Игрок " + playerTurn + " проиграл.");
                gameOver = true;
                continue;
            }

            usedWords.add(word);
            lastWord = word;
            isFirstTurn = false;

            playerTurn = (playerTurn == 1) ? 2 : 1;
        }

        scanner.close();
    }
}
