package it.itis.cuneo;

import javax.xml.bind.annotation.XmlElement;
import java.util.Objects;

public class Camera {
    private int letto;
    private String bagno;
    private String vista;

    public Camera() {
    }

    public Camera(int letto, String bagno, String vista) {
        this.letto = letto;
        this.bagno = bagno;
        this.vista = vista;
    }

    public int getLetto() {
        return letto;
    }

    @XmlElement
    public void setLetto(int letto) {
        this.letto = letto;
    }

    public String getBagno() {
        return bagno;
    }

    @XmlElement
    public void setBagno(String bagno) {
        this.bagno = bagno;
    }

    public String getVista() {
        return vista;
    }

    @XmlElement
    public void setVista(String vista) {
        this.vista = vista;
    }

    public String toXml() {
        return  "\t<camera letto=\""+ letto + "\">\n" +
                "\t\t<bagno>" + bagno + "</cordx>\n" +
                "\t\t<vista>" + vista + "</cordy>\n"+
                "\t</camera>\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Camera camera = (Camera) o;
        return letto == camera.letto &&
                Objects.equals(bagno, camera.bagno) &&
                Objects.equals(vista, camera.vista);
    }

    @Override
    public String toString() {
        return "Camera{" +
                "letto=" + letto +
                ", bagno='" + bagno + '\'' +
                ", vista='" + vista + '\'' +
                '}';
    }

    public String toRowCsv() {
        return "Articolo"+ Hotel.SEPARATOR + letto + Hotel.SEPARATOR  + bagno + Hotel.SEPARATOR  + vista + "\n";
    }
}
