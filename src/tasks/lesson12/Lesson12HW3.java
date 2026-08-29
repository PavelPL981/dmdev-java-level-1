package tasks.lesson12;

/**
 * Даны два прямоугольных треугольника. Каждый из них задается двумя целочисленными переменными a и b - стороны треугольника.
 * Написать код, в котором вычисляется площадь каждого треугольника и затем эти площади сравниваются друг с другом.
 * Для этого понадобится написать 2 функции.
 * Первая: по двум сторонам прямоугольного треугольника возвращает его площадь.
 * Вторая: сравнивает переданные площади двух треугольников и выводит на консоль первый треугольник больше, меньше или равен второму.
 * Учитывать, что площадь может быть вещественным числом.
 */

public class Lesson12HW3 {

    public static void main(String[] args) {
        int a1 = 5;
        int b1 = 3;

        int a2 = 4;
        int b2 = 4;

        double square1 = square(a1, b1);
        double square2 = square(a2, b2);

        System.out.println("Площадь первого треугольника: " + square1);
        System.out.println("Площадь второго треугольника: " + square2);

        compare(square1, square2);
    }

    public static double square(int a, int b) {
        return (double) a * b / 2;
    }

    public static void compare(double square1, double square2) {
        if (square1 > square2) {
            System.out.println("Первый треугольник больше второго");
        } else if (square1 < square2) {
            System.out.println("Первый треугольник меньше второго");
        } else { System.out.println("Треугольники равны"); }
    }
}
