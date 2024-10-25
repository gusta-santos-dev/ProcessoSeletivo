import java.util.Scanner;

public class Ocorrencias {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        // Solicita Ao Usuario uma string
        System.out.print("Informe uma string: ");
        String entrada = tec.nextLine();
        tec.close();
        
        // Variável para contar o número de ocorrências de 'a' ou 'A'
        int contador = 0;

        // Loop para percorrer a string e verificar a presença de 'a' ou 'A'
        for (int i = 0; i < entrada.length(); i++) {
            char caractere = entrada.charAt(i);
            if (caractere == 'a' || caractere == 'A') {
                contador++;
            }
        }

        // Exibe o resultado
        if (contador > 0) {
            System.out.println("A letra 'a' foi encontrada " + contador + " vezes.");
        } else {
            System.out.println("A letra 'a' não foi encontrada.");
        }
    }
}
