package it.itis.cuneo;

import java.util.Calendar;

public class Brano {
    String titolo;
    int durata;

    public Brano() {
    }

    public Brano(String titolo, int durata) {
        this.titolo = titolo;
        this.durata = durata;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }
}
