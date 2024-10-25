import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        // Usuario informa um numero
        System.out.print("Informe um número: ");
        int numero = tec.nextInt();
        tec.close();

        // Variáveis iniciais da sequência de Fibonacci
        int Num1 = 0, Num2 = 1;
        int fibonacci = 0;

        // Calcula a sequência de Fibonacci até que o valor seja maior ou igual ao número informado
        while (fibonacci < numero) {
            fibonacci = Num1 + Num2;
            Num1 = Num2;
            Num2 = fibonacci;
        }

        // Verifica se o número pertence à sequência de Fibonacci
        if (fibonacci == numero || numero == 0) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }
}
