package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double R = readRadius();
        double c = readHypotenuse();

        if (R > 0 && c > 0) {
            double a = getSideA(c);
            if (R <= getMaxRadius(a, c)) {
                System.out.println("Вписать можно.");
            } else {
                System.out.println("Вписать нельзя.");
            }
        }
    }

    public static double readRadius() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение радиуса треугольника: ");
        return scanner.nextDouble();
    }

    public static double readHypotenuse() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение гипотенузы треугольника: ");
        return scanner.nextDouble();
    }

    public static double getSideA(double c) {
        return c / Math.sqrt(2);
    }

    public static double getMaxRadius(double a, double c) {
        return (2 * a - c) / 2;
    }
}
