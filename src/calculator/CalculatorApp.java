package calculator;
public class CalculatorApp {
    public static void main(String[] args) {
        // Создаем объекты комплексных чисел
        ComplexNumber num1 = new ComplexNumber(2, 3);
        ComplexNumber num2 = new ComplexNumber(1, 2);

        // Создаем объект калькулятора
        Calculator calculator = new Calculator();

        // Выполняем операции с комплексными числами
        ComplexNumber sum = calculator.add(num1, num2);
        ComplexNumber product = calculator.multiply(num1, num2);
        ComplexNumber quotient = calculator.divide(num1, num2);

        // Выводим результаты
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}