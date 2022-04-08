package application.calculator;

/*
* Crie uma classe calculadora
* que realize as quatro operações matemáticas entre dois valores,
* Subdivida as operações em diferentes métodos.
* Na classe principal (main),
* utilize as quatro operações imprimindo o resultado em tela.
* Use construtores para as 4 operações.
* */

public class Calculator {
    private final double numberOne;
    private final double numberTwo;
    
    public Calculator(double numberOne, double numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        
    }
    
    public void sum(){
        double result = numberOne + numberTwo;
        System.out.println("O resultado da soma é: " + result);
    }
    
    public void subtract(){
        double result = numberOne - numberTwo;
        System.out.println("O resultado da subtração é: " + result);
    }
    
    public void multiply(){
        double result = numberOne * numberTwo;
        System.out.println("O resultado da multiplicação é: " + result);
    }
    
    public void divide(){
        double result = numberOne / numberTwo;
        System.out.println("O resultado da divisão é: " + result);
    }
}
