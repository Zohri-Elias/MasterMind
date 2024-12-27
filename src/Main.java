import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain;

        do {
            int[] secretSequence = new int[5];
            boolean allCorrect;

            for (int i = 0; i < secretSequence.length; i++) {
                secretSequence[i] = 1 + (int) (Math.random() * 9);
            }

            System.out.println("Séquence secrète (debug) : ");
            for (int num : secretSequence) {
                System.out.print(num + " ");
            }
            System.out.println();

            do {
                allCorrect = true;
                int[] propositionSequence = new int[5];
                System.out.println("\nFaites votre proposition (entrez 5 chiffres séparément) :");


                for (int i = 0; i < propositionSequence.length; i++) {
                    System.out.print("Proposition pour la position " + (i + 1) + " : ");
                    propositionSequence[i] = scanner.nextInt();

                    if (propositionSequence[i] == secretSequence[i]) {
                        System.out.println("Le chiffre à la position " + (i + 1) + " est correct !");
                    } else if (propositionSequence[i] == secretSequence[1]) {
                        System.out.println("Le chiffre est correct mais pas dans le bon emplacement !");
                    } else if (propositionSequence[i] == secretSequence[2]) {
                        System.out.println("Le chiffre est correct mais pas dans le bon emplacement !");
                    } else if (propositionSequence[i] == secretSequence[3]) {
                        System.out.println("Le chiffre est correct mais pas dans le bon emplacement !");
                    } else if (propositionSequence[i] == secretSequence[4]) {
                        System.out.println("Le chiffre est correct mais pas dans le bon emplacement !");
                    } else {
                        System.out.println("Le chiffre à la position " + (i + 1) + " est incorrect.");
                        allCorrect = false;
                    }
                }
                if (!allCorrect) {
                    System.out.println("\nVous n'avez pas trouvé toutes les positions. Essayez à nouveau !");
                }
            } while (!allCorrect);
            System.out.println("\nFélicitations ! Vous avez trouvé la séquence complète !");

            System.out.print("Voulez-vous rejouer ? (oui/non) : ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("oui");
        } while (playAgain);

        System.out.println("Merci d'avoir joué ! À bientôt !");
        scanner.close();
    }
}
