package Classwork_24.xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.Date;

public class WriteXML {
    public static void main(String[] args) {

        Books books = new Books();

        Book book = new Book();
        book.setId(1L);
        book.setName("Name");
        book.setDate(new Date());



        Book book2 = new Book();
        book2.setId(2L);
        book2.setName("Name123");
        book2.setDate(new Date());

        books.addBook(book);
        books.addBook(book2);

        try {
            JAXBContext context = JAXBContext.newInstance(Books.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(books,new File("src/files/books.xml"));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}
