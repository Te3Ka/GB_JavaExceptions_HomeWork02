/*
������������ ���������, ������� �������� Exception,
����� ������������ ������ ������ ������.
������������ ������ ���������� ���������,
��� ������ ������ ������� ������.
*/

import java.util.Scanner;

public class Exercise04 {
	public static void author() {
		System.out.println("/**********************************/");
		System.out.println("/******* ��������� �������: *******/");
		System.out.println("/** ���� \"Te3K@_PaynE\" ��������� **/");
		System.out.println("/***** 79811131773@yandex.ru ******/");
		System.out.println("/**********************************/");
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������� ������: ");
		String input = scanner.nextLine();
		
		if (input.isEmpty()) {
			throw new IllegalArgumentException("��������! ������ ������� ������ ������!");
		} else {
			System.out.println("������� ������: " + input);
		}
		
		author();
	}
}