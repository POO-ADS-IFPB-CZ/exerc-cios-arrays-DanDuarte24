public class Fibonacci {
    public static void exibirFibonacci(int n) {
        int primeiro = 1, segundo = 1;
        System.out.print("Série de Fibonacci: " + primeiro + ", " + segundo);

        for (int i = 2; i < n; i++) {
            int proximo = primeiro + segundo;
            System.out.print(", " + proximo);
            primeiro = segundo;
            segundo = proximo;
        }

        System.out.println();
    }
}
