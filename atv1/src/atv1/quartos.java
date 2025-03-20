
package atv1;
import java.util.Scanner;

class Hospede {
    String nome;
    int idade;
    double desconto;

    Hospede(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.desconto = (idade >= 60) ? 0.4 : 0.0;
    }
}

public class quartos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do primeiro cliente:");
        String nome1 = scanner.nextLine();
        System.out.println("Digite a idade do primeiro cliente:");
        int idade1 = scanner.nextInt();
        scanner.nextLine(); // consome a linha restante

        Hospede hospede1 = new Hospede(nome1, idade1);
        Hospede quartoA = hospede1;
        Hospede quartoB = null;

        System.out.println("Digite o nome do segundo cliente:");
        String nome2 = scanner.nextLine();
        System.out.println("Digite a idade do segundo cliente:");
        int idade2 = scanner.nextInt();

        Hospede hospede2 = new Hospede(nome2, idade2);

        if (hospede2.idade > hospede1.idade) {
            quartoA = hospede2;
            quartoB = hospede1;
        } else {
            quartoB = hospede2;
        }

        System.out.println("No quarto A: " + quartoA.nome + ", Desconto: " + (quartoA.desconto * 100) + "%");
        System.out.println("No quarto B: " + quartoB.nome);
    }
}