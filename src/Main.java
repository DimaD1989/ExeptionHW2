//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
// Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить
// у пользователя ввод данных

import java.util.Scanner;

public  class Main {

    public static void main(String[] args) {

    }
}

    public static floatNum(){
        System.out.println("\nВаедите число через запятую: ");
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        System.out.println("Вы ыыули: \n" + (num));
        return num;
    }
    /**
     * Задача 2.1
     * Исправить код, добавил массив
     */
    public static void task2() {
        try {
            int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 10};
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }

    /**
     * Задача 2.1 исправить код
     */
    public static void task2_2() {
        try {
            int a = 33;
            int b = 3;
            System.out.println(a / b);
            printSum(5, 12);
            int[] abc = {1, 2};
            abc[3] = 2;

        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

    /**
     * Задача 3
     *  Разработайте программу,
     *  которая выбросит Exception,
     *  когда пользователь вводит пустую строку.
     *  Пользователю должно показаться сообщение,
     *  что пустые строки вводить нельзя.
     * @return возвращает введённую строку
     */
    public static String task3() {
        System.out.println("\nВведите сообщение : ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println("Вы ввели: \n" + (str));
        if(str.isEmpty())
            throw new IllegalArgumentException("Пустые строки вводить нельзя!");
        return str;
    }

}
