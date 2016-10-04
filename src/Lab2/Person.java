package Lab2;

/**
 * Created by roma on 04.10.16.
 */
public class Person {
    private int ID;
    private String booksInPerson[];
    private String firstName;
    private String secondName;
    private String adress;
    private String mobileNumber;
    private int ages;

    public Person(int ID, String[] booksInPerson, String firstName, String secondName, String adress, String mobileNumber, int ages) {
        this.ID = ID;
        this.booksInPerson = booksInPerson;
        this.firstName = firstName;
        this.secondName = secondName;
        this.adress = adress;
        this.mobileNumber = mobileNumber;
        this.ages = ages;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public int getAges() {
        return ages;
    }

    public void setAges(int ages) {
        this.ages = ages;
    }

    public String[] getBooksInPerson() {
        return booksInPerson;
    }

    public void setBooksInPerson(String[] booksInPerson) {
        this.booksInPerson = booksInPerson;
    }

    @Override
    public int hashCode() {
        return this.ID;
    }
}
