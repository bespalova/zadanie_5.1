/**
 * Created by Yuliya on 23.11.2014.
 */
/*Задание 5.1:
Оформите задание 4.1 в виде метода:
public static String[] greet(String[] names)

Задание 4.1: Заполните массив String[] names именами и создайте массив String[] greetings с приветствиями.
Например, если names = {"Иван", "Петр"}, то greetings = {"Привет, Иван", "Привет, Петр"}.*/

import java.util.Scanner;

public class Metod1 {

    public static void main(String[] args) {

        System.out.println("Введите длину массива");

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            names[i] = "Иванов" + i;
        }

        String[] greetings = Metod1.greet(names, n);

        for (int i = 0; i < n; i++) {
            System.out.println(greetings[i]);
        }

    }

    public static String[] greet(String[] names, int n) {

        String[] greetings = new String[n];

        for (int i = 0; i < n; i++) {
            greetings[i] = "Привет, " + names[i];
        }
        return greetings;

    }

}