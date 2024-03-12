import java.util.Scanner;

public class questao05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma string para inverter seus caracteres: ");
        String stringInformada = scanner.nextLine();

        String invertida = inverteString(stringInformada);

        System.out.println("A string invertida: " + invertida);

        scanner.close();
    }
    public static String inverteString(String string) {
        char[] caracteres = string.toCharArray(); //Convertendo pois nao e possivel modificar string

        //Trocando a posicao de cada caractere para poder inverter
        for (int i = 0; i < caracteres.length / 2; i++) {
            char var = caracteres[i];
            caracteres[i] = caracteres[caracteres.length - 1 - i];
            caracteres[caracteres.length - 1 - i] = var;
        }

        return new String(caracteres);
    }
}

