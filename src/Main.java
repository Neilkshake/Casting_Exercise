import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numeroPrimitivo = scanner.nextInt(); // Leitura do número como tipo primitivo

        Integer numeroWrapper = Integer.valueOf(numeroPrimitivo); // Conversão para o tipo wrapper

        System.out.println("Número em formato de wrapper: " + numeroWrapper);

        scanner.close();
    }
}