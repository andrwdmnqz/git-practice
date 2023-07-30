public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        System.out.println(cal.sum(1.0, 2.0));
        System.out.println(cal.subtracting(15.0, 23.5));
        System.out.println(cal.multiplication(13.2, 23.1));
        System.out.println(cal.division(95.2, 18.0));
        System.out.println(cal.pow(3, 6));
        System.out.println(cal.sqrt(16));
    }
}