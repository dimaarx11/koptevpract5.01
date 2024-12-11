import java.lang.Math;
public class Task1 {    public static void main(String[] args) {
    double a = 0.1;
    double b = 1.4;        double alpha = 0.02;
    double z = 3 * Math.pow(10, -3);        double k = 4.5;
    double x = Math.exp(Math.sqrt(1 - a * Math.sin(b)));
    double numerator = a * k;
    double denominator = 4 * Math.log(alpha / z - z);        double y = numerator / denominator;
    System.out.println("Розрахунки:");
    System.out.println("x = " + x);        System.out.println("y = " + y);
}}