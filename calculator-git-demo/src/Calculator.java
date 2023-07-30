public class Calculator {

    public double sum(double a, double b) {
        return a + b;
    }
    public double subtracting(double a, double b) {
        return a - b;
    }
    public double multiplication(double a, double b) {
        return a * b;
    }
    public double division(double a, double b) {
        if (b != 0) {
            return a / b;
        }
        return -1;
    }
    public double pow(double a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * pow(a, b - 1);
    }
    public double sqrt(double a) {
        return Math.sqrt(a);
    }
}
