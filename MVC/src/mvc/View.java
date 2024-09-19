package mvc;

import java.util.Scanner;

/**
 *
 * @author Puerta
 */
public class View {

    private Scanner scanner = new Scanner(System.in);

    // Pedir el primer numero al usuario
    public int getFirstNumber() {
        System.out.print("Introduce el primer número: ");
        return scanner.nextInt();
    }

    // Pedir el segundo numero al usuario
    public int getSecondNumber() {
        System.out.print("Introduce el segundo número: ");
        return scanner.nextInt();
    }

    // Mostrar el resultado
    public void displayResult(int result) {
        System.out.println("El resultado de la suma es: " + result);
    }
}
