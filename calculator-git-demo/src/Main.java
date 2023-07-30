public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        cal.sum(1.0, 2.0);
        cal.subtracting(15.0, 23.5);
        cal.multiplication(13.2, 23.1);
        cal.division(95.2, 18.0);

        cal.pow(3, 6);
        cal.sqrt(16);
    }
}