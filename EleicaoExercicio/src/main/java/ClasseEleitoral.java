public class ClasseEleitoral {
    public static void verificarClasseEleitoral(int idade) {
        if (idade < 16) {
            System.out.println("Não pode votar.");
        } else if ((idade >= 16 && idade <= 17) || idade > 65) {
            System.out.println("Voto facultativo.");
        } else {
            System.out.println("Voto obrigatório.");
        }
    }
}
