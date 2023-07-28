/*
Исправить код:

try {
	int d = 0;
	double catchedRes1 = intArray[8] / d;
	System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
	System.out.println("Catching exception: " + e);
}


1) Не задан массив. Непонятно, сколько элементов и какие они.
2) Вытекает из пункта 1) - intArray[8] необязательно существует.
	Поэтому возможен выход за пределы массива, и данную ошибку тоже нужно выявить.
3) В самом коде происходит постоянное деление на ноль.
	Код в любом случае будет приводить к ошибке.
*/

import java.util.Random;

public class Exercise02 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] intArray = new int[random.nextInt(10)];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = random.nextInt(10);
		}
		try {
			int d = 0;
			double catchedRes1 = intArray[8] / d;
			System.out.println("catchedRes1 = " + catchedRes1);
		} catch (ArithmeticException e) {
			System.out.println("Catching exception: " + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Catching exception: " + ex.getMessage());
		}
	}
}