import java.util.Scanner;

// Lê um número inteiro e converte o tipo primitivo para seu wrapper.
public class TarefaWrap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int valorPrimitivo = scanner.nextInt();

        Integer valorWrapper = Integer.valueOf(valorPrimitivo);

        System.out.println("Valor primitivo (int): " + valorPrimitivo);
        System.out.println("Valor wrapper (Integer): " + valorWrapper);

        scanner.close();
    }
}