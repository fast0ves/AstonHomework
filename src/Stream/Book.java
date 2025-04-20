package Stream;

public class Book {
    private Integer yearOfRealese;
    private String name;
    private Integer page;

    public Book(Integer yearOfRealese, String name, Integer page) {
        this.yearOfRealese = yearOfRealese;
        this.name = name;
        this.page = page;
    }

    public Integer getPage() {
        return page;
    }

    public Integer getYearOfRealese() {
        return yearOfRealese;
    }


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", page=" + page +
                ", yearOfRealese=" + yearOfRealese +
                '}';
    }
}