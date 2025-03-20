
package atv1;
import java.util.Scanner;

public class tabela {
    private static final int ANDARES = 4;
    private static final int QUARTOS = 3;
    private static boolean[][] hotel = new boolean[ANDARES][QUARTOS];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta;

        do {
            System.out.println("Informe o andar (1 a 4) e o número do quarto (1 a 3):");
            int andar = scanner.nextInt() - 1;
            int quarto = scanner.nextInt() - 1;
            hotel[andar][quarto] = true;

            System.out.println("Deseja informar outra ocupação? (S/N)");
            resposta = scanner.next();
        } while (resposta.equalsIgnoreCase("S"));

        mostrarOcupacao();
    }

    private static void mostrarOcupacao() {
        for (int i = ANDARES - 1; i >= 0; i--) {
            for (int j = 0; j < QUARTOS; j++) {
                String ocupacao = hotel[i][j] ? "X" : " ";
                System.out.print("| " + ocupacao + " ");
            }
            System.out.println("|");
        }
    }
}