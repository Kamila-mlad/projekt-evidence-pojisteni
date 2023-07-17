package org.example;

/**
 *
 * @author Kamila Mládková
 */
public class PojistenaOsoba {

    /**
     * nastavení privátních atributů
     */
    private String jmeno;
    private String prijmeni;
    private int vek;
    private String telefonniKontakt;

    /**
     * Inicializuje instanci
     */
    public PojistenaOsoba (String jmeno, String prijmeni, int vek, String telefonniKontakt) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefonniKontakt = telefonniKontakt;
    }

    /**
     * Vrátí jméno
     *
     * @return jmeno
     */
    public String getJmeno() {
        return jmeno;
    }
    /**
     * Vrátí příjmení
     *
     * @return příjmení
     */
    public String getPrijmeni() {
        return prijmeni;
    }
    /**
     * Vrátí věk
     *
     * @return věk
     */
    public int getVek() {
        return vek;
    }
    /**
     * Vrátí tel. kontakt
     *
     * @return telefonní kontakt
     */
    public String getTelefonniKontakt() {
        return telefonniKontakt;
    }

    /**
     * Settery pro nastavení hodnot - věk a telefonní kontakt
     */
    public void setVek(int vek) {
        this.vek = vek;
    }
    public void setTelefonniKontakt(String telefonniKontakt) {

        this.telefonniKontakt = telefonniKontakt;
    }

    /**
     * Přepsaná metoda toString() pro vypsání informací o pojištěné osobě
     */
    @Override
    public String toString() {

        return String.format("%-15s %-15s %-10s %-15s", getJmeno(), getPrijmeni(), getVek(), getTelefonniKontakt());
    }
}
