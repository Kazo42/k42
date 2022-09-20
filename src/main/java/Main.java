public class Main {
    public static void main(String[] args) {
        int i = 4;
        int j = 5;

        Calculator calculator = new Calculator();
        int result = calculator.addition(4, 5);
        System.out.println("Jeg forventer at resultatet bliver: " + result);
    }
}
