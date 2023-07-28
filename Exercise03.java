/*
public static void main(String[] args) throws Exception {
	try {
		int a = 90;
		int b = 3;
		System.out.println(a / b);
		printSum(23, 234);
		int[] abc = {1, 2};
		abc[3] = 9;
	} catch (Throwable ex) {
		System.out.println("���-�� ����� �� ���...");
	} catch (NullPointerException ex) {
		System.out.println("��������� �� ����� ��������� �� null");
	} catch (IndexOutOfBoundsException ex) {
		System.out.println("������ ������� �� ������� ������ �������!");
	}
}

1) �������� �������� � ���, ��� catch � Throwable ����� ����������� ������.
	� ����� ����������� ��� ������ ��������������.
	NullPointerException � IndexOutOfBoundsException �� ���������, ��������� �� ��� ���������� ���� �� �����.
2) ���������� ������ printSum(int a, int b), �� ��� ������, �� ������������� Throwable � � ����� ������ ����� ������� ���������.
*/

public class Exercise03 {
	public static void main(String[] args) throws Exception {
		try {
			int a = 90;
			int b = 3;
			System.out.println(a / b);
			printSum(23, 234);
			int[] abc = {1, 2};
			abc[1] = 9;
		} catch (NullPointerException ex) {
			System.out.println("��������� �� ����� ��������� �� null");
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("������ ������� �� ������� ������ �������!");
		} catch (Throwable ex) {
			System.out.println("���-�� ����� �� ���...");
		}
	}
}