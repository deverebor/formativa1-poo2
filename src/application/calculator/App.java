package application.calculator;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(1.0, 2.0);
        
        calculator.sum();
        calculator.subtract();
        calculator.multiply();
        calculator.divide();
        
    }
}
