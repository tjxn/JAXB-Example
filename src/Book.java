/**
 * Created on 2016-08-17
 *
 * @author tjackson
 */

import javax.xml.bind.annotation.XmlRootElement;

//Below statement means that class "Country.java" is the root-element of our example
@XmlRootElement(namespace = "Book")
public class Book {

    private String title;
    private String description;
    private String author;
    private int length;

    public Book(){};

    public Book(String title, String description, String author, int length) {
        super();
        this.title = title;
        this.description = description;
        this.author = author;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
