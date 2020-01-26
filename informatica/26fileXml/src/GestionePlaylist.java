
import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class GestionePlaylist {

    public static void main(String[] args) {

        try {
            Playlist playlist = new Playlist();

            Brano b1= new Brano();
            b1.setIdBrano(1);
            b1.setNomeBrano("io");
            b1.setNomeArtista("ciao");

            Brano b2= new Brano();
            b2.setIdBrano(2);
            b2.setNomeBrano("io");
            b2.setNomeArtista("ciao");

            playlist.add(b1);
            playlist.add(b2);

            File  file = new File("/Users/samuelegiraudo/Desktop/IdeaProjects/Playlist.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Playlist.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(playlist, file);
            jaxbMarshaller.marshal(playlist, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }

}
