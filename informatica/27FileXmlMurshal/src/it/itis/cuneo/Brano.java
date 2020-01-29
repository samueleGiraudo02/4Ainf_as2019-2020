package it.itis.cuneo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.Objects;

public class Brano {
    private String nome;
    private int durata;

    public Brano(String nome, int durata) {
        super();
        this.nome = nome;
        this.durata = durata;
    }
    public String getNome() {
        return nome;
    }

    @XmlAttribute
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getDurata() {
        return durata;
    }
    @XmlElement
    public void setDurata(int durata) {
        this.durata = durata;
    }

    @Override
    public String toString() {
        return "Brano [nome=" + nome + ", durata=" + durata + ",";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Brano brano = (Brano) o;
        return durata == brano.durata &&
                Objects.equals(nome, brano.nome);
    }

    public String toXml() {
        // /t per l'indentazione
        return  "\t<brano nome=\""+ nome + "\">\n" +
                "\t\t<durata>" + durata + "</durata>\n";
    }



}

