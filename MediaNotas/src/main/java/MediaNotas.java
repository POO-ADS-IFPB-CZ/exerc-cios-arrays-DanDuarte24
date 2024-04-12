public class MediaNotas {
    public static void calcularMediaNotas(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }

        double media = soma / notas.length;
        System.out.println("Média das notas: " + media);

        int acimaMedia = 0, abaixoMedia = 0;
        for (double nota : notas) {
            if (nota > media) {
                acimaMedia++;
            } else if (nota < media) {
                abaixoMedia++;
            }
        }

        System.out.println("Quantidade de notas acima da média: " + acimaMedia);
        System.out.println("Quantidade de notas abaixo da média: " + abaixoMedia);
    }
}
