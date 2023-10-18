import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.print("Digite o primeiro número: ");
            int parametroUm = terminal.nextInt();

            System.out.print("Digite o segundo número: ");
            int parametroDois = terminal.nextInt();

            try {
                contar(parametroUm, parametroDois);
            }catch (ParametrosInvalidosException exception) {
                System.err.println("Erro: " + exception.getMessage());
            }
        }
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm >= parametroDois) {
            System.out.println ("O segundo parâmetro deve ser maior que o primeiro.");

        }

        int contagem = parametroDois - parametroUm;
        for (int i = 0; i <= contagem; i++) {
            int numero = parametroUm + i;
            System.out.println(numero);
        }
    }
}
