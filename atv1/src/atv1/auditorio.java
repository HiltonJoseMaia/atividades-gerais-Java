
package atv1;
import java.util.Scanner;

public class auditorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de convidados do evento:");
        int convidados = scanner.nextInt();

        if (convidados > 350 || convidados < 0) {
            System.out.println("Número de convidados inválido");
        } else if (convidados <= 150) {
            System.out.println("O auditório Alfa é o mais adequado.");
        } else if (convidados <= 220) {
            System.out.println("O auditório Alfa é o mais adequado. Serão necessárias " + (convidados - 150) + " cadeiras adicionais.");
        } else {
            System.out.println("O auditório Beta é o mais adequado.");
        }
    }
}

