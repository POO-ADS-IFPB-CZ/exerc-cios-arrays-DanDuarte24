import java.util.Scanner;

public class NumerosInteiros {
    public static void lerNumeros() {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int quantidade = 0;
        int soma = 0;

        while (true) {
            System.out.print("Digite um número inteiro (ou um número negativo para sair): ");
            numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }

            quantidade++;
            soma += numero;
        }

        if (quantidade > 0) {
            double media = (double) soma / quantidade;
            System.out.println("Quantidade de números digitados: " + quantidade);
            System.out.println("Média dos números digitados: " + media);
        } else {
            System.out.println("Nenhum número válido digitado.");
        }

        scanner.close();
    }
}
