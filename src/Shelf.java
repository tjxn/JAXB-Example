/**
 * Created on 2016-08-17
 *
 * @author tjackson
 */

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


//Below annotation defines root element of XML file
@XmlRootElement
//You can define order in which elements will be created in XML file
//Optional
@XmlType(propOrder = { "booksOnShelf"})
public class Shelf {

    private ArrayList<Book> booksOnShelf;

    public Shelf() {
        booksOnShelf = new ArrayList<Book>();
    }

    @XmlElement
    public ArrayList<Book> getBooksOnShelf() {
        return booksOnShelf;
    }

    // XmLElementWrapper generates a wrapper element around XML representation
    @XmlElementWrapper(name = "bookList")
    // XmlElement sets the name of the entities in collection
    @XmlElement(name = "book")
    public void placeBookOnShelf(Book book){
        booksOnShelf.add(book);
    }

    @XmlElement
    public void removeBookOnShelf(Book toRemove){
        for (Book onShelf: booksOnShelf) {
            if (onShelf.getTitle() == toRemove.getTitle()){
                booksOnShelf.remove(onShelf);
            }
        }
    }
}
