/**
 * Created on 2016-08-17
 *
 * @author tjackson
 */

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JAXBToXml {

    public static void main(String[] args){

        // Create Shelf
        Shelf myShelf = new Shelf();

        // Create Books
        Book sherlock = new Book("The Adventures of Sherlock Holmes", "Genius uses " +
                "observation and reason to solve crimes", "Arthur Conan Doyle", 339);
        Book twentyThousandLeagues = new Book("Twenty Thousand Leagues under the Sea", "Dr. Aronnax meets Capt. Nemo " +
                "and his amazing submarine, the Nautilus", "Jules Verne", 394);

        // Place Books on Shelf
        myShelf.placeBookOnShelf(sherlock);
        myShelf.placeBookOnShelf(twentyThousandLeagues);

        try{
            // create JAXB context and initializing Marshaller
            JAXBContext jaxbContext = JAXBContext.newInstance(Shelf.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // for getting nice formatted output
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            //specify the location and name of xml file to be created
            File XMLfile = new File("/Users/tjackson/gs-consuming-web-service/java-SOAP-Example/src/myShelfRecord.xml");

            // Writing to XML file
            jaxbMarshaller.marshal(myShelf, XMLfile);
            // Writing to console
            jaxbMarshaller.marshal(myShelf, System.out);

        }catch(JAXBException e){
            e.printStackTrace();
        }

    }
}
