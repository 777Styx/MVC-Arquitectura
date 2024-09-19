package mvc;

/**
 *
 * @author julli
 */
public class MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Crear el modelo, la vista y el controlador
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        // Ejecutar la lógica del controlador
        controller.calculate();
    }

}
