import java.util.Objects;

public class TelephoneBook {
    private String name;
    private int telephoneNumber;

    public TelephoneBook() {
    }

    public TelephoneBook(String name, int telephoneNumber) {
        this.name = name;
        this.telephoneNumber = telephoneNumber;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TelephoneBook that = (TelephoneBook) o;
        return Objects.equals(telephoneNumber, that.telephoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, telephoneNumber);
    }

    @Override
    public String toString() {
        return "TelephoneBook{" +
                "name='" + name + '\'' +
                ", telephoneNumber=" + telephoneNumber +
                '}';
    }
}
