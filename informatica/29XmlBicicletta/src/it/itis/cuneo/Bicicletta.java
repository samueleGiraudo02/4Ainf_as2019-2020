package it.itis.cuneo;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

@XmlRootElement
public class Bicicletta{
    public final static String PATH_NAME = "C:\\Users\\inf.giraudos1206\\Desktop\\29XmlBicicletta\\src\\bicicletta.xml";
    private String telaio;
    private String freno;
    private String cambio;
    private ArrayList<Bicicletta> aBicicletta;

    public Bicicletta() {
        aBicicletta = new ArrayList<>();
    }

    public Bicicletta(String telaio, String freno, String cambio, ArrayList<Bicicletta> aBicicletta) {
        this.telaio = telaio;
        this.freno = freno;
        this.cambio = cambio;
        this.aBicicletta = aBicicletta;
    }

    public void addRuota(Bicicletta bicicletta){
        aBicicletta.add(bicicletta);
    }

    @XmlElement(name = "telaio")
    public void setTelaio(String telaio) { this.telaio = telaio; }

    @XmlElement(name = "freno")
    public void setFreno(String freno) { this.freno = freno; }

    @XmlElement(name = "cambio")
    public void setCambio(String cambio) { this.cambio = cambio; }

    @XmlElement(name = "ruote")
    public void setaBicicletta(ArrayList<Bicicletta> aBicicletta) { this.aBicicletta = aBicicletta; }

    public ArrayList<Bicicletta> getaBicicletta() { return aBicicletta; }

    public String getFreno() { return freno; }

    public String getCambio() { return cambio; }

    public String getTelaio() { return telaio; }

    @Override
    public String toString() {
        return "Bicicletta{" +
                "telaio='" + telaio + '\'' +
                ", freno='" + freno + '\'' +
                ", cambio='" + cambio + '\'' +
                ", aBicicletta=" + aBicicletta +
                '}';
    }

    public String toXml() {
        String xml="";
        for(Bicicletta bicicletta : this.aBicicletta){
            xml += bicicletta.toXml();
        }
        xml = "<bicicletta>\n" + xml + "</bicicletta>";
        return xml;
    }

    public void scriviXml(){
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(PATH_NAME));
            bw.write(this.toXml());
            System.out.println(this.toXml());
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void marshallingXml(){
        try {
            File file = new File(Bicicletta.PATH_NAME);
            JAXBContext jaxbContext = JAXBContext.newInstance(Bicicletta.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(this, file);
            jaxbMarshaller.marshal(this, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }


    public void unmarshallingXml() {
        try {
            File file = new File(Bicicletta.PATH_NAME);
            JAXBContext jaxbContext = JAXBContext.newInstance(Bicicletta.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Bicicletta bicicletta = (Bicicletta) jaxbUnmarshaller.unmarshal(file);
            System.out.println(bicicletta);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }

    private void simula() {
        Bicicletta bicicletta1 = new Bicicletta("ATALA", "SHIMANO", "CAMPAGNOLA", aBicicletta);
        Ruote ruota1 = new Ruote ("anteriore", "posteriore");
        Bicicletta bicicletta2 = new Bicicletta("ATALA", "SHIMANO", "CAMPAGNOLA", aBicicletta);
        Ruote ruota2 = new Ruote("anteriore", "posteriore");
        Bicicletta bicicletta3 = new Bicicletta("ATALA", "SHIMANO", "CAMPAGNOLA", aBicicletta);
        Ruote ruota3 = new Ruote("anteriore", "posteriore");
    }

    public static void main(String[] args) {
        Bicicletta bicicletta = new Bicicletta();

        bicicletta.simula();
        bicicletta.scriviXml();

        //bicicletta.marshallingXml();
        //bicicletta.unMarshalling();
    }
}

