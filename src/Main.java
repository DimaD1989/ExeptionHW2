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
