
package mvc;

/**
 *
 * @author Puerta
 */
public class Controller {

    private Model model;
    private View view;

    // Constructor que conecta el modelo y la vista
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // Ejecuta la logica de interaccion entre vista y modelo
    public void calculate() {
        // Obtiene los numeros de la vista
        int num1 = view.getFirstNumber();
        int num2 = view.getSecondNumber();

        // Usa el modelo para realizar la suma
        model.addNumbers(num1, num2);

        // Muestra el resultado en la vista
        view.displayResult(model.getResult());
    }
}
