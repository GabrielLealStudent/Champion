package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Campeao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os dados do primeiro campeão: ");

		System.out.print("Nome: ");
		String name = sc.next();
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		System.out.print("Armadura: ");
		int armor = sc.nextInt();
		System.out.println();

		System.out.println("Digite os dados do primeiro campeão: ");

		System.out.print("Nome: ");
		String name2 = sc.next();
		System.out.print("Vida inicial: ");
		int life2 = sc.nextInt();
		System.out.print("Ataque: ");
		int attack2 = sc.nextInt();
		System.out.print("Armadura: ");
		int armor2 = sc.nextInt();
		System.out.println();

		Champion champ, champTwo;

		champ = new Champion(name, life, attack, armor);
		champTwo = new Champion(name2, life2, attack2, armor2);

		System.out.print("Quantos turnos você deseja executar? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			if (champ.getLife() > 0 && champTwo.getLife() > 0) {
				champ.takeDamage(champTwo);
				champTwo.takeDamage(champ);
				System.out.println("Resultado do turno " + i + ":");
				System.out.println(champ.status());
				System.out.println(champTwo.status());
				System.out.println();

			} else {
				break;
			}
			
			System.out.println("FIM DO COMBATE");
		}

		sc.close();

	}

}
