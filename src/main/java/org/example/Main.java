package org.example;

import java.util.Scanner;

/**
 *
 * @author Kamila Mládková
 */

public class Main {
    public static void main(String[] args) {

        EvidencePojistenych evidence = new EvidencePojistenych();
        Scanner scanner = new Scanner(System.in, "UTF-8");
        System.out.println("---------------------------");
        System.out.println("Evidence pojištěných");
        System.out.println("---------------------------");
        String volba = "";
        // hlavní cyklus
        while (!volba.equals("4")) {
            System.out.println("Vyberte si akci:");
            System.out.println("1 - Přidat nového pojištěného");
            System.out.println("2 - Vypsat všechny pojištěné");
            System.out.println("3 - Vyhledat pojištěného");
            System.out.println("4 - Konec");
            volba = scanner.nextLine();
            // reakce na volbu
            switch (volba) {
                case "1":
                    // Přidání pojištěné osoby
                    System.out.println("Zadejte jméno pojištěného: ");
                    String jmeno = scanner.nextLine();
                    System.out.println("Zadejte příjmení:");
                    String prijmeni = scanner.nextLine();
                    System.out.println("Zadejte telefonní číslo:");
                    String telefonniKontakt = scanner.nextLine();
                    System.out.println("Zadejte věk:");
                    int vek = Integer.parseInt(scanner.nextLine());
                    // Vytvoření nové instance třídy PojistenaOsoba
                    PojistenaOsoba novaOsoba = new PojistenaOsoba(jmeno, prijmeni, vek, telefonniKontakt);
                    evidence.pridatPojisteneho(novaOsoba);
                    System.out.println("Data byla uložena. Pokračujte libovolnou klávesou...");
                    break;
                case "2":
                    // Zobrazení seznamu pojištěných osob
                    evidence.vypisVsechnyPojistene();
                    System.out.println("Pokračujte libovolnou klávesou...");
                    break;
                case "3":
                    // Vyhledání pojištěné osoby podle jména a příjmení
                    System.out.println("Zadejte jméno pojištěného: ");
                    String hledaneJmeno = scanner.nextLine();
                    System.out.println("Zadejte příjmení:");
                    String hledanePrijmeni = scanner.nextLine();
                    evidence.najdiPojistence(hledaneJmeno, hledanePrijmeni);
                    System.out.println("Pokračujte libovolnou klávesou...");
                    break;
                case "4":
                    // Program se ukončí
                    System.out.println("Ukončení programu.");
                    break;
                default:
                    System.out.println("Neplatná volba, stiskněte libovolnou klávesu a opakujte volbu.");
                    break;
            }
        }
    }
}