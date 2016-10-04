package Lab2;

import java.util.Date;


public class Book {
    private int ID;
    private String name;
    private String author;
    private String cover;
    private String genre;
    private int yearOfPublication;
    private int countOfPages;
    private Date dateOfIssue;
    private Date admissionDate;


    public static void main(String[] args){
        System.out.print("Book");
    }

    public Book(int ID, String name, String author, String cover, String genre, int yearOfPublication, int countOfPages) {
        this.ID = ID;
        this.name = name;
        this.author = author;
        this.cover = cover;
        this.genre = genre;
        this.yearOfPublication = yearOfPublication;
        this.countOfPages = countOfPages;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getCover() {
        return cover;
    }

    public String getGenre() {
        return genre;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public int getCountOfPages() {
        return countOfPages;
    }

    public Date getDateOfIssue() {
        return dateOfIssue;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public void setDateOfIssue(Date dateOfIssue) {

        this.dateOfIssue = dateOfIssue;
    }

    public void setCountOfPages(int countOfPages) {

        this.countOfPages = countOfPages;
    }

    public void setYearOfPublication(int yearOfPublication) {

        this.yearOfPublication = yearOfPublication;
    }

    public void setGenre(String genre) {

        this.genre = genre;
    }

    public void setCover(String cover) {

        this.cover = cover;
    }

    public void setAuthor(String author) {

        this.author = author;
    }

    public void setName(String name) {

        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return ID == book.ID;

    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

}

