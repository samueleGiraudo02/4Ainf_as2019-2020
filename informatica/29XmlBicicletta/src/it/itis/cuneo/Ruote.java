package it.itis.cuneo;

import javax.xml.bind.annotation.XmlElement;
import java.util.Objects;

public class Ruote {
    private String ruota1;
    private String ruota2;

    public Ruote() {
    }

    public Ruote(String ruota1, String ruota2) {
        this.ruota1 = ruota1;
        this.ruota2 = ruota2;
    }

    public String getRuota1() {
        return ruota1;
    }

    @XmlElement(name = "ruota")
    public void setRuota1(String ruota1) {
        this.ruota1 = ruota1;
    }

    public String getRuota2() {
        return ruota2;
    }

    @XmlElement(name = "ruota")
    public void setRuota2(String ruota2) {
        this.ruota2 = ruota2;
    }

    @Override
    public String toString() {
        return "Ruote{" +
                "ruota1='" + ruota1 + '\'' +
                ", ruota2='" + ruota2 + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ruote ruote = (Ruote) o;
        return Objects.equals(ruota1, ruote.ruota1) &&
                Objects.equals(ruota2, ruote.ruota2);
    }

    public String toXml() {
        return "\t<ruote\">" +
                "\t\t<ruota>" + ruota1 + "</ruota>\n" +
                "\t\t<ruota>" + ruota2 + "</ruota>\n"+
                "\t</ruote>\n";
    }
}
