import java.util.Scanner;

public class questao02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero para verificar se pertence ou nao na sequencia de Fibonacci: ");
        int numeroInformado = scanner.nextInt();

        if (verificaFibonacci(numeroInformado)) {
            System.out.println("O numero " + numeroInformado + " pertence a sequencia de Fibonacci!");
        } else {
            System.out.println("O numero " + numeroInformado + " nao pertence a sequencia de Fibonacci!");
        }

        scanner.close();
    }
    public static boolean verificaFibonacci(int numero) {

        int a = 0; int b = 1;

        if (numero == a || numero == b) {
            return true;
        }

        while (b <= numero) {
            int var = a + b;
            a = b;
            b = var;

            //Verificando se o numero pertence a sequencia
            if (numero == b) {
                return true;
            }
        }
        return false;
    }
}

