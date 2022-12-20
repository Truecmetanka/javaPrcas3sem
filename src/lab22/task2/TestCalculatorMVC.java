package lab22.task2;

public class TestCalculatorMVC {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorController controller = new CalculatorController(model, view);
    }
}

//калькулятор не в польской нотации (обычный калькулятор)