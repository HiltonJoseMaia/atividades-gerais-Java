package atv1;
import java.util.Scanner;

public class diaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor padrão da diária:");
        double diaria = scanner.nextDouble();
        scanner.nextLine();

        int gratuidades = 0;
        int meias = 0;
        double total = 0;

        while (true) {
            System.out.println("Digite o nome do hóspede ou 'PARE' para encerrar:");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("PARE")) {
                break;
            }

            System.out.println("Digite a idade do hóspede:");
            int idade = scanner.nextInt();
            scanner.nextLine();

            if (idade < 4) {
                gratuidades++;
                System.out.println(nome + " possui gratuidade");
            } else if (idade > 80) {
                meias++;
                total += diaria / 2;
                System.out.println(nome + " paga meia");
            } else {
                total += diaria;
            }
        }

        System.out.println("Quantidade de gratuidades: " + gratuidades);
        System.out.println("Quantidade de meias hospedagens: " + meias);
        System.out.println("Valor total: " + total);

        scanner.close();
    }
}