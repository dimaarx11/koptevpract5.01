import java.util.Scanner;
public class Task2 {    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введіть значення a: ");
    double a = scanner.nextDouble();
    System.out.print("Введіть значення b: ");        double b = scanner.nextDouble();
    System.out.print("Введіть значення x: ");
    double x = scanner.nextDouble();
    double result;
    if (x < -2) {            result = Math.sin(x);
    } else if (x == -2) {
        result = 2 * Math.exp(a * x) - 1;        } else if (x > -2 && x < 8) {
        result = Math.pow((b * x + 2 * a), -2);        } else {
        result = Double.NaN;            System.out.println("Невірне значення x.");
    }
    System.out.println("Результат f(x) = " + result);
    scanner.close();    }
}
