/*
Разработайте программу, который выбросит Exception,
когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение,
что пустые строки вводить нельзя.
*/

import java.util.Scanner;

public class Exercise04 {
	public static void author() {
		System.out.println("/**********************************/");
		System.out.println("/******* Программа создана: *******/");
		System.out.println("/** Илья \"Te3K@_PaynE\" Новичихин **/");
		System.out.println("/***** 79811131773@yandex.ru ******/");
		System.out.println("/**********************************/");
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Введите строку: ");
		String input = scanner.nextLine();
		
		if (input.isEmpty()) {
			throw new IllegalArgumentException("Внимание! Нельзя вводить пустые строки!");
		} else {
			System.out.println("Введена строка: " + input);
		}
		
		author();
	}
}