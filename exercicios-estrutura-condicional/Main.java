import java.util.Scanner;
import java.util.Locale;

public class Main {

	private static Scanner sc = new Scanner(System.in);
	private final static int INVALID_OPTION = (int) -1;
	private final static int MULTIPLES = (int) 1;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		sc.useLocale(Locale.US);
		Integer question = null;
		Character continueYesOrNo = null;
		do {
			question = Main.mainMenuChoose();
			switch (question) {
				case MULTIPLES:
					System.out.println();
					continueYesOrNo = Main.multiples();
					break;
				default:
					System.out.printf("\nOpção inválida! Tente outra vez.\n\n");
					question = INVALID_OPTION;
					break;
			}
		} while (question == INVALID_OPTION ||
				continueYesOrNo == 's' || continueYesOrNo == 's');
		sc.close();
		System.out.println("\n\nENCERRADO.");
	}

	private static int mainMenuChoose()
	/* throws InputMismatchException */
	{
		int answer = INVALID_OPTION;
		System.out.println("Questão 1 - Múltiplos");
		System.out.print("Escolha: ");
		answer = sc.nextInt();
		return answer;
		/*
		 * boolean isNotDone;
		 * do {
		 * try {
		 * isNotDone = false;
		 * 
		 * } catch (InputMismatchException ex) {
		 * System.out.println("InputMismatchException by me.");
		 * isNotDone = true;
		 * }
		 * } while (isNotDone);
		 */
	}

	private static char continueYesOrNo() {
		char answer;
		System.out.printf("\n\nContinuar usando funções? (S/N): ");
		answer = sc.next().charAt(0);
		return answer;
	}

	private static char multiples() {
		int a, b, aux;
        System.out.println("Are x and y multiples? Type the operands: ");
        a = sc.nextInt();
        b = sc.nextInt();
        if (b > a) 
        {
            aux = a;
            a = b;
            b = aux;
        }
        boolean areMultiples = (a % b == 0);
        System.out.printf("Are %d and %d multiples? A: %b\n", a, b, areMultiples);
		return Main.continueYesOrNo();
	}
}
