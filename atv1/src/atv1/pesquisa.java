
package atv1;
import java.util.Scanner;

public class pesquisa {
    private static final int MAX_HOSPEDES = 15;
    private static String[] hospedes = new String[MAX_HOSPEDES];
    private static int totalHospedes = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("1- Cadastrar; 2- Pesquisar; 3- Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1 -> cadastrar(scanner);
                case 2 -> pesquisar(scanner);
            }
        } while (opcao != 3);
    }

    private static void cadastrar(Scanner scanner) {
        if (totalHospedes >= MAX_HOSPEDES) {
            System.out.println("Máximo de cadastros atingido");
            return;
        }

        System.out.println("Informe o nome do hóspede:");
        String nome = scanner.nextLine();
        hospedes[totalHospedes] = nome;
        totalHospedes++;
    }

    private static void pesquisar(Scanner scanner) {
        System.out.println("Informe o nome do hóspede:");
        String nome = scanner.nextLine();

        for (int i = 0; i < totalHospedes; i++) {
            if (hospedes[i].equals(nome)) {
                System.out.println("Hóspede " + nome + " foi encontrado no índice " + i);
                return;
            }
        }

        System.out.println("Hóspede não encontrado");
    }
}