import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite o primeiro parãmetro: ");
            int n1 = sc.nextInt();
            System.out.println("Digite o segundo parãmetro: ");
            int n2 = sc.nextInt();

            if (n1 > n2) {
                throw new ParametrosInvalidosException(n1, n2);

            }

            contar(n1, n2);

        } catch (ParametrosInvalidosException e) {
            System.err.println("Erro de entrada");
        }
        sc.close();
    }

    static void contar(int n1, int n2) {
        int interacoes = n2 - n1;
        for (int i = 0; i <= interacoes; i++) {
            System.out.println(("Imprimindo o numero " + i));
        }
    }
}