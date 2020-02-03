package it.itis.cuneo;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.*;
import java.util.ArrayList;

@XmlRootElement(name = "Alto")
public class Hotel {

    public final static String PATH_NAME = "/Users/samuelegiraudo/Desktop/30EsercizioXmlHotel/src/Hotel2.xml";
    public final static String PATH_FILE = "/Users/samuelegiraudo/Desktop/30EsercizioXmlHotel/Hotel.csv";
    private ArrayList<Camera> aCamera;
    public static final String SEPARATOR =  ";";


    public Hotel() {
        aCamera = new ArrayList<>();
    }

    public Hotel(ArrayList<Camera> aCamera) {
        this.aCamera = aCamera;
    }

    public void addCamera(Camera camera){
        this.aCamera.add(camera);
    }

    public ArrayList<Camera> getaCamera() {
        return aCamera;
    }

    @XmlAttribute(name = "Monte")
    public void setaCamera(ArrayList<Camera> aCamera) {
        this.aCamera = aCamera;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "aCamera=" + aCamera +
                '}';
    }

    public String toXml(){
        String xml="";

        for(Camera camera : this.aCamera){
            xml += camera.toXml();
        }
        xml = "<percorso>\n" + xml + "</percorso>";
        return xml;
    }

    public void scriviXml(){
        BufferedWriter bw = null;
        try {
            //simulaPercorso();
            //apro file
            bw = new BufferedWriter(new FileWriter(PATH_NAME));
            bw.write(this.toXml());
            System.out.println(this.toXml());
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void marshallingXml() {
        try {
            File file = new File(Hotel.PATH_NAME);

            JAXBContext jaxbContext = JAXBContext.newInstance(Hotel.class);

            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(this, file);
            jaxbMarshaller.marshal(this, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

        public void unmarshallingXml(){
            try {
                File file = new File(Hotel.PATH_NAME);
                JAXBContext jaxbContext = JAXBContext.newInstance(Hotel.class);

                Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
                Hotel hotel = (Hotel) jaxbUnmarshaller.unmarshal(file);
                System.out.println(hotel);

            } catch (JAXBException e) {
                e.printStackTrace();
            }

        }

        private void simulaHotel() {
            Camera camera1 = new Camera(2,"si","si");;
            this.addCamera(camera1);
            Camera camera2 = new Camera(3,"si","no");;
            this.addCamera(camera2);
            Camera camera3 = new Camera(2,"si","si");;
            this.addCamera(camera3);
        }

    public void stampa() {
        System.out.println( this.toString() );
    }

    public void salvaCSV() {
        String str ="";
        BufferedWriter bw;
        try {
            //
            bw= new BufferedWriter(new FileWriter(PATH_FILE));

            for(int cntCamera=0; cntCamera<this.aCamera.size(); cntCamera++)
            {
                Camera camera = this.aCamera.get(cntCamera);
                bw.write(camera.toRowCsv());

            }

            bw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


        public static void main(String[] args) {
            Hotel hotel= new Hotel();
            hotel.simulaHotel();

            // hotel.scriviXml();

            hotel.marshallingXml();

            //hotel.unmarshallingXml();
        }

}
