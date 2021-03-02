package com.exo.thomas;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class ExoThomasBis {

	public static void main(String[] args) {

		LocalDate ajd = LocalDate.now();
		Scanner clavier = new Scanner(System.in);

// Récupérer la date de naissance de l'utilisateur
		boolean validDate1 = false;
		int age1 = 0;

		while (!validDate1) {

			System.out.println("Entrez votre date de naissance (jj/mm/aaaa) :");

			String date1 = clavier.nextLine();
			String[] jma1 = date1.split("[/\\-.\\s]");

			int jour1 = Integer.parseInt(jma1[0]);
			int mois1 = Integer.parseInt(jma1[1]);
			int an1 = Integer.parseInt(jma1[2]);

//Calcul l'age de l'utilisateur

			try {
				LocalDate anniv1 = LocalDate.of(an1, mois1, jour1);
				age1 = Period.between(anniv1, ajd).getYears();
				validDate1 = true;
			} catch (Exception e) {
				System.err.println("Attention !!! Veuillez rentrer une date valide au format \"jj/mm/aaaa\"");
				validDate1 = false;
			}

		}

// Récupérer la date de naissance du père
		boolean validDate2 = false;
		int age2 = 0;

		while (!validDate2) {

			System.out.println("Entrez la date de naissance de votre p�re (jj/mm/aaaa) :");

			String date2 = clavier.nextLine();
			String[] jma2 = date2.split("[/\\-.\\s]");

			int jour2 = Integer.parseInt(jma2[0]);
			int mois2 = Integer.parseInt(jma2[1]);
			int an2 = Integer.parseInt(jma2[2]);

//Calcul l'age du père

			try {
				LocalDate anniv2 = LocalDate.of(an2, mois2, jour2);
				age2 = Period.between(anniv2, ajd).getYears();
				validDate2 = true;
			} catch (Exception e) {
				System.err.println("Attention !!! Veuillez rentrer une date valide au format \"jj/mm/aaaa\"");
				validDate2 = false;
			}

		}

// Récupérer la date de naissance de la mère
		boolean validDate3 = false;
		int age3 = 0;

		while (!validDate3) {

			System.out.println("Entrez la date de naissance de votre mère (jj/mm/aaaa) :");

			String date3 = clavier.nextLine();
			String[] jma3 = date3.split("[/\\-.\\s]");

			int jour3 = Integer.parseInt(jma3[0]);
			int mois3 = Integer.parseInt(jma3[1]);
			int an3 = Integer.parseInt(jma3[2]);

//Calcul l'age de la mère

			try {
				LocalDate anniv3 = LocalDate.of(an3, mois3, jour3);
				age3 = Period.between(anniv3, ajd).getYears();
				validDate3 = true;
			} catch (Exception e) {
				System.err.println("Attention !!! Veuillez rentrer une date valide au format \"jj/mm/aaaa\"");
				validDate3 = false;
			}
		}

//Affiche les ages et les calculs

		int diffPere = age2 - age1;
		int diffMere = age3 - age1;

		System.out.printf("Vous avez %d ans, votre père a %d ans et votre mère a %d ans.\n", age1, age2, age3);
		System.out.printf("Ce qui fait %d ans de différence avec votre père et %d ans avec votre mère.\n", diffPere,
				diffMere);

		if ((age1 * 2) - age2 <= 0) {
			System.out.printf("Votre père a eu le double de votre age en %d", (ajd.getYear() - age2) + (age1 * 2));
		} else {
			System.out.printf("Votre père aura le double de votre age en %d", (ajd.getYear() - age2) + (age1 * 2));
		}

	}

}