package mvc;

/**
 *
 * @author Puerta
 */
public class Model {

    // Almacenamos el resultado de la suma
    private int result;

    // Realiza la suma
    public void addNumbers(int num1, int num2) {
        result = num1 + num2;
    }

    // Obtener el resultado
    public int getResult() {
        return result;
    }
}
