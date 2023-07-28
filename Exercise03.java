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
		System.out.println("„то-то пошло не так...");
	} catch (NullPointerException ex) {
		System.out.println("”казатель не может указывать на null");
	} catch (IndexOutOfBoundsException ex) {
		System.out.println("ћассив выходит за пределы своего размера!");
	}
}

1) ќсновна€ проблема в том, что catch с Throwable будет выполн€тьс€ первым.
	» будет отлавливать все ошибки самосто€тельно.
	NullPointerException и IndexOutOfBoundsException не сработают, поскольку до них выполнение кода не дойдЄт.
2) отсутствие метода printSum(int a, int b), на мой взгл€д, не отлавливаетс€ Throwable и в любом случае будет крашить программу.
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
			System.out.println("”казатель не может указывать на null");
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("ћассив выходит за пределы своего размера!");
		} catch (Throwable ex) {
			System.out.println("„то-то пошло не так...");
		}
	}
}