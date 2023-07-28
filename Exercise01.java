/*
����������� �����, ������� ����������� � ������������ ���� �������� ����� (��� float), � ���������� �������� ��������.
���� ������ ������ ����� �� ������ ��������� � ������� ����������.
������ ����� ���������� �������� ��������� � ������������ ���� ������.
*/

import java.util.Scanner;

public class Exercise01 {
	public static void author() {
		System.out.println("/**********************************/");
		System.out.println("/******* ��������� �������: *******/");
		System.out.println("/** ���� \"Te3K@_PaynE\" ��������� **/");
		System.out.println("/***** 79811131773@yandex.ru ******/");
		System.out.println("/**********************************/");
	}
	
	public static float enterFloat() {
		Scanner scanner = new Scanner(System.in);
		float num;
		while (true) {
			System.out.println("������� ������� �����: ");
			if (scanner.hasNextFloat()) {
				num = scanner.nextFloat();
				break;
			} else {
				System.out.println("������! ������� ���������� ������� �����!");
				scanner.nextLine();
			}
		}
		return num;
	}
	
	
	public static void main(String[] args) {
		System.out.println("��������� ����������� �� ���� ������� �����.");
		System.out.println("���� ����� �����, ��������� ����������� ���� ��������.");
		
		float number = enterFloat();
		System.out.println("�������� �����: " + number);
		author();
	}
}