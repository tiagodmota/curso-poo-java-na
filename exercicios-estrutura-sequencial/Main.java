import java.util.Scanner;
import java.util.Locale;
import java.lang.Math;

public class Main {

	private static Scanner sc = new Scanner(System.in);
	private final static int INVALID_OPTION = (int) -1;
	private final static int CIRCUMFERENCE_AREA = (int) 1;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		sc.useLocale(Locale.US);
		Integer question = null;
		Character continueYesOrNo = null;
		do {
			question = Main.mainMenuChoose();
			switch (question) {
				case CIRCUMFERENCE_AREA:
					System.out.println();
					continueYesOrNo = Main.CircumferenceAreaProgram();
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
		System.out.println("Questão 1 - Area da Circunferência");
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

	private static char CircumferenceAreaProgram() {
		double circumferenceRadius = 0.0;
		final double PI = (double) 3.14159;

		System.out.print("Circumference radius: ");
		circumferenceRadius = sc.nextDouble();

		double circumferenceArea = (PI * Math.pow(circumferenceRadius, 2));

		System.out.printf("Circle's area: %.4f\n", circumferenceArea);
		return Main.continueYesOrNo();
	}
}
