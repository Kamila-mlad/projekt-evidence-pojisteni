package org.example;

import java.util.ArrayList;

/**
 *
 * @author Kamila Mládková
 */

public class EvidencePojistenych {
    
    // privátní kolekce typu PojistenaOsoba
    private ArrayList<PojistenaOsoba> seznamPojistenych = new ArrayList<>();

    // metoda pro přidání nové pojištěné osoby
    public void pridatPojisteneho(PojistenaOsoba novaOsoba) {

        this.seznamPojistenych.add(novaOsoba);
    }

    // metoda pro vypsání všech pojištěných
    public void vypisVsechnyPojistene() {
        System.out.printf("%-15s %-15s %-10s %-15s%n", "Jméno", "Příjmení", "Věk", "Telefon");  // Hlavička tabulky
        for (PojistenaOsoba osoba : seznamPojistenych) {
            System.out.println(osoba);
        }
    }

    // metoda pro vyhledání pojištěné osoby
    public void najdiPojistence(String hledaneJmeno, String hledanePrijmeni) {
        boolean osobaNalezena = false;

        for (PojistenaOsoba osoba : seznamPojistenych) {
            if (osoba.getJmeno().startsWith(hledaneJmeno) && osoba.getPrijmeni().startsWith(hledanePrijmeni)) {
                System.out.println(osoba);
                osobaNalezena = true;
            }
        }

        if (!osobaNalezena) {
            System.out.println("Hledaná osoba nebyla nalezena. Zkontrolujte zadané údaje a opakujte či zvolte jinou akci.");
        }
    }
}
