package Lab2;
import java.util.*;

import Lab2.*;


public class Library {
    Hashtable<Integer, Book> allBooks;
    Hashtable<Integer, Person> allPersons;
        public ArrayList<Book> findByGenre(String genreName) {
            Collection all = this.allBooks.values();
            Book temp;
            ArrayList<Book> rez = new ArrayList<Book>();
            for(Object o:all) {

                temp = (Book) o;
                if(temp.getGenre()==genreName) {
                    rez.add(this.allBooks.get(temp.getID()));
                }
            }
            return  rez;
        }
        public ArrayList<Book> booksWhichNotInLibrary()
        {
            Collection all = this.allBooks.values();
            Book temp;
            ArrayList<Book> rez = new ArrayList<Book>();
                for(Object o:all) {

                    temp = (Book) o;
                    if(temp.getDateOfIssue()!=null) {
                        rez.add(this.allBooks.get(temp.getID()));
                    }
                }
                return  rez;



        }
        public Date whenBookMustBeReturned(int Identification) {
            Date datewhenReturn;
                try {
                    datewhenReturn = allBooks.get(Identification).getDateOfIssue();
                }
                catch (RuntimeException e) {
                    throw new IllegalArgumentException("We haven't this book in Library");
                }

            return datewhenReturn;
        }
        public Hashtable<Integer,Book> howMuchBooksRemainsInLibrary(String name) {
            return this.allBooks;
        }
        public String[] booksInPerson(int personId) {
            return  allPersons.get(personId).getBooksInPerson();
        }
        public Book getInfoAboutBook(String booksName) {
            return this.allBooks.get(booksName.hashCode());
        }
        public void addBook(Book newBook) {
            try {
                this.allBooks.put(newBook.hashCode(), newBook);
            }
            catch(RuntimeException e) {
                throw new IllegalArgumentException("You trying add empty book");
            }
        }

    public Library(Hashtable<Integer, Book> allBooks) {
        this.allBooks = allBooks;
    }
    public Library() {
        this.allBooks = new Hashtable<Integer,Book>();
    }
    public static void main(String[] args){
        Library l = new Library();
        Book b = new Book(1, "name", "i", "small", "scare", 1928, 330);
        l.addBook(b);
        ArrayList<Book> al = new ArrayList<Book>();

        al = l.findByGenre("scare");

    }
}
