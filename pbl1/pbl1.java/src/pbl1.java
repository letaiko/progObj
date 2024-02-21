import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

// funções
public class pbl1{
    public static void main(String[] args) {
        // variáveis
        Scanner scanner = new Scanner(System.in); // input
        System.out.println("Digite o tamanho da lista: ");
        int tamanho = scanner.nextInt(); // lê int do input

        ArrayList<Integer> lista = new ArrayList<>(); // lista
        Random random = new Random();
        for (int i = 0; i < tamanho; i++) {
            lista.add(random.nextInt(100)); // números inteiros aleatórios até 100
        }

        System.out.println("Lista: " + lista); // print a lista aleatória
    
        System.out.println("- - - - Resultado - - - -");

        // print infos de cada número da lista
        for (int num : lista) {
            System.out.print(num + " - ");
            if (num % 3 == 0) {
                System.out.print("é número múltiplo de três!");
            }
            else if (num % 2 == 0) {
                System.out.print("é número par!");
            }
            else {
                System.out.print("é número ímpar!");
            }
            System.out.println();
        }
    }
}