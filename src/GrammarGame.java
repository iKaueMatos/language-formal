import java.util.Scanner;

public class GrammarGame {
    public void start() {
        String currentWord = "S";
        Scanner scanner = new Scanner(System.in);
        System.out.println("S -> sempre será o simbolo inicial (Ponto de partida)!");

        System.out.println("Bem-vindo ao jogo de gramática!");
        System.out.println("Palavra inicial: " + currentWord);

        while (currentWord.contains("S") || currentWord.contains("A")) {
            System.out.println("Palavra atual: " + currentWord);
            System.out.println("Escolha a regra para aplicar:");
            System.out.println("1: S → aA");
            System.out.println("2: S → bB");
            System.out.println("3: A → aa");
            System.out.println("4: A → ε (remover A)");
            System.out.println("5: B → bb");
            System.out.println("6: B → ε (remover B)");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    currentWord = currentWord.replaceFirst("S", "aA");
                    break;
                case 2:
                    currentWord = currentWord.replaceFirst("S", "bB");
                    break;
                case 3:
                    currentWord = currentWord.replaceFirst("A", "aa");
                    break;
                case 4:
                    currentWord = currentWord.replaceFirst("A", "");
                    break;
                case 5:
                    currentWord = currentWord.replaceFirst("B", "bb");
                    break;
                case 6:
                    currentWord = currentWord.replaceFirst("B", "");
                    break;
                default:
                    System.out.println("Escolha inválida.");
                    break;
            }

            System.out.println("Nova palavra: " + currentWord);
        }

        System.out.println("Palavra final: " + currentWord);
        scanner.close();
    }
}
