import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que introduzca el primer número
        System.out.print("Introduce o primeiro número: ");
        double num1 = scanner.nextDouble();

        // Pedimos al usuario que introduzca el segundo número
        System.out.print("Introduce o segundo número: ");
        double num2 = scanner.nextDouble();

        // Sumamos los dos números
        double resultado = num1 + num2;

        // Imprimimos el resultado por consola
        System.out.println("O resultado é: " + resultado);
    }
}