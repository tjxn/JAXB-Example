/**
 * Created on 2016-08-17
 *
 * @author tjackson
 */

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//Below annotation defines root element of XML file
@XmlRootElement(name = "Shelf")
public class Shelf {

    @XmlElement(name = "Book")
    private ArrayList<Book> booksOnShelf;

    public Shelf() {
        booksOnShelf = new ArrayList<Book>();
    }

    public ArrayList<Book> getBooksOnShelf() {
        return booksOnShelf;
    }

    public void placeBookOnShelf(Book book){
        booksOnShelf.add(book);
    }

    public void removeBookOnShelf(Book toRemove){
        for (Book onShelf: booksOnShelf) {
            if (onShelf.getTitle() == toRemove.getTitle()){
                booksOnShelf.remove(onShelf);
            }
        }
    }
}
