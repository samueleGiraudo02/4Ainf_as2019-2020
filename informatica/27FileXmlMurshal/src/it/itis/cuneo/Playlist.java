package it.itis.cuneo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Playlist {

    public static final String FILE_NAME = ".\\src\\brani.xml";
    private List<Brano> aPlaylist;

    public Playlist() {
        super();
        aPlaylist = new ArrayList<Brano>();
    }

    public void addBrano(Brano brano){

        aPlaylist.add(brano);
    }

    public List<Brano> getaPlaylist() {
        return aPlaylist;
    }

    @XmlElement
    public void setaPlaylist(List<Brano> aPlaylist) {
        this.aPlaylist = aPlaylist;
    }

    @Override
    public String toString() {
        return "Playlist [playlist=" + aPlaylist + "]";
    }

    public String toXml() {
        String xml="";
        for(Brano brano : this.aPlaylist){
            xml += brano.toXml();
        }
        xml = "<playlist>\n" + xml + "</playlist>";
        return xml;
    }

    public void scriviXml(){
        BufferedWriter bw = null;
        try {

            bw = new BufferedWriter(new FileWriter(FILE_NAME));
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
            File file = new File(Playlist.FILE_NAME);
            JAXBContext jaxbContext = JAXBContext.newInstance(Playlist.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(this, file);
            jaxbMarshaller.marshal(this, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }


    public void unmarshallingXml() {
        try {
            File file = new File(Playlist.FILE_NAME);
            JAXBContext jaxbContext = JAXBContext.newInstance(Playlist.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Playlist playlist = (Playlist) jaxbUnmarshaller.unmarshal(file);
            System.out.println(playlist);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }


    private void simulaPlaylist() {

        Brano brano1 = new Brano("b1", 3);
        this.addBrano(brano1);
        Brano brano2 = new Brano("b2", 2);
        this.addBrano(brano2);
        Brano brano3 = new Brano("b3", 4);
        this.addBrano(brano3);
        Brano brano4 = new Brano("b4", 3);
        this.addBrano(brano4);

    }

    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        playlist.simulaPlaylist();
        //playlist.marshallingXml();

    }

    public void caricaTabella(DefaultTableModel tableModelBrano) {
        for(Brano brano: this.aPlaylist) {
            tableModelBrano.addRow(new Object[] {brano.getNome(), brano.getDurata()});
        }
    }

}

