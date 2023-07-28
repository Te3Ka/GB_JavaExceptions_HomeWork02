/*
Реализовать метод, который запрашивает у пользователя ввод дробного числа (тип float), и возвращает введённое значение.
Ввод текста вместо числа не должен приводить к падению приложения.
Вместо этого необходимо повторно запросить у пользователя ввод данных.
*/

import java.util.Scanner;

public class Exercise01 {
	public static void author() {
		System.out.println("/**********************************/");
		System.out.println("/******* Программа создана: *******/");
		System.out.println("/** Илья \"Te3K@_PaynE\" Новичихин **/");
		System.out.println("/***** 79811131773@yandex.ru ******/");
		System.out.println("/**********************************/");
	}
	
	public static float enterFloat() {
		Scanner scanner = new Scanner(System.in);
		float num;
		while (true) {
			System.out.println("Введите дробное число: ");
			if (scanner.hasNextFloat()) {
				num = scanner.nextFloat();
				break;
			} else {
				System.out.println("Ошибка! Введите корректное дробное число!");
				scanner.nextLine();
			}
		}
		return num;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Программа запрашивает на ввод дробное число.");
		System.out.println("Если введён текст, программа запрашивает ввод повторно.");
		
		float number = enterFloat();
		System.out.println("Введённое число: " + number);
		author();
	}
}