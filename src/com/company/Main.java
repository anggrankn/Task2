package com.company;
import com.sun.org.apache.xpath.internal.objects.XBoolean;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double r = readRadius();
        double c = readHypotenuse();
        displayResult(checkInscribedRadius(r, c));
    }

    public static boolean checkInscribedRadius(double r, double c) {
        double a = getSideA(c);
        return (r <= getMaxRadius(a, c));
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

    public static void displayResult(boolean result) {
        System.out.printf("Можно ли вписать: %b", result);
    }
    
    public static double getSideA(double c) {
        return c / Math.sqrt(2);
    }

    public static double getMaxRadius(double a, double c) {
        return (2 * a - c) / 2;
    }
}
